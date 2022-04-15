package com.xingxing.mybatisdemo.controll;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author star
 * @date 2022/4/14 16:21
 * @since 1.0.0
 */
@Api(tags = "注解使用")
@RestController
public class SwaggerControll {

    @GetMapping("index")
    @ApiOperation(value = "接口说明", httpMethod = "GET", response = String.class, notes = "接口发布说明")
    // required = true, name = "参数名称", value = "参数具体描述", dateType = "变量类型", paramType = "请求方式"
    @ApiImplicitParam(required = true, name = "param", value = "用户名")
    @ApiImplicitParams({
            @ApiImplicitParam(required = true, name = "param", value = "用户名"),
            @ApiImplicitParam(required = true, name = "num", value = "数字")
    })
    public String index(String param, int num) {
        System.out.println(param + num);
        return "hello world";
    }

}
