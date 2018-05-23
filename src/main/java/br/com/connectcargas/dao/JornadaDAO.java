package br.com.connectcargas.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.connectcargas.model.Jornada;

public class JornadaDAO extends Conexao implements IJornadaDAO{

	public boolean salvar(Jornada jornada) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deletar(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Jornada> consultar() {
		PreparedStatement ps = null;
		final List<Jornada> jornadas = new ArrayList<Jornada>();
		
		final String sql = "Select * from jornadatrabalho";
		try {
			ps = getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			
			while(rs.next()) {
				Jornada dados = new Jornada();
				dados.setId(rs.getInt("id"));
				dados.setDataTrabalho(rs.getDate("dataTrabalho"));
				dados.setRotaOrigem(rs.getString("rotaOrigem"));
				dados.setRotaDestino(rs.getString("rotaDestino"));
				dados.setInicioJornada(rs.getDate("inicioJornada"));
				dados.setFimJornada(rs.getDate("fimJornada"));
				dados.setInicioDirecao(rs.getDate("inicioDirecao"));
				dados.setFimDirecao(rs.getDate("fimDirecao"));
				dados.setInicioDescanso(rs.getDate("inicioDescanso"));
				dados.setFimDescanso(rs.getDate("fimDescanso"));
				dados.setInicioAlimentacao(rs.getDate("inicioAlimentacao"));
				dados.setFimAlimentacao(rs.getDate("fimAlimentacao"));
				dados.setInicioEspera(rs.getDate("inicioEspera"));
				dados.setFimEspera(rs.getDate("fimEspera"));
				
				jornadas.add(dados);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return jornadas;
	}

	public Jornada atualizar(Jornada jornada) {
		// TODO Auto-generated method stub
		return null;
	}

}
