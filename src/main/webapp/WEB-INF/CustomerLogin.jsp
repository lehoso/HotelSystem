<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="zh-cmn-Hans">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="renderer" content="webkit">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=no">
    <title></title>
    <link rel="stylesheet" href="../static/MDUI_files/mdui.min.css">
    <link rel="stylesheet" href="../static/MDUI_files/style.css">
    <script>
        var _hmt = _hmt || [];
        (function () {
            var hm = document.createElement("script");
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(hm, s);
        })();
    </script>
    <style></style>
    <style id="style-1-cropbar-clipper">/* Copyright 2014 Evernote Corporation. All rights reserved. */
    .en-markup-crop-options {
        top: 18px !important;
        left: 50% !important;
        margin-left: -100px !important;
        width: 200px !important;
        border: 2px rgba(255, 255, 255, .38) solid !important;
        border-radius: 4px !important;
    }

    .en-markup-crop-options div div:first-of-type {
        margin-left: 0px !important;
    }
    </style>
</head>
<body class="mdui-theme-primary-indigo mdui-theme-accent-pink mdui-loaded" style="">

<!-- 首屏 -->
<div class="main-section mdui-color-theme" style="display: flex;flex-direction: column;">
    <div class="mdui-container main-container" style="display: flex;flex-direction: column;justify-content: center;">
        <h2>
            <br>
            客户登录
        </h2>
        <div class="mdui-center" style="width: 500px;">
            <table style="justify-content: center;margin-left: auto;margin-right: auto;">
                <form action="nameCustomerLogin" method="post">
                    <tr>
                        <td>
                            用户名：
                        </td>
                        <td>
                            <div class="mdui-textfield">
                                <input class="mdui-textfield-input" name="nameCustomerLogin" type="text"
                                       placeholder="用户名" required autofocus/>
                            </div>
                        </td>
                    </tr>

                    <tr>
                        <td>密&nbsp;&nbsp;&nbsp;码：</td>
                        <td>
                            <div class="mdui-textfield">
                                <label>
                                    <input class="mdui-textfield-input" name="passwordCustomerLogin" type="password"
                                           placeholder="密码" required/>
                                </label>
                            </div>
                        </td>
                    </tr>


                    <tr>
                        <td>
                            <button class="mdui-btn mdui-btn-raised mdui-ripple mdui-color-theme-accent"
                                    style="justify-content: center;margin-left: auto;margin-right: auto;width: 200px;">
                                登录
                            </button>
                        </td>
                </form>


                <td>
                    <a href="go?url=bookOnline/Register">
                        <button class="mdui-btn mdui-btn-raised mdui-ripple mdui-color-theme-accent"
                                style="justify-content: center;margin-left: auto;margin-right: auto;width: 200px;">注册
                        </button>
                    </a>
                </td>
                </tr>
            </table>
        </div>
        <br>
    </div>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
</div>

<script src="../static/MDUI_files/mdui.min.js"></script>
<script>
    var $$ = mdui.JQ;

    $$(function () {
        // appbar 自动隐藏
        var $appbar = $$('.mdui-appbar');
        $$(window).on('scroll', function () {
            $appbar[document.body.scrollTop === 0 ? 'addClass' : 'removeClass']('mdui-shadow-0');
        });
    });
</script>
</body>
</html>

