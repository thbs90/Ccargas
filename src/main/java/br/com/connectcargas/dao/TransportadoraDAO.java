package br.com.connectcargas.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.connectcargas.model.Transportadora;

public class TransportadoraDAO extends Conexao implements ITransportadoraDAO{

	
	public boolean salvar(Transportadora transportadora) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deletar(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Transportadora> consultar() {
		PreparedStatement ps = null;
		final List<Transportadora> transportadoras  = new ArrayList<Transportadora>();	
		
		final String sql = "Select * from transportadora";
		try {
			ps = getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			
			while(rs.next()) {
				Transportadora dadosTransortadora = new Transportadora();
				dadosTransortadora.setId(rs.getInt("id"));
				dadosTransortadora.setNome(rs.getString("nome"));
				dadosTransortadora.setCnpj(rs.getString("cnpj"));
				dadosTransortadora.setEndereco(rs.getString("endereco"));
				
				transportadoras.add(dadosTransortadora);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} 
		return transportadoras;
	}

	public Transportadora atualizar(Transportadora transportadora) {
		// TODO Auto-generated method stub
		return null;
	}

}
