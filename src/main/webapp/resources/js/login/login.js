$(document).ready(function() {
	$('#login').click(function(event) {
		/* $(".pr-wrap").removeClass("show-pass-reset"); */
		debugger;
		var id = $('#id').val();
		var password = $('#password').val();

		var allData = {
			"id" : id,
			"password" : password
		};

		$.ajax({
			url : "login",
			type : "POST",
			data : allData,
			success : function(data) {
				alert("성공!")
			},
			error : function(jdXHR, textStatus, errorThrown) {
				alert("실패  ---------" + textStatus + ":" + errorThrown);
				self.close();
			}
		});
	});
});