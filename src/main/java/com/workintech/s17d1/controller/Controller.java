package com.workintech.s17d1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {

@GetMapping("/test")
public String test(){
    return "Server is working";
}

}
