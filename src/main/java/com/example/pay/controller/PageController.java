package com.example.pay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xin.rf
 * @date 2018/11/28 15:51
 * @Description TODO
 **/
@Controller
public class PageController {

    @RequestMapping("/gototo")
    public String gotoPage(){
        return "gotoWapPay";
    }
}
