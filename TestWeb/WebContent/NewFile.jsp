<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 
My First HTML <br>
本站孟买 <br>
Message : my first jsp <br><%=request.getParameter("name") %> : <%=request.getParameter("lastname") %>
<table border=1><thead><th>col1</th></thead><tbody>
<%for (int i=0;i<4;i++){ %>
<tr><td> data<%=i %></td></tr>
<%} %>
</tbody>
</table>
</body>
</html>