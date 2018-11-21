package cn.dawnland.sericefeign.controller;

import cn.dawnland.sericefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "hi")
    public String sayHi(@RequestParam(required = false, defaultValue = "-feign-") String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }

}
