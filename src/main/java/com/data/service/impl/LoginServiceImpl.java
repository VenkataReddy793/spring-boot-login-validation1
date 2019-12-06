package com.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.ILoginDao;
import com.data.service.ILoginService;
@Service
public class LoginServiceImpl implements ILoginService{
@Autowired
private ILoginDao dao;

@Override
public boolean verifyUser(String username, String password) {
	return dao.checkUser(username, password);
}

}
