package com.ust.Security.repo;

import com.ust.Security.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Jobrepo extends JpaRepository<Job,Long> {
}
