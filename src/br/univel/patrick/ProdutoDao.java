package br.univel.patrick;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.Data;

public class ProdutoDao {
	
	private static final String SQL_BUSCA_TODOS = "SELECT * FROM PRODUTO";

	public List<Produto> getTodos() {
		
		Connection con = Conexao
				.getInstance()
				.getConnection();
		
		List<Produto> lista = new ArrayList<>();
		try (PreparedStatement ps = con
					.prepareStatement(SQL_BUSCA_TODOS);
				ResultSet rs = ps.executeQuery()) {
			
			while (rs.next()) {
				Produto p = new Produto();
				p.setNomeProduto(rs.getString(1));
				p.setCodigoProduto(rs.getLong(2));
				p.setValor(rs.getInt(3));
				p.setDatadeentrada(rs.getDate(4));
				lista.add(p);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	public void insere(Produto p) {
		
	}
	
	public void atualiza(int id, Produto p) {
		
	}
	
	public void exclui(int id) {
		
	}
	
}
