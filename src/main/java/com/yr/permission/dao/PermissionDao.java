package com.yr.permission.dao;

import com.yr.entitys.Permissions;
import com.yr.entitys.bo.PermissionsBO;
import com.yr.entitys.page.Page;

public interface PermissionDao {
    PermissionsBO getPermissionByPage(Page<PermissionsBO> page);
}
