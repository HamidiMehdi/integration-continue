package com.mehdi.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/salut")
    public String index() {
        return "salut John Doe";
    }

}
