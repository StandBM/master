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
            margin:0px;
            padding: 0px;
        }
        #main{
            width: 400px;
            margin:10px auto;
        }
    </style>

    <script type="text/javascript" src="../../static/jquery-1.10.2.min.js"></script>
    <script type="text/javascript">

        $(function(){
            $("tr:eq(0)").css("backgroundColor","gray");
            $("tr:odd").css("backgroundColor","green");
        });
    </script>
</head>
<body>
    <div id="main">
        <table border="1" style="width: 400px;text-align: center" >
            <tr>
                <td>编号</td>
                <td>姓名</td>
                <td>班级</td>
            </tr>
            <c:forEach items="${stu}" var="s">
                <tr>
                    <td>${s.id}</td>
                    <td>${s.stuName}</td>
                    <td>${s.className}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>