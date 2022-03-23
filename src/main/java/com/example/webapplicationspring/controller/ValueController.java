package com.example.webapplicationspring.controller;

import com.example.webapplicationspring.data.Value;
import com.example.webapplicationspring.service.ValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ValueController {

    private final ValueService valueService;

    @Autowired
    public ValueController(ValueService valueService) {
        this.valueService = valueService;
    }

    @GetMapping(value = "/unique-value/{columnName}")
    public List<Value> getUniqueValues(@PathVariable String columnName) {
        return valueService.findAllDistinctValues(columnName);
    }

    @GetMapping(value = "/duplicate-value/{columnName}")
    public List<Value> getDuplicateValues(@PathVariable String columnName) {
        return valueService.findAllDuplicateValues(columnName);
    }
}
