package com.lilin.fund.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 公司:重庆渝欧跨境电子商务股份有限公司
 *
 * @author LILIN
 * @date 2020/5/16
 */
@RestController
public class TestController {

    @GetMapping("")
    public String test(){
        return "hello-world";
    }

}
