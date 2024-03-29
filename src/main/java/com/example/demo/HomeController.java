package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    EmailService emailService;


    @RequestMapping("/")
    public String GetIndex(){

        return "index";
    }

    @PostMapping("/sendSimpleEmail")
        public String SendSimpleEmail(@RequestParam("reasonText") String reasonText){
        Email email = new Email();
        email.setReasonText(reasonText);
        emailService.SendSimpleEmail(email);
            return "success";
        }
    }

