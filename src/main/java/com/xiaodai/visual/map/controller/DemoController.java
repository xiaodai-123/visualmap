package com.xiaodai.visual.map.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * GPS 数据操作控制器
 *
 * @author xiaodai
 */
@Controller
@RequestMapping(value = "/demo")
public class DemoController extends BaseController {

    @RequestMapping("page")
    public String demoPage(){
        return "demo";
    }

    @RequestMapping("hello")
    @ResponseBody
    public String helloVisualMap() {
        return "你好，小呆~";
    }

    @RequestMapping(value = "get", method = RequestMethod.GET)
    @ResponseBody
    public String getDemo() {
        return "是一个GET请求";
    }

    @RequestMapping(value = "post", method = RequestMethod.POST)
    @ResponseBody
    public String postDemo() {
        return "是一个POST请求";
    }
}
