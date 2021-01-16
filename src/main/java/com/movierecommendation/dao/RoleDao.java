package com.movierecommendation.dao;

import com.movierecommendation.data.ERole;
import com.movierecommendation.data.Role;

public interface RoleDao {
    Role findByName(ERole eRole);
}
