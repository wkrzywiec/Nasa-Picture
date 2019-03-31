package com.wkrzywiec.medium.nasapicture.controller;

import com.wkrzywiec.medium.nasapicture.service.AstronomyPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NasaPictureController {

    @Autowired
    private AstronomyPictureService service;


    @GetMapping("/")
    public String showTodaysPicture(ModelMap model) {
        model.addAttribute("picture", service.getTodayPicture());
        return "picture";
    }
}
