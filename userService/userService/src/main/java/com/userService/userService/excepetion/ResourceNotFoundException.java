package com.userService.userService.excepetion;

public class ResourceNotFoundException extends RuntimeException {
    ResourceNotFoundException()
    {
        super("Resource Not Found");
    }
    public ResourceNotFoundException(String massege)
    {
        super(massege);
    }
}
