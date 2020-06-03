package me.jh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeContorller {

    @RequestMapping(value="/",method= RequestMethod.GET)
    public String index(){

        return "index";
    }

    @RequestMapping(value="/join",method=RequestMethod.POST)
    public String join(String joinId, String joinPw){

        System.out.printf("JOIN :  ID : %s PW : %s \n",joinId, joinPw);
        return "redirect:/";
    }
    @RequestMapping(value="/login",method=RequestMethod.POST)
    public String login(String loginId, String loginPw){

        System.out.printf("LOGIN :  ID : %s PW : %s \n",loginId, loginPw);
        return "redirect:/";
    }
}
