package com.userService.userService.ApiRespones;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.net.http.HttpRequest;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiRespones {
    public String massage;
    public boolean success;
    public HttpStatus status;
}
