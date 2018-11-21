package cn.dawnland.sericefeign.fallback;

import cn.dawnland.sericefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name + ";server error";
    }

}
