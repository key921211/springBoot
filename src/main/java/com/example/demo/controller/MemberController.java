package com.example.demo.controller;

import com.example.demo.model.MemberModel;
import com.example.demo.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MemberController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    public MemberService memberService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public List<MemberModel> memberList() throws Exception {
        List<MemberModel> member = new ArrayList<MemberModel>();
        member = memberService.memberList();

        logger.info("============================");
        logger.info("MemberController.memberList");
        logger.info("============================");

        return member;
    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@RequestParam int id) throws Exception {

        int cnt = memberService.login(id);
        String result;

        if(cnt > 0){
            result = "OK";
        } else{
            result = "ERROR";
        }


        return result;
    }
}
