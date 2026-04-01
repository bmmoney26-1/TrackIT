package com.trackIT.controller;


import com.trackIT.BootcampApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blockers")
public class BlockerController {
    @Autowired
    private BootcampApp bootcampApp;




}
