<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <%--<script src="<%=request.getContextPath()%>\WEB-INF\js\jquery-3.3.1.js"></script>--%>

</head>

<body>
<form >
    <table >
        <thead>
        <tr>

            <th style="width: 120px; text-align: center ">
                用户名
            </th>
            <th  style="width: 120px; text-align: center">
                真实姓名
            </th>
            <th  style="width: 120px;text-align: center ">
                联系电话
            </th>
            <th style="width: 120px;text-align: center ">
                地址
            </th>

            <th style="width: 120px; text-align: center">
                座右铭
            </th>

            <th  style="width: 200px; text-align: center">
                操作
            </th>

        </tr>
        </thead>
        <tbody >
        <c:forEach items="${userList}" var="us">
            <tr>
                <input type="hidden" value="${us.userId}" >
                <td style="text-align: center">${us.userName}</td>
                <td style="text-align: center">${us.realName}</td>
                <td style="text-align: center">${us.userPhone}</td>
                <td style="text-align: center">${us.userAddress}</td>
                <td style="text-align: center">${us.mooto}</td>
                <td>
                    <a href="deleteUser?userId=${us.userId}">删除 </a>
                    <a href="selectUserById?userId=${us.userId}">修改 </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</form>

</body>

</html>

