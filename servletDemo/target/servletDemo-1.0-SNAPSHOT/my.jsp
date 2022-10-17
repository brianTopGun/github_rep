<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2022-10-09
  Time: 22:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>myjsp</title>
</head>
<body>
<form method="get" action="myservlet.do">
    <table style="margin: 0px auto" width="300px" cellpadding="0px" cellspacing="0px" border="1px">
        <tr>
            <td>用户名</td>
            <td>
                <input type="text" name="username" >
            </td>
        </tr>
        <tr>
            <td>密码</td>
            <td>
                <input type="password" name="pwd">
            </td>
        </tr>
        <tr align="center">
            <td colspan="2">
                <input type="submit" value="登录">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
