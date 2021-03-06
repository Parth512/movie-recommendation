package com.movierecommendation.dao.impl;

import com.movierecommendation.dao.UserDao;
import com.movierecommendation.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public User findByUsername(String username) {
        Query query = new Query(Criteria.where("username").is(username));
        return mongoTemplate.findOne(query,User.class);
    }

    @Override
    public Boolean existsByUsername(String username) {
        Query query = new Query(Criteria.where("username").is(username));
        User user = mongoTemplate.findOne(query,User.class);
        return user != null ? true : false;
    }

    @Override
    public Boolean existsByEmail(String email) {
        Query query = new Query(Criteria.where("email").is(email));
        User user = mongoTemplate.findOne(query,User.class);
        return user != null ? true : false;
    }

    @Override
    public User save(User user) {
        return mongoTemplate.insert(user);
    }
}
