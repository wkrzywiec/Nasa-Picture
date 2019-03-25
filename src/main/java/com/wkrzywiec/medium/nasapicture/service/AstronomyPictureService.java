package com.wkrzywiec.medium.nasapicture.service;

import com.wkrzywiec.medium.nasapicture.model.AstronomyPictureOfDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AstronomyPictureService {

    @Autowired
    private RestTemplate restTemplate;

    public AstronomyPictureOfDay getTodayPicture() {
        return restTemplate.getForObject(
                "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&hd",
                AstronomyPictureOfDay.class);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
