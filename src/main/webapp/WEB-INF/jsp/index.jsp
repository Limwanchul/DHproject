<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<link href="/resources/css/common/fullcalendar.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="/resources/js/common/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="/resources/js/common/moment.min.js"></script>
<script type="text/javascript" src="/resources/js/common/fullcalendar.js"></script>
<script type="text/javascript" src="/resources/js/common/locale/ko.js"></script>

<style type="text/css">
#box{
width: 100%;
text-align: center;
}

#top{
	display: inline-block;
    height: 80px;
    width: 1570px;
    padding-bottom: 10px;
    background-color: red;
    text-align: center;
    font-size: 55px;
    color: white;
}

#calendar{
	display: inline-block;
	width: 50%;
}
</style>

	<title>index.jsp</title>
</head>
<body>
	<div id="box">
		<div id="top">캘린더</div>
		<div id="calendar"></div>
		<div id="bottom"></div>
	</div>
<script type="text/javascript">
$('#calendar').fullCalendar({
	
});
</script>
</body>
</html>
