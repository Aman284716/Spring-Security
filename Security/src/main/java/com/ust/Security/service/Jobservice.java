package com.ust.Security.service;

import com.ust.Security.model.Job;
import com.ust.Security.model.Userinfo;
import com.ust.Security.repo.Jobrepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Jobservice {
    @Autowired
    Jobrepo jobrepo;

    public Job addJob(Job jobinfo) {
        return jobrepo.save(jobinfo);
    }

    public List<Job> getAllJobs() {
        return jobrepo.findAll();
    }
}
