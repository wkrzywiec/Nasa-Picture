package com.wkrzywiec.medium.nasapicture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NasaPictureController {

    @GetMapping("/")
    public String showTodaysPicture() {
        return "home";
    }
}
