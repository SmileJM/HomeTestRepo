<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
		<title></title>
		<link href="<%= application.getContextPath() %>/resources/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
		<script src="<%= application.getContextPath() %>/resources/jquery/jquery-3.2.1.min.js" type="text/javascript"></script>
		<script src="<%= application.getContextPath() %>/resources/bootstrap-3.3.7/js/bootstrap.min.js" type="text/javascript"></script>
		<style>
			@media screen and (max-width: 767px) {
				body {
					background-color: pink;
				}
			}
			@media screen and (min-width: 768px) and (max-width: 959px){
				body {
					background-color: green;
				}
			}
			@media screen and (min-width: 960px) {
				body {
					background-color: blue;
				}
			}
		</style>
	</head>

	<body>
		<h1>Lorem ipsum dolor sit amet</h1>
		<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
	</body>
</html>