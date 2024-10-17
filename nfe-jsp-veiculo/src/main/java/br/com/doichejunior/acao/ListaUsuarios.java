package br.com.doichejunior.acao;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.doichejunior.dao.UsuarioDao;
import br.com.doichejunior.model.Usuario;

import java.io.IOException;
import java.util.List;

public class ListaUsuarios {
    public void executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UsuarioDao dao = new UsuarioDao();
        List<Usuario> usuarios= dao.getUsuarios();
        req.setAttribute("usuarios",usuarios);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/listar-usuarios.jsp");
        dispatcher.forward(req,resp);
    }

    public void getUsuariosByLogin(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UsuarioDao dao = new UsuarioDao();
        String login = req.getParameter("login");
        List<Usuario> usuarios= dao.getUsuariosNome(login);
        req.setAttribute("usuarios",usuarios);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/listar-usuarios.jsp");
        dispatcher.forward(req,resp);
    }



}
