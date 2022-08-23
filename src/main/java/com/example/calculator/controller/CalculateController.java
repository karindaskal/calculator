package com.example.calculator.controller;

import com.example.calculator.model.Arithmetic;
import com.example.calculator.model.Result;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


public interface CalculateController {
    public ResponseEntity<Result> calculate(@PathVariable("num1") double num1,@PathVariable("num2") double num2,@PathVariable("art") String art);

}
