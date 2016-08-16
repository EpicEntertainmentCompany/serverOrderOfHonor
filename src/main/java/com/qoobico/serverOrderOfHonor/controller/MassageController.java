package com.qoobico.serverOrderOfHonor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by DENIS on 22.08.2016.
 */
@Controller
@RequestMapping("/massage")
public class MassageController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getMassage(ModelMap model){
        return "My first massage!";
    }
}
