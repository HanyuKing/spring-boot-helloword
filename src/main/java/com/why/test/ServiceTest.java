package com.why.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wanghanyu
 * @create 2017-12-08 11:09
 */
@Service
public class ServiceTest {

    @Autowired
    private ReponsitoryTest reponsitoryTest;

    public String test() {
        return reponsitoryTest.test();
    }
}
