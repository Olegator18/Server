package com.example.Server.utils;

import com.example.Server.entity.PublisherEntity;
import com.example.Server.exception.ValidationExceptionPublisher;

public class PublisherValidationUtils {
    public static void validationPublisher(PublisherEntity data) throws ValidationExceptionPublisher{
        String title = data.getPublisher();
        if(title == null || title.isBlank()){
            throw new ValidationExceptionPublisher("Название должно быть пустым");
        }
        String city = data.getCity();
        if(city == null || city.isBlank()){
            throw new ValidationExceptionPublisher("Издательство должно иметь адрес");
        }
    }
}
