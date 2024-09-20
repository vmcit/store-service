package com.app.storeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.storeservice.entity.Permission;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, String> {}
