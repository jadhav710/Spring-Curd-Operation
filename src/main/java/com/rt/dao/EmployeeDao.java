package com.rt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.rt.entity.Employee;

@Repository

public class EmployeeDao {
	@Autowired
	JdbcTemplate template;
	public boolean register(Employee e){
		try {
			Object[] args={e.getName(), e.getEmailId(), e.getMobile(), e.getCity(),e.getState(),e.getAddress()};
			int a=template.update("insert into employeedata_spring(`name`,`emailId`,`mobile`,`city`,`state`,`address`) values(?,?,?,?,?,?)",args);
			if(a==1 ){
				return true;
				
			}else{
				return false;
				
			}
		} catch (Exception e2) {
			// TODO: handle exception
		}
		return false;
		
	}
	public boolean update(Employee e){
		try {
			
		
			Object [] args={e.getName(),e.getEmailId(),e.getMobile(),e.getCity(),e.getState(),e.getAddress(),e.getId() };
			int a= template.update("update employeedata_spring set name=?, emilId=?, mobile=?,city=?,state=?,address=?, where id=?" , args);
			if(a == 1){
				return true;
			}else{
				return false;
			}
			
		} catch (Exception e2) {
			// TODO: handle exception
		}
		return false;
		
	}
	
	public  Employee selectEmployeeById(int id){
		Employee e= null;
		try {
			Object [] args={id};
			e=template.queryForObject("select * from employeedata_spring where id =?" , args, new RowMapper<Employee>(){

				public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
					
					return  new Employee(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5),
							rs.getString(6), rs.getString(7));
					
				}
				
			});
		} catch (Exception e2) {
			// TODO: handle exception
		}
		return e;
	}
	public List<Employee> selectAllEmployees() {
		List<Employee>  list = null;
		try {
			list = template.query("select * from employeedata_sprig", new RowMapper<Employee>(){

				public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
					
					// TODO Auto-generated method stub
					return new Employee(rs.getInt(1),rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
					
				}
				
			});
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
