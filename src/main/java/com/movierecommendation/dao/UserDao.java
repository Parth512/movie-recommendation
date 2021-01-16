package com.movierecommendation.dao;

import com.movierecommendation.data.User;

public interface UserDao {
    User findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

    User save(User user);
}



