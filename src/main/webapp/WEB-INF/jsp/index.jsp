<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script type="text/javascript" src="/resources/js/common/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="/resources/js/common/bootstrap.min.js"></script>
<script type="text/javascript" src="/resources/js/login/login.js"></script>

<link rel="stylesheet" id="bootstrap-css" href="/resources/css/common/bootstrap.min.css" >
<link rel="stylesheet" href="/resources/css/login/login.css" />

<title>Login</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-12">      
            <div class="wrap" style="text-align: center;">
                <p class="form-title">
                    Sign In</p>
                <form class="login">
                <input type="text" id="id" placeholder="Username" />
                <input type="password" id="password" placeholder="Password" />
                <input type="button" value="Sign In" id="login" class="btn btn-success btn-sm" />
                <div class="remember-forgot">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" />
                                    Remember Me
                                </label>
                            </div>
                        </div>
                    </div>
                </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>