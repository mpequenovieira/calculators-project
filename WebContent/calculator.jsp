<%@page import="br.com.calculator.utils.Calculator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		//Cria o objeto calculadora
		Calculator c = new Calculator();
	
		//Pega os valores do formulário, utilizando os métodos da classe
		c.setValor1(request.getParameter("valor1"));
		c.setValor2(request.getParameter("valor2"));
		c.setOperacao(request.getParameter("operacao"));
	
		if (c.validar()) {
			//Se for verdadeiro (true) mostra a mensagem
			out.print(c.getMensagem());
		} else {
			//se não, mostra o calculo realizado
			out.print("Resultado: " + c.calcular());
		}
	%>

	<br>
	<br>
	<a href="simple-calculator.html">Voltar</a>

</body>
</html>