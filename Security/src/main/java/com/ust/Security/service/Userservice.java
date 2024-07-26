package com.ust.Security.service;

import com.ust.Security.model.Userinfo;
import com.ust.Security.repo.Userrepo;
import org.springframework.beans.factory.annotation.Autowired;

public class Userservice {
    @Autowired
    private Userrepo userRepository;

    public Userinfo addUser(Userinfo userinfo) {
        return userRepository.save(userinfo);
    }

}
