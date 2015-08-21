package com.iTree.interceptor;


import com.iTree.model.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor {
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		User currentUser = (User) invocation.getInvocationContext().getSession().get("USERLOGIN");
		if (currentUser == null) {
			return Action.LOGIN;
		}
		// 继续向下执行
		return invocation.invoke();
	}
	
}
