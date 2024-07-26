package com.ust.Security.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="jobinfo")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long jobId;
    private String jobTitle;

}
