package com.jwtExample.controller;

import com.jwtExample.model.People;
import com.jwtExample.service.LessService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class LessController {


    private LessService lessService;

    @GetMapping("/v2")
    public ResponseEntity<List<People>> getAllPeople(){

        List<People> all = lessService.findAll();
        return new ResponseEntity<>(all, HttpStatus.OK);

    }



}
