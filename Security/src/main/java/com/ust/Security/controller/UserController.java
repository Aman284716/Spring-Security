package com.ust.Security.controller;

import com.ust.Security.model.Job;
import com.ust.Security.model.Userinfo;
import com.ust.Security.service.Jobservice;
import com.ust.Security.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
   @Autowired
    private Userservice userService;
   @Autowired
    private Jobservice jobService;

   @PostMapping("/addusers")
    public Userinfo addUser(@RequestBody Userinfo userinfo){
        return userService.addUser(userinfo);
   }

    @PostMapping("/addjob")
    public Job addUser(@RequestBody Job jobinfo){
        return jobService.addJob(jobinfo);
    }

    @GetMapping("/getalljob")
    public List<Job> getAllJobs(){
        return jobService.getAllJobs();
    }
}
