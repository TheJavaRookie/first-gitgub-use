package com.xingxing.mybatisdemo.controll;

import com.xingxing.mybatisdemo.pojo.Person;
import com.xingxing.mybatisdemo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author star
 * @date 2022/3/3 17:56
 * @since 1.0.0
 */

@Api(tags = "首页查询")
@RestController
public class indexControll {


    UserService userService;

    @Autowired
    indexControll(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("test")
    public String test() throws InterruptedException {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Thread.sleep(3000);
        stopWatch.stop();
        System.out.println(stopWatch.getTotalTimeSeconds() + " -- " + Thread.currentThread().getId());
        return "hello world";
    }
    @ApiOperation("添加用户")
    @GetMapping("add")
    public String index() {
        Person person = new Person(null, "star", 122);
        int result = userService.insertUser(person);
        System.out.println(person.getId());
        return "hello world";
    }

    @GetMapping("map")
    public String addBymap() {
        Map<String, Object> map = new HashMap<>();
        map.put("id", null);
        map.put("usn", "aaa");
        map.put("age", 19);
        userService.insertUserByMap(map);
        System.out.println(map.get("id"));
        return "hello world";
    }

    @GetMapping("delete")
    public String deleteMore() {
        int result = userService.deleteMore("1,2,3");
        System.out.println(result);
        return "success";
    }

    @GetMapping("selectMore")
    public String selectMore() {
        List<Person> result = userService.selectMore("ar");
        System.out.println(result);
        return "success";
    }

    @GetMapping("select")
    public String getUser() {
        return userService.getUser().toString();
    }

    @GetMapping("insertMore")
    public int insertMore() {
        List<Person> peoples = new ArrayList<>();
        for (int a = 0; a < 10; a++) {
            Person p = new Person();
            p.setUsn("s" + a);
            p.setAge(20 + a);
            peoples.add(p);
        }
        return userService.insertMore(peoples);
    }
}
