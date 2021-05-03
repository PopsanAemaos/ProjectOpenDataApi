<%-- 
    Document   : index
    Created on : May 3, 2021, 5:47:21 AM
    Author     : Popsan
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<html>
<head>
    <title></title>
</head>

<body>
    <h3> ตัวอย่าง api ที่ดึงมาจาก :https://opend.data.go.th/register_api/login.php</h3>

    <form action="Result" method="post">

         <input type=radio name="status" value="1">สิ่งประดิษฐ์ในประเทศไทย <br><br>
         <input type=radio name="status" value="2">สถานที่ทำการไปรษณีย์ ในประเทศไทย <p>

       &nbsp &nbsp <input type=submit value="Submit">
     </form>
</body>
</html>