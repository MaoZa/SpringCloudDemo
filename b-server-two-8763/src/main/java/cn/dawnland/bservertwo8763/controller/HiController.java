package cn.dawnland.bservertwo8763.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String hi(@RequestParam(value = "name", required = false, defaultValue = "serverTwo")String name){
        return "hi" + name + ":this server two";
    }
}
