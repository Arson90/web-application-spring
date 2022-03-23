package com.example.webapplicationspring.controller;

import com.example.webapplicationspring.service.ValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ValueController {

    private final ValueService valueService;

    @Autowired
    public ValueController(ValueService valueService) {
        this.valueService = valueService;
    }

    @GetMapping("/")
    public ModelAndView getHello() {
        return new ModelAndView("hello");
    }

    @PostMapping(value = "/unique-value")
    public ModelAndView getUniqueValues(@RequestParam String columnName) {
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("data", valueService.findAllDistinctValues(columnName));
        return modelAndView;
    }

    @PostMapping(value = "/duplicate-value")
    public ModelAndView getDuplicateValues(@RequestParam String columnName) {
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("data", valueService.findAllDuplicateValues(columnName));
        return modelAndView;
    }


}
