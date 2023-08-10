package com.example.accessingdatamysql;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.Instant;

@Entity
public class Job {
    @Id
    private Long id;

    private Instant createTime;
}
