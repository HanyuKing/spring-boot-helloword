package com.why.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanghanyu
 * @create 2017-12-08 11:12
 */
@RestController
public class WebTest {
    @Autowired
    private ServiceTest serviceTest;

    @RequestMapping("/")
    public String home() {
        return serviceTest.test();
    }
}
