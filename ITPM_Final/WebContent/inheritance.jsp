<%@page import="utils.*"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
	integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>
<title>Complexity of Control Structure</title>

<style>
ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #00376c;
	font-family: century gothic;
	font-size: 25px;
}

li {
	float: left;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li

 

a


:hover


:not

 

(
.active

 

)
{
background-color


:

 

#ffd700


;
}
.active {
	background-color: #ffd700;
}
</style>

</head>
<body>

	<ul>
		<li><a href="Home.jsp">Home</a></li>
		<li><a href="Guide.jsp">Guide</a></li>

	</ul>

	<div class="container" style="overflow: auto; min-height: 500px">

		<div align="center">


			<h1 class="display-1"
				style="center: 2%; margin-left: 100px; font-family: century gothic; font-size: 50px; margin-top: 10px">
				<font color="#00376c">Complexity of Control Structure</font>
			</h1>
			<br>

		</div>

		<table class="table" style="font-family: century gothic"
			cellpadding="20px" cellspacing="20px" align="center" border="2">
			<thead>
				<tr>
					<th style="font =weight: bold;">Line Number</th>
					<th style="font =weight: bold;">Statement</th>
					<th style="font =weight: bold;">No of direct inheritance</th>
					<th style="font =weight: bold;">No of direct inheritance</th>
					<th style="font =weight: bold;">Total inheritance</th>
					<th style="font =weight: bold;">Ci</th>
				</tr>
			</thead>


			<%
				int x = 1;

				String[] codeLines = (String[]) session.getAttribute("lines");
				ArrayList<StatementLine> StatementListNdi = (ArrayList<StatementLine>) session.getAttribute("Ndi");
				ArrayList<StatementLine> StatementListNidi = (ArrayList<StatementLine>) session.getAttribute("Nidi");
				ArrayList<StatementLine> StatementListTi = (ArrayList<StatementLine>) session.getAttribute("ti");

				while (x <= codeLines.length) {
					StatementLine ndi = StatementListNdi.get(x - 1);
					StatementLine nidi = StatementListNidi.get(x - 1);
			%>

			<tr>
				<td><%=x%></td>
				<td><%=codeLines[x - 1].replace(" ", "&nbsp;")%></td>
				<td><%=ndi.getComplexity()%></td>
				<td><%=nidi.getComplexity()%></td>
				<td><%=ndi.getComplexity() + nidi.getComplexity()%></td>
			</tr>

			<%
				x++;
				}
			%>
		</table>
	</div>



</body>
</html>