package com.data.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.data.ILoginDao;
@Repository
public class LoginDaoImpl implements ILoginDao{
@Autowired
private JdbcTemplate jdbcTemplate;

@Override
public boolean checkUser(String username, String password) 
{
	String sql="select count(*) from logintab where username=?,password=?";
	Integer i = jdbcTemplate.queryForObject(sql, Integer.class, username,password);
	if(i==1) 
	{
		return true;
	}
	return false;
}

}
