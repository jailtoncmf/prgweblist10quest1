package prgweb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProcessarValoresServlet")
public class ProcessarValoresServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    	int numero1 = Integer.parseInt(request.getParameter("numero1"));
        int numero2 = Integer.parseInt(request.getParameter("numero2"));
        int numero3 = Integer.parseInt(request.getParameter("numero3"));

        int soma = numero1 + numero2 + numero3;
        int subtracao = numero1 - numero2 - numero3;
        int multiplicacao = numero1 * numero2 * numero3;
        double divisao = (double) numero1 / numero2 / numero3;
        int resto = numero1 % numero2 % numero3;

        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Resultados:</h1>");
        response.getWriter().println("Valor 1: " + numero1 + "<br>");
        response.getWriter().println("Valor 2: " + numero2 + "<br>");
        response.getWriter().println("Valor 3: " + numero3 + "<br>");
        response.getWriter().println("Soma: " + soma + "<br>");
        response.getWriter().println("Subtração: " + subtracao + "<br>");
        response.getWriter().println("Multiplicação: " + multiplicacao + "<br>");
        response.getWriter().println("Divisão: " + divisao + "<br>");
        response.getWriter().println("Resto da Divisão: " + resto + "<br>");
        response.getWriter().println("</body></html>");
        

    }
}