package com.example.cv_vault.ServiceImpl;

import com.example.cv_vault.dtos.RoleDto;
import com.example.cv_vault.entities.Role;
import com.example.cv_vault.repositories.RoleRepository;
import com.example.cv_vault.services.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    // make CRUD operations for RoleService

    @Override
    public RoleDto getRoleById(Long id) {
        return roleRepository.getRoleById(id)
                .map(this::toDto)
                .orElse(null);
    }

    @Override
    public RoleDto createRole(RoleDto roleDto) {
        Role role = new Role();
        role.setUserId(roleDto.getUserId());
        role.setRoleName(roleDto.getRoleName());
        roleRepository.save(role);
        return toDto(role);
    }

    @Override
    public RoleDto updateRole(Long id, RoleDto roleDto) {
        Role role = roleRepository.getRoleById(id)
                .orElseThrow(() -> new RuntimeException("Role not found with id: " + id));
        role.setUserId(roleDto.getUserId());
        role.setRoleName(roleDto.getRoleName());
        roleRepository.save(role);
        return toDto(role);
    }

    @Override
    public void deleteRole(Long id) {
        Role role = roleRepository.getRoleById(id)
                .orElseThrow(() -> new RuntimeException("Role not found with id: " + id));
        roleRepository.delete(role);
    }






    public RoleDto toDto(Role role){

        RoleDto roleDto = new RoleDto();
        roleDto.setId(role.getId());
        roleDto.setUserId(role.getUserId());
        roleDto.setRoleName(role.getRoleName());
        return roleDto;
    }
}