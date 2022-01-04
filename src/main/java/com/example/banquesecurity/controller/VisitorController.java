package com.example.banquesecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class VisitorController {

    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String accueil() {
        return "accueil";
    }

    @RequestMapping(value = {"/compte"}, method = RequestMethod.GET)
    public String compte() {
        return "compte";
    }

    @RequestMapping(value = {"/admin"}, method = RequestMethod.GET)
    public String admin() {
        return "admin";
    }
}
