<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1,user-scalable=0">
    <title>用户中心</title>
    <link href="/static/css/bootstrap.min.css"
          rel="stylesheet" type="text/css">
    <link href="/static/css/style.css" rel="stylesheet"
          type="text/css">
    <style type="text/css">
        ./* vertical-alignment-helper {
    display:table;
    height: 100%;
    width: 100%;
    pointer-events:none; /* This makes sure that we can still click outside of the modal to close it */
        }
        .vertical-align-center {
            /* To center vertically */
            display: table-cell;
            vertical-align: middle;
            pointer-events:none;
        }
        .modal-content {
            /* Bootstrap sets the size of the modal in the modal-dialog class, we need to inherit it */
            width:inherit;
            height:inherit;
            /* To center horizontally */
            margin: 0 auto;
            pointer-events: all;
        } */
        #smsConfirmModel{
            max-width: 330px;
            margin: auto;
        }
        .custom-made-login{
            background: #3DE1AD;
            color: #fff;
            text-transform: uppercase;
            font-weight: 300;
            font-family: 'Open Sans', sans-serif;
            box-shadow: 0 4px #00E500;
            margin-bottom: 20px;
        }
        .custom-made-signIn{
            background: #3DE1AD;
            color: #fff;
            text-transform: uppercase;
            font-weight: 300;
            font-family: 'Open Sans', sans-serif;
            box-shadow: 0 4px #00E500;
            margin-bottom: 20px;
        }
    </style>
</head>
<body class="login-body">
<div class="container" style="width: 98%; ">
    <input type="hidden" id="targetUrl" value="${target!}">
    <form id="formId" class="form-signin" action="/login" method="POST">
        <h2 class="form-signin-heading" style="background-color: #FF2D51">账户密码登陆</h2>
			<#if errorMessage??>
			<div class="element-form text-xs-center">
                <label id="login-error" class="col-lg-12 col-sm-12 col-md-12 text-center" style="color: #0ffbfe;"></label>
            </div>
            </#if>
        <div class="login-wrap">
            <input type="text" class="form-control not_submit_input" id="username_input" placeholder="请输入用户名" style="background-color: #EEDEB0" autofocus>
            <input type="password" class="form-control not_submit_input" id="password_input" placeholder="请输入密码" style="background-color: #EEDEB0">
            <div style="display: inline-block;width: 100%">
                <div style="width:50%;display: inline-block">
                    <div id="v_container" style="width:100%;"></div>
                </div>
                <div style="width:50%;float: right">
                    <input type="text" class="form-control not_submit_input" id="verification-code" placeholder="验证码" style="width:100%;background-color: #EEDEB0">
                </div>
            </div>
            <input type="hidden" id="salt" value="" disabled="disabled">
            <input type="hidden" id="username_submit" name="jusername" value="">
            <input type="hidden" id="password_submit" name="jpassword" value="">
            <div style="display: inline-block;width: 100%">
                <button class="btn btn-lg custom-made-login" id="loginBtn" type="button" style="width:49%">登陆</button>
                <button class="btn btn-lg custom-made-signIn" id="signInBtn" type="button" style="width:49%;float: right">注册</button>
            </div>
        </div>
        <label id="loginError"	class="label label-danger"></label>
    </form>
</div>
</body>
<script src="/static/js/jquery-3.5.1.js"></script>
<script src="/static/js/jquery.md5.js"></script>
<script src="/static/js/bootstrap.min.js"></script>
<script src="/static/js/gVerify.js"></script>
<script type="text/javascript">
    var verifyCode = new GVerify("v_container");

    document.getElementById("my_button").onclick = function(){
        var res = verifyCode.validate(document.getElementById("code_input").value);
        if(res){
            alert("验证正确");
        }else{
            alert("验证码错误");
        }
    }
</script>
</html>
