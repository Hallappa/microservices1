package com.userService.userService.service;

import com.userService.userService.entity.Hotel;
import com.userService.userService.entity.Rating;
import com.userService.userService.entity.User;
import com.userService.userService.excepetion.ResourceNotFoundException;
import com.userService.userService.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.rmi.server.UID;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class ServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
@Autowired
private RestTemplate restTemplate;

    Logger logger = LoggerFactory.getLogger(ServiceImpl.class);

    @Override


    public User saveUsre(User user) {
        String id= UUID.randomUUID().toString();
        user.setId(id);
        return userRepository.save(user);
    }

    @Override
    public List<User> findUser() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(String id) {
       User user= userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User id is Not Found on Server :"+id));

        Rating[] forobject=restTemplate.getForObject("http://RATINGSERVICE/rating/user/"+user.getId(), Rating[].class);
        logger.info("{}",forobject);
        List<Rating>ratings= Arrays.stream(forobject).toList();
        List<Rating> ratingList=ratings.stream().map(rating ->{
          ResponseEntity<Hotel> foreEntity= restTemplate.getForEntity("http://HOTELSERVICE/hotel/"+rating.getHotelId(), Hotel.class);
        Hotel hotel=foreEntity.getBody();
        logger.info("Response code:{}",foreEntity.getStatusCode());
            rating.setHotel(hotel);
         return  rating;
        } ).collect(Collectors.toList());
        user.setRatings(ratingList);
        return user;
    }
}
