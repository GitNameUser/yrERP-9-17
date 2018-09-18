package com.yr.role.dao;

import com.yr.entitys.Roles;
import com.yr.entitys.bo.RolesBO;
import com.yr.entitys.page.Page;

public interface RoleDao {
    Roles getRoleByPage(Page<RolesBO> page);
}
