package cn.dawnland.servicezuul8769.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @RequestMapping("local")
    public String hello() {
        return "hello api gateway";
    }

}
