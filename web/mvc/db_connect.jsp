<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="kr.co.bit.database.ConnectionManager" %>
<%@ page import="kr.co.bit.dao.MemberDAO" %><%--
  Created by IntelliJ IDEA.
  User: Huxx_j
  Date: 2018. 4. 5.
  Time: 오후 2:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>DB Connetor</title>
</head>
<body>
<%
    MemberDAO dao = new MemberDAO();
    dao.selectAll();
%>
</body>
</html>
