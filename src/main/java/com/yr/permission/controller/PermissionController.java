package com.yr.permission.controller;

import com.yr.entitys.Permissions;
import com.yr.entitys.bo.PermissionsBO;
import com.yr.entitys.page.Page;
import com.yr.permission.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PermissionController {
    @Autowired
    private PermissionService service;

    public PermissionsBO getPermissionByPage(Page<PermissionsBO> page) {
        return service.getPermissionByPage(page);
    }
}
