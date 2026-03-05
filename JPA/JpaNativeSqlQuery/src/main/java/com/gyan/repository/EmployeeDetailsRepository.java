package com.gyan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gyan.entity.EmployeeDetails;

import jakarta.transaction.Transactional;

public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails,Integer> {
	
	//
//	@Query(value="select * from employee", nativeQuery=true)
//	List<EmployeeDetails> getAllEmployeeData();
//	
//	@Query(value="select * from employee where city=?1", nativeQuery=true)
//	List<EmployeeDetails> getAllEmployeeData(String city);
//	
//	@Query(value="select * from employee where country=?1 AND gender=?2", nativeQuery=true)
//	List<EmployeeDetails> getAllEmployeeData(String city, String gender);
	
	@Query(value="select * from employee where city=:city", nativeQuery=true)
	List<EmployeeDetails> getAllEmployeeData(@Param("city") String city);
	
	@Query(value="select * from employee where country=:country AND gender=:gender", nativeQuery=true)
	List<EmployeeDetails> getAllEmployeeData(@Param("country") String country,@Param("gender") String gender);
	
	@Transactional
	@Modifying
	@Query(value="insert into employee values(:id,:name,:age,:salary,:city,:gender,:country)", nativeQuery=true)
	public int insertEmployeeData(@Param("id") int id,@Param("name") String name, @Param("age") int age,
			@Param("salary") double salary,@Param("city") String city,@Param("gender") String gender,@Param("country") String country);
	
	@Transactional
	@Modifying
	@Query(value="delete from employee where emp_id=:id", nativeQuery=true)
	public int deleteEmployeeData(@Param("id") int id);

}
