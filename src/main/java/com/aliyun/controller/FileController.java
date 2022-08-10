package com.aliyun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author davis you
 * @Date 2022/8/9 8:28 PM
 * @Version 1.0
 */
@Controller
@RequestMapping("file")
public class FileController {

    /**
     * 展示所有文件信息
     */
    @GetMapping("showAll")
    public String findAll(){
        return "showAll";
    }

}
