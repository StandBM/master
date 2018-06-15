<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"  isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit">
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <title></title>
    <style type="text/css">
        *{
            margin:0;
            padding: 0;
        }
        #main{
            width: 400px;
            margin:10px auto;
        }
    </style>

    <script type="text/javascript" src="../../static/jquery-1.10.2.min.js"></script>
    <script type="text/javascript">
        $(function(){

        });
    </script>
</head>
<body>
<div id="main">
    <h2>新增信息</h2>
    <form action="/add.do" method="post">
        <table>
            <tr>
                <td>姓名</td>
                <td><input type="text" name="stuName"></td>
            </tr>
            <tr>
                <td>班级</td>
                <td>
                    <select name="classId">
                        <option value="0">--请选择--</option>
                        <c:forEach items="${classes}" var="c">
                            <option value="${c.id}">${c.className}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="提交"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
