package com.example.banquesecurity.config;

import com.google.common.collect.Sets;

import java.util.Set;

public enum AppUserRole {
    ADMIN(Sets.newHashSet(AppUserPermission.USER_READ, AppUserPermission.USER_WRITE)),
    USER(Sets.newHashSet(AppUserPermission.USER_READ));


    private final Set<AppUserPermission> permissions;

    AppUserRole(Set<AppUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<AppUserPermission> getPermissions() {
        return permissions;
    }
}
