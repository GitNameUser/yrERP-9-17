package com.yr.role.service;

import com.yr.entitys.Roles;
import com.yr.entitys.bo.RolesBO;
import com.yr.entitys.page.Page;

public interface RoleService {
    Roles getRoleByPage(Page<RolesBO> page);
}
