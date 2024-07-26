package com.ust.Security.repo;

import com.ust.Security.model.Userinfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepo extends JpaRepository<Userinfo,Long> {
}
