package com.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class OwnerController {
    
    @GetMapping("/availableDate")
    public String availableDateForm(Model model) {

        model.addAttribute("contents", "restaurant/instAvailableDateForm");
        return "common/subLayout";
    }
}
