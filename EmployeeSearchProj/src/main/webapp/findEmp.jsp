<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.wiley.service.DAOService , java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
DAOService service =new DAOService();

int eid=Integer.parseInt(request.getParameter("eid"));

ResultSet res=service.findById(eid);

		if(res!=null)
		{
	%>
	
	<table border=5><tr><th>Employee_Id</th><th>First_name</th><th>salary</th><th>Department_id</th></tr>
	<%
		while(res.next())
		{
	%>
			<tr>
			<td><%=res.getInt("Employee_id")%></td>
			<td><%=res.getString("first_name")%></td>
			<td><%=res.getInt("salary")%></td>
			<td><%=res.getInt("department_id")%></td>
			</tr>
	<%
		} 
	}
	else
		out.println("No Record Found.with id :"+eid);	
	%>

</table>

</body>
</html>