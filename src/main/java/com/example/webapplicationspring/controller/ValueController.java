package com.example.webapplicationspring.controller;

import com.example.webapplicationspring.dao.ValueDAO;
import com.example.webapplicationspring.repository.ValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ValueController {

    private final ValueDAO valueDAO;

    public ValueController(ValueDAO valueDAO) {
        this.valueDAO = valueDAO;
    }

    @GetMapping("/")
    public ModelAndView getHello() {
        return new ModelAndView("hello");
    }

    @PostMapping(value = "/unique-value")
    public ModelAndView getUniqueValues(@RequestParam String columnName) {
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("data", valueDAO.findAllDistinctValues(columnName));
        return modelAndView;
    }

    @PostMapping(value = "/duplicate-value")
    public ModelAndView getDuplicateValues(@RequestParam String columnName) {
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("data", valueDAO.findAllDuplicateValues(columnName));
        return modelAndView;
    }
}
