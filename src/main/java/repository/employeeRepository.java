package com.csb.samplefullstack.repository;

import com.FullStackSample.entity.Employee;
import org.springframework.data.jpa.repository.Jparepository;
import org.springframework.stereotype.Repositroy;

@repository
public interface employeeReposity extends JpaRepository <Employee, Long> {

}