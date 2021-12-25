<%@page import="br.com.calculator.utils.simpleCalculator"%>
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
			simpleCalculator sc = new simpleCalculator();
		
			//Pega os valores do formulário, utilizando os métodos da classe
			sc.setValor1(request.getParameter("valor1"));
			sc.setValor2(request.getParameter("valor2"));
			sc.setOperacao(request.getParameter("operacao"));
		
			if (sc.validar()) {
		//Se for verdadeiro (true) mostra a mensagem
		out.print(sc.getMensagem());
			} else {
		//se não, mostra o calculo realizado
		out.print("Resultado: " + sc.calcular());
			}
	%>

	<br>
	<br>
	<a href="simple-calculator.html">Voltar</a>

</body>
</html>