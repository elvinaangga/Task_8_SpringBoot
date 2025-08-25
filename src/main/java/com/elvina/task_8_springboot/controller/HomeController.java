package com.elvina.task_8_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
        @GetMapping("/")
        public String home() {
            return "redirect:/users";
        }
    }

