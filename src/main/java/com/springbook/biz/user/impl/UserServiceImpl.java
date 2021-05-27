package com.springbook.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

@Service("userService")	// Annotation을 사용한 userService
public class UserServiceImpl implements UserService {
	
	@Autowired	// Annotation을 사용한 User객체 자동생성
	private UserDAO userDAO;
	
	// setterInjection 추가
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}

}
