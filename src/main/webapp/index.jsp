<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'index.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript"
	src="jslib/jquery-easyui-1.3.6/jquery.min.js"></script>
<script type="text/javascript"
	src="jslib/jquery-easyui-1.3.6/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="jslib/jquery-easyui-1.3.6/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet"
	href="jslib/jquery-easyui-1.3.6/themes/default/easyui.css"
	type="text/css"></link>
<link rel="stylesheet" href="jslib/jquery-easyui-1.3.6/themes/icon.css"
	type="text/css"></link>
<script type="text/javascript" src="jslib/Gutils/Gjs.js"></script>

</head>

<body class="easyui-layout">
	<div data-options="region:'center',title:'center-title'"
		style="padding:5px,background:#eee;  "></div>

	<div data-options="region:'north'"
		style="padding:5px,background:#eee;height: 60px"></div>

	<div data-options="region:'south'"
		style="padding:5px,background:#eee;height: 40px"></div>

	<div data-options="region:'west',title:'功能书',border:false" class="easyui-panel" style="padding:5px,background:#eee;width: 200px">
		
			<div class="easyui-accordion" data-options="fit:true">
				<div title="Title1" data-options="iconCls:'icon-save'"style="overflow:auto;padding:10px;">
					<div><ul id="tt" class="easyui-tree" data-options="url:'menuAction!getTree.action'"></ul>
					</div>
				</div>
				<div title="Title2"data-options="iconCls:'icon-reload',selected:true"style="padding:10px;">content2</div>
			</div>

		
	</div>

	<div data-options="region:'east'"
		style="padding:5px,background:#eee; width: 200px">
		<div class="easyui-panel"
			data-options="title:'east',border:false,fit:true"></div>
	</div>
	<jsp:include page="user/login.jsp"></jsp:include>
	<jsp:include page="user/reg.jsp"></jsp:include>
</body>
</html>
