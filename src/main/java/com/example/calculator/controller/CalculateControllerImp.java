package com.example.calculator.controller;

import com.example.calculator.model.Arithmetic;
import com.example.calculator.model.CalculatorModel;
import com.example.calculator.model.CalculatorModelImp;
import com.example.calculator.model.Result;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculateControllerImp implements CalculateController{
    CalculatorModel cM= new CalculatorModelImp();

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/{num1}/{num2}/{art}")
    @Override
    public ResponseEntity<Result> calculate(@PathVariable("num1") double num1,@PathVariable("num2") double num2,@PathVariable("art") String art){
        Arithmetic arithmetic =new Arithmetic(num1,num2,art);
        Result result =cM.calc(arithmetic);
        return new ResponseEntity<>(result,HttpStatus.OK);
    }


}
