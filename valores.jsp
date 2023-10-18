<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Informe Valores</title>
</head>
<body>
    <form action="ProcessarValoresServlet" method="post">
        
        <label for="numero1">Valor 1:</label>
        <input type="number" id="numero1" name="numero1" required><br><br>

        <label for="numero2">Valor 2:</label>
        <input type="number" id="numero2" name="numero2" required><br><br>
        
        <label for="numero3">Valor 3:</label>
        <input type="number" id="numero3" name="numero3" required><br><br>

        <input type="submit" value="Calcular">
    </form>
</body>
</html>