package com.yr.role.service;

import com.yr.entitys.Roles;
import com.yr.entitys.bo.RolesBO;
import com.yr.entitys.page.Page;
import com.yr.role.dao.RoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao dao;

    @Override
    public Roles getRoleByPage(Page<RolesBO> page) {
        return dao.getRoleByPage(page);
    }
}
