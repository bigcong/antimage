package com.cc.antimage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cong on 2017/8/15.
 */
@RestController
@RequestMapping("chart")
public class ChartController {
    @RequestMapping
    public String chart() {
        return "";
    }


}
