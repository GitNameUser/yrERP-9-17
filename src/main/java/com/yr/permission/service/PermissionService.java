package com.yr.permission.service;

import com.yr.entitys.Permissions;
import com.yr.entitys.bo.PermissionsBO;
import com.yr.entitys.page.Page;

public interface PermissionService {
    PermissionsBO getPermissionByPage(Page<PermissionsBO> page);
}
