package com.iTree.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.iTree.action.UserAction;

public class TestUserAction {

	@Test
	public void testAddStudent() {
		UserAction useraction = new UserAction();
		useraction.addStudent();
	}

}
