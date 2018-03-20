package com.example.demo.controller;

import com.example.demo.service.AccountService;
import com.example.demo.service.AccountService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account1")
public class AccountController1 {

    @Autowired
    AccountService2 accountService;


    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public String transfer() throws RuntimeException{
        accountService.transfer();

        return "successful";
    }
}
