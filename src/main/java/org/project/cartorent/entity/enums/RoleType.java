package org.project.cartorent.entity.enums;

public enum RoleType {
    ADMIN("Admin"),
    EMPLOYEE("Employee"),
    MEMBER("Member");

    private final String name;

    RoleType(String name) {
        this.name = name;
    }
}
