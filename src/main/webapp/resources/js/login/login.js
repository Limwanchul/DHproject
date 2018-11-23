$(document).ready(
		function() {	
			/*
			 * function : login()
			 * id, 비밀번호 확인 및 로그인
			 */
			function login() {
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
							dataType : "text",
							success : function(loginFlag) {
								if (loginFlag == 0) {
									alert("아이디를 확인하세요.")
								}
								if (loginFlag == 1) {
									alert("비밀번호를 확인하세요.")
								}
								if (loginFlag == 2) {
									location.href = "calendar";
								}
							},
							error : function(request, status, error) {
								alert("code:" + request.status + "\n"
										+ "message:" + request.responseText
										+ "\n" + "error:" + error);
							}
						});
					};

		// 로그인 버튼 클릭시 login() 호출
		$('#login').click(function(){
			login();
		});	

		// password에서 Enter누르면 login() 호출
		$('#password').keydown(function(e) {
			console.log(e.keyCode);
			if (e.keyCode == 13) {
				login();
				return;
			}
		});
		
		// id에서 Enter누르면 password로 커서이동
		$('#id').keydown(function(e){
			console.log(e.keyCode);
			if(e.keyCode == 13){
				$("#password").focus();
			}
		});
	});
