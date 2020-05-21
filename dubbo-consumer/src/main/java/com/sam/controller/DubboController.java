package com.sam.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sam.service.DubboService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DubboController {

    @Reference
    private DubboService dubboService;

    @RequestMapping("/getString")
    @ResponseBody
    public String getString(){
        String string = dubboService.getString();
        return string;
    }

    @RequestMapping("/getIndex")
    @ResponseBody
    public String getIndex(){
        return "index";
    }
}
