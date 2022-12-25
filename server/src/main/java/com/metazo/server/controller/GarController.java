package com.metazo.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GarController {
    @RequestMapping("/hello")
    public int salut() {
        return 5+3;
    }
}
