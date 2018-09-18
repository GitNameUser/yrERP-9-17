package com.yr.role.controller;

import com.yr.entitys.Roles;
import com.yr.entitys.bo.RolesBO;
import com.yr.entitys.page.Page;
import com.yr.role.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RoleController {

    @Autowired
    private RoleService service;

    public Roles getRoleByPage(Page<RolesBO> page) {
        return service.getRoleByPage(page);
    }
}
