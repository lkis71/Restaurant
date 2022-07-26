package com.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ReserveController {
    
    @GetMapping("/reserve")
    public String reserveForm(Model model) {

        return "user/reserve/reserveForm";
    }
}
