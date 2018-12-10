<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<html>
<head>
<link href="/resources/css/common/fullcalendar.css" rel="stylesheet" type="text/css" />
<link href="/resources/css/calendar/calendar.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="/resources/js/common/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="/resources/js/common/moment.min.js"></script>
<script type="text/javascript" src="/resources/js/common/fullcalendar.js"></script>
<script type="text/javascript" src="/resources/js/common/locale/ko.js"></script>

	<title>calendar</title>
</head>
<body onload="printClock()">


	<div id="box">
		<div id="top">캘린더</div>
		<div id="calendar"></div>
		<span style="" id="clock"></span>	
	</div>
<jsp:include page="../common/bottom.jsp" />
<script type="text/javascript">
$('#calendar').fullCalendar({
	
});

function printClock() {
    
    var clock = document.getElementById("clock");            // 출력할 장소 선택
    var currentDate = new Date();                                     // 현재시간
    var calendar = currentDate.getFullYear() + "-" + (currentDate.getMonth()+1) + "-" + currentDate.getDate() // 현재 날짜
    var amPm = 'AM'; // 초기값 AM
    var currentHours = addZeros(currentDate.getHours(),2); 
    var currentMinute = addZeros(currentDate.getMinutes() ,2);
    var currentSeconds =  addZeros(currentDate.getSeconds(),2);
    
    if(currentHours >= 12){ // 시간이 12보다 클 때 PM으로 세팅, 12를 빼줌
    	amPm = 'PM';
    	currentHours = addZeros(currentHours - 12,2);
    }

    if(currentSeconds >= 50){// 50초 이상일 때 색을 변환해 준다.
       currentSeconds = '<span style="color:#de1951;">'+currentSeconds+'</span>'
    }
    clock.innerHTML = currentHours+":"+currentMinute+":"+currentSeconds +" <span style='font-size:20px;'>"+ amPm+"</span>"; //날짜를 출력해 줌
    
    setTimeout("printClock()",1000);         // 1초마다 printClock() 함수 호출
}

function addZeros(num, digit) { // 자릿수 맞춰주기
	  var zero = '';
	  num = num.toString();
	  if (num.length < digit) {
	    for (i = 0; i < digit - num.length; i++) {
	      zero += '0';
	    }
	  }
	  return zero + num;
}

</script>
</body>
</html>