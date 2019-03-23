package com.wkrzywiec.medium.nasapicture;

import com.wkrzywiec.medium.nasapicture.model.AstronomyPictureOfDay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class NasapictureApplication {

	private static final Logger log = LoggerFactory.getLogger(NasapictureApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(NasapictureApplication.class, args);

		RestTemplate restTemplate = new RestTemplate();
		AstronomyPictureOfDay response = restTemplate.getForObject("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&hd", AstronomyPictureOfDay.class);
		log.info(response.toString());
	}

}
