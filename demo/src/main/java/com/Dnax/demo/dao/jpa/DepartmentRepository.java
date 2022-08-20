package com.Dnax.demo.dao.jpa;

import com.Dnax.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;
@RepositoryRestResource(
        path = "departments",
        collectionResourceRel = "departments",
        itemResourceRel = "department")
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    @RestResource(rel="byName", path="byName")
    List<Department> findUserByName(@Param("name")String name);

}
