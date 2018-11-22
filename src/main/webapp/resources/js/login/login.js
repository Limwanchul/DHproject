$(document).ready(function() {
	$('#login').click(function(event) {
		var id = $('#id').val();
		var password = $('#password').val();
		
		var allData = {
			"id" : id,
			"password" : password
		};

		$.ajax({
			url : "/login",
			type : "POST",
			data : allData,
			success : function(data) {
				if(data == 0){
					alert("아이디를 확인하세요.")
				}
				if(data == 1){
					alert("비밀번호를 확인하세요.")
				}
				if(data == 2){
					location.href = "/calendar";
				}
			},
			error : function(request, status, error) {
				alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error); 
			}
		});
	});
});