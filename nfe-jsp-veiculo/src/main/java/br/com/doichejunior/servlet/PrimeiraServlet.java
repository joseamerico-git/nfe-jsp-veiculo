package br.com.doichejunior.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/minhaServlet") //a partir da versão 3.0
@WebServlet({ "/MinhaServlet", "/xpto" })
public class PrimeiraServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>Primeira página utilizando a servlet</h1>");
		writer.print("</body>");
		writer.print("</html>");
	}
}
