package com.yr.permission.dao;

import com.yr.entitys.Permissions;
import com.yr.entitys.bo.PermissionsBO;
import com.yr.entitys.page.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class PermissionDaoImpl implements PermissionDao {
    @Autowired
    private EntityManager entityManager;

    @Override
    public PermissionsBO getPermissionByPage(Page<PermissionsBO> page) {
        return null;
    }
}
