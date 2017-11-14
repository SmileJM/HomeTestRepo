<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
		<title>Home</title>
		<link href="<%= application.getContextPath() %>/resources/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
		<script src="<%= application.getContextPath() %>/resources/jquery/jquery-3.2.1.min.js" type="text/javascript"></script>
		<script src="<%= application.getContextPath() %>/resources/bootstrap-3.3.7/js/bootstrap.min.js" type="text/javascript"></script>
	</head>

	<body>
		<h4>WebApplication Home</h4>
		<hr>
		<a href="web/withoutMeta">Without Meta</a><br>
		<a href="web/withMeta">With Meta</a><br>
		<a href="web/atMediaRule">At Media Rule</a><br>
		<a href="web/mediaAttribute">Media Attribute</a><br>
		<a href="web/mediaFeature">Media Feature</a><br>
		<a href="web/orientation">Orientation</a><br>
		<a href="web/pattern1">Pattern 1</a><br>
		<a href="web/pattern2">Pattern 2</a><br>
		<a href="web/pattern3">Pattern 3</a><br>
		<a href="web/pattern4">Pattern 4</a><br>
	</body>
</html>