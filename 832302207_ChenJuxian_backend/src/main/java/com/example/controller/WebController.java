package com.example.controller;

import com.example.common.Result;
import com.example.service.AdminService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @Resource
    AdminService adminService;


    //  这是一个 get请求的接口
    @GetMapping("/hello") // 接口的路径，全局唯一的
    public Result hello() {
        return Result.success("hello菊仙");  // 接口的返回值
    }

    @GetMapping("/admin") // 接口的路径，全局唯一的
    public Result admin(String name) {
        adminService.admin(name);
        return Result.success("hello菊仙");  // 接口的返回值
    }
}
