package com.Charan.springboot.EmpMgmtSystem.Repository;

import com.Charan.springboot.EmpMgmtSystem.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
