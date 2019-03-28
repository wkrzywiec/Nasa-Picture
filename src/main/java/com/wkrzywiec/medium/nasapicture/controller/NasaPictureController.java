package com.wkrzywiec.medium.nasapicture.controller;

import com.wkrzywiec.medium.nasapicture.model.AstronomyPictureOfDay;
import com.wkrzywiec.medium.nasapicture.service.AstronomyPictureService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NasaPictureController {

    @Autowired
    private AstronomyPictureService service;

    private static Logger LOG = LoggerFactory
            .getLogger(NasaPictureController.class);

    @GetMapping("/")
    public String showMainPage() {

        LOG.info("I'm in the controller - main page");

        return "home";
    }

    @GetMapping("/picture")
    public String showTodaysPicture(ModelMap model) {

        LOG.info("I'm in the controller - picture page");

        AstronomyPictureOfDay astronomyPicture = service.getTodayPicture();
        model.addAttribute("picture", astronomyPicture);
        return "picture";
    }
}
