package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.Error;
import com.greenfoxacademy.frontend.models.ResultArray;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayHandler {


    /*@PostMapping(path = "/arrays")
    public Object recieveArrays(@RequestBody ArrayModel arrayModel) {
        Result newResult = new Result();
        ResultArray newResultArray = new ResultArray();
        if (arrayModel.containsAllFields()) {
            if (arrayModel.isWahtDouble()) {
                newResultArray.multiplyByTwo(arrayModel);
                return newResultArray;
            } else {
                newResult.calculateResult(arrayModel);
                return newResult;
            }
        } else {
            return new Error("Please provide " + arrayModel.whatIsMissing());
        }
    }*/
}
