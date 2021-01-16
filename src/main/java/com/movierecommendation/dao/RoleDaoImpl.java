package com.movierecommendation.dao;

import com.movierecommendation.data.ERole;
import com.movierecommendation.data.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl implements RoleDao {


    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public Role findByName(ERole eRole) {
        Query query = new Query(Criteria.where("name").is(eRole));
        return mongoTemplate.findOne(query,Role.class);
    }
}
