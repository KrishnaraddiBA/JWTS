package com.jwtExample.service;

import com.jwtExample.model.People;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class LessServiceImpl {

    List<People> li=new ArrayList<>();

    public LessServiceImpl() {
        li.add(new People(UUID.randomUUID().toString(),"keshav","Dharwad"));
        li.add(new People(UUID.randomUUID().toString(),"krishna","gadag"));
        li.add(new People(UUID.randomUUID().toString(),"uday","gadag"));
        li.add(new People(UUID.randomUUID().toString(),"shashank","Bangalore"));
    }

    public List<People> findAll(){
        return li;
    }

}
