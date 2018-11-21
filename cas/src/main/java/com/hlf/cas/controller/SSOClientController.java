package com.hlf.cas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ifeng
 * @version 1.0
 * @date 2018/11/21上午11:06
 **/
@RestController
public class SSOClientController {


    @RequestMapping(value = "/test")
    public Object  test(){

        return "jjjjj";
    }
}
