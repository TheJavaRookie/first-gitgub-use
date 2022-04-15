package com.xingxing.mybatisdemo.service;

import com.xingxing.mybatisdemo.pojo.Person;

import java.util.List;
import java.util.Map;

public interface UserService {
    int insertUser(Person person);
    int insertUserByMap(Map<String,Object> map);
    int deleteMore(String ids);
    List<Person> selectMore(String str);
    Person getUser();
    int insertMore(List<Person> person);
}
