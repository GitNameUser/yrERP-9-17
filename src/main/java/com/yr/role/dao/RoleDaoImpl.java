package com.yr.role.dao;

import com.yr.entitys.Roles;
import com.yr.entitys.bo.RolesBO;
import com.yr.entitys.page.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class RoleDaoImpl implements RoleDao {
    @Autowired
    private EntityManager entityManager;

    @Override
    public Roles getRoleByPage(Page<RolesBO> page) {
        return null;
    }
}
