package com.xiaodai.visual.map.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 基类控制器啊
 *
 * @author xiaodai
 */
@Controller
@RequestMapping(value = "/visual/map")
public class BaseController {

    @RequestMapping("hello/visual/map")
    @ResponseBody
    public String helloVisualMap() {
        return "你好，小呆~";
    }

}
