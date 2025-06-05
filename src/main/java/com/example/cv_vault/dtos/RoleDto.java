package com.example.cv_vault.dtos;

public class RoleDto {
    private Long id;
    private Long userId;
    private String roleName;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getRoleName() {
        return roleName;
    }
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    @Override
    public String toString() {
        return "RoleDto{" +
                "id=" + id +
                ", userId=" + userId +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
