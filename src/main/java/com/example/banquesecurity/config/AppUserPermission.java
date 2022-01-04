package com.example.banquesecurity.config;

public enum AppUserPermission {
    USER_READ("user:read"),
    USER_WRITE("user:write");

   private final String permissions;

    AppUserPermission(String permissions) {
        this.permissions = permissions;
    }
}
