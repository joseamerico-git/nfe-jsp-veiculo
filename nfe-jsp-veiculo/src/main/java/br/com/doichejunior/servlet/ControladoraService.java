package br.com.doichejunior.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.doichejunior.acao.AdicionaUsuario;
import br.com.doichejunior.acao.ListaUsuarios;
import br.com.doichejunior.acao.RemoveUsuario;



@WebServlet("/controladora")
public class ControladoraService extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String acao = req.getParameter("acao");
        System.out.print("A ação executada foi: "+ acao);

        if(acao.equals("ListaUsuarios")){
            new ListaUsuarios().executa(req,resp);
        }
       else if(acao.equals("AdicionaUsuario")){
            new AdicionaUsuario().executa(req,resp);
        }

        else if(acao.equals("FiltrarUsuario")){

            new ListaUsuarios().getUsuariosByLogin(req,resp);
        }
        else if(acao.equals("RemoveUsuario")){

            new RemoveUsuario().removeUsuarioById(req, resp);
        }


    }
}
