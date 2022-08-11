package com.example.myrestfulservices.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserDaoService {
    private static List<User> users = new ArrayList<>(); //임의로 유저DB 만들기
    private static int usersCount = 3;

    static {
        //유저 생성
        users.add(new User(1, "dohun", new Date()));
        users.add(new User(2, "asdf", new Date()));
        users.add(new User(3, "wdsqr", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if (user.getId() == null) { //유저 아이디가 없으면
            user.setId(++usersCount);
        }

        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for (User user : users) {
            if(user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
