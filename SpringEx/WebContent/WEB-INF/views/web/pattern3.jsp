<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no, maximum-scale=1">
		<title></title>
		<link href="<%= application.getContextPath() %>/resources/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
		<script src="<%= application.getContextPath() %>/resources/jquery/jquery-3.2.1.min.js" type="text/javascript"></script>
		<script src="<%= application.getContextPath() %>/resources/bootstrap-3.3.7/js/bootstrap.min.js" type="text/javascript"></script>
		<style>
			* {
				margin: 0;
				paddind: 0;
			}
			
			body {
				width: 960px;
				margin: 0 auto;
				overflow: hidden;
			}
			
			#menu {
				width: 260px;
				float: left;
			}
			
			#section {
				width: 700px;
				float: right;
			}
			
			li {
				list-style: none;
			}
			
			@media screen and (max-width: 767px) {
				/* 스마트폰 사이즈에서는 전부 해제합니다. */
				body {
					width: auto;
				}
				#menu {
					width: auto;
					float: none;
				}
				#section {
					width: auto;
					float: none;
				}
			}
		
		</style>
	</head>
	
	<body>
		<div id="section">
			<h1>Lorem ipsum dolor sit amet</h1>
			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
		</div>
			
		<div id="menu">
			<ul>
				<li>메뉴A</li>
				<li>메뉴B</li>
				<li>메뉴C</li>				
			</ul>
		</div>
	</body>
</html>