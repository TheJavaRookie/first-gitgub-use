package com.xingxing.mybatisdemo.service.impl;

import com.xingxing.mybatisdemo.dao.UserDao;
import com.xingxing.mybatisdemo.pojo.Person;
import com.xingxing.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author star
 * @date 2022/3/3 18:45
 * @since 1.0.0
 */

@Service
public class UserServiceImpl implements UserService {


    UserDao userDao;
    @Autowired
    UserServiceImpl(UserDao userDao){
         this.userDao =userDao;
    }

    @Override
    public int insertUser( Person person) {

        return userDao.insertUser(person);
    }

    @Override
    public int insertUserByMap(Map<String,Object> map) {
        return userDao.insertUserByMap(map);
    }

    @Override
    public int deleteMore(String ids) {
        return userDao.deleteMore(ids);
    }

    @Override
    public List<Person> selectMore(String str) {
        return userDao.selectMore(str);
    }

    @Override
    public Person getUser() {
        return userDao.getUser();
    }

    @Override
    public int insertMore(List<Person> person) {

        return userDao.insertMore(person);
    }
}
