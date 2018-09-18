package com.yr.permission.service;

import com.yr.entitys.Permissions;
import com.yr.entitys.bo.PermissionsBO;
import com.yr.entitys.page.Page;
import com.yr.permission.dao.PermissionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionDao dao;

    @Override
    public PermissionsBO getPermissionByPage(Page<PermissionsBO> page) {
        return dao.getPermissionByPage(page);
    }
}
