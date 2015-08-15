package com.iTree.service;

import java.io.Serializable;

import com.iTree.model.Users;
import com.iTree.pageModel.User;

public interface UserServiceI {

	Serializable save(User user);
	User login(User user);
}
