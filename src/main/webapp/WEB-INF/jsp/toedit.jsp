<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>

</head>
<body>
<form action="/user/setUserById" method="post">
    <input name="userId" type="hidden" value="${user.userId}"/></br>
    <input name="userName" type="text" value="${user.userName}"/></br>
    <input name="realName" type="text" value="${user.realName}"/></br>
    <input name="userPhone" type="text" value="${user.userPhone}"/></br>
    <input name="userAddress" type="text" value="${user.userAddress}"/></br>
    <input name="userSex" type="text" value="${user.userSex}"/></br>
    <input name="mooto" type="text" value="${user.mooto}"/></br>
    <input type="submit" value="修改"/>
</form>
</body>

</html>

