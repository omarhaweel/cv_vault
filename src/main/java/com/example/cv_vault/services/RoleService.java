package com.example.cv_vault.services;


import com.example.cv_vault.dtos.RoleDto;

public interface RoleService {
    // CRUD operations for RoleService
    RoleDto getRoleById(Long id);
    RoleDto createRole(RoleDto roleDto);
    RoleDto updateRole(Long id, RoleDto roleDto);
    void deleteRole(Long id);
}