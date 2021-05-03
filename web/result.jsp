<%-- 
    Document   : result
    Created on : May 3, 2021, 5:47:07 AM
    Author     : Popsan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title></title>
</head>
<body>
    <h1> ข้อมูลดิบ </h1>
    <p> <%=request.getAttribute("api")%> <p>

<!--<button onclick="showContent()">Convert to json</button>

<template>
    <div class="myDiv" values = "showContent()">
  <h2> JSON </h2>
<p id="demo">txt</p>
    </div>
</template>

<script>
function () {
var temp = document.getElementsByTagName("template")[0];
var txt = <%=request.getAttribute("api")%>
console.log(<%=request.getAttribute("api")%>)
temp.show()

return txt
}
</script>-->

</body>
</html>
