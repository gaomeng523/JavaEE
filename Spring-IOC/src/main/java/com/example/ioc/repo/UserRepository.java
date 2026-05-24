package com.example.ioc.repo;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public String doRepository(){
        return "do Repository...";
    }
}
