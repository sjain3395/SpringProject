package com.example.SpringProject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EmployeeController {

    @RequestMapping("/employee")
    public String  getEmployees()
    {
        return "Hello";
    }

}
