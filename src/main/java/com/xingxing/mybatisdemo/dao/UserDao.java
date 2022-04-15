package com.xingxing.mybatisdemo.dao;

import com.xingxing.mybatisdemo.pojo.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {
    int insertUser(Person person);

    int insertUserByMap(Map<String,Object> map);

    int deleteMore(String ids);

    List<Person> selectMore(String str);

    int insertMore(List<Person> person);

    Person getUser();
}
