package br.com.doichejunior.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.SimpleFormatter;

import br.com.doichejunior.model.Despesa;

public class DespesaDao {

	Connection conn = new ConexaoDB().getConnection();

	public void cadastrar(Despesa d) throws SQLException {
		String query = "INSERT INTO DESPESA (descricao, valor, data)VALUES (?,?,?)";
		PreparedStatement stmt = conn.prepareStatement(query);
		stmt.setString(1, d.getDescricao());
		stmt.setDouble(2, d.getValor());
		SimpleFormatter sdf = new SimpleFormatter();
		// stmt.setDate(3, sdf.format(git );
		stmt.setString(4, d.getCategoria());

		stmt.execute();
		stmt.close();
		conn.close();

	}

}
