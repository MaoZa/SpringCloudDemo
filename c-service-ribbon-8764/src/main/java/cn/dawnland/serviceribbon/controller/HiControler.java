package cn.dawnland.serviceribbon.controller;

import cn.dawnland.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiControler {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "hi")
    public String hi(@RequestParam(required = false, defaultValue = "-ribbon-") String name) {
        return helloService.hiService( name );
    }

}
