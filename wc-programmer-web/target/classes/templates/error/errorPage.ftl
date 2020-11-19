<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="description" content="bootstrap default admin template">
    <meta name="viewport" content="width=device-width">
    <title>Error | Free Sorry</title>
    <link href="/static/css/error.css" rel="stylesheet" type="text/css">
</head>

<body>
<div class="da-wrapper">
    <div class="da-content">
        <div class="da-container clearfix">
            <div class="da-error-wrapper">
                <div class="da-error-pin"></div>
                <div class="da-error-code">
                    <p class="tip">STATUS:<#if status??>${status}.<#else>404.</#if></p>
                    <p class="tip2">网络开小差了<br/>\(*^▽^*)/</p>
                    <p class="tip3" style="padding-top: 0px"><#if famousSaying??>${famousSaying}<#else>No man is born wise or learned.</#if></p>
                </div>
                <h1 class="da-error-heading">Sorry, 请稍后再试 !!!</h1>
            </div>
        </div>
    </div>
</div>
</body>
<#--<script type="text/javascript"  src="/static/js/jquery-3.5.1.js"></script>-->
<#--<script type="text/javascript">-->
    <#--$(function () {-->
        <#---->
    <#--})-->
<#--</script>-->
</html>