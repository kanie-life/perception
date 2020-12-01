package com.kanie.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：kanie
 * @date ：Created in 2020/12/1 19:26
 */
//Api 用在类上，说明该类的作用。可以标记一个Controller类做为swagger 文档资源。
@Api(tags = "测试swagger")
@RestController
public class HelloController {

    //用在方法上，说明方法的作用，每一个url资源的定义
    @ApiOperation("ceshi")
    //响应配置
    @ApiResponse(code = 200, message = "测试下")
    @GetMapping("/test")
    public String test() {
        return "Hello Swagger!";
    }
}
