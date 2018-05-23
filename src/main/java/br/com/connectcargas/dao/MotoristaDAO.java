package br.com.connectcargas.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import br.com.connectcargas.model.Motorista;

public class MotoristaDAO extends Conexao implements IMotoristaDAO {

	public boolean salvar(Motorista motorista) throws SQLException  {
		String sql = "INSERT INTO motorista(nome, cpf, matricula, endereco, dataNascimento) VALUES (?, ?, ?, ?, ?)";

		PreparedStatement ps = getConnection().prepareStatement(sql);
		boolean retorno = false;
		if (motorista != null) {
			try {
				ps.setString(1, motorista.getNome());
				ps.setString(2, motorista.getCpf());
				ps.setString(3, motorista.getMatricula());
				ps.setString(4, motorista.getEndereco());
				ps.setDate(5, new Date (motorista.getDataNascimento().getTime()));
				ps.execute();
				retorno = true;
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				ps.close();
			}
		}
		return retorno;

	}

	public boolean deletar(int id) throws SQLException{
		// TODO Auto-generated method stub

		String sql = "DELETE FROM motorista WHERE id = ?";

		PreparedStatement ps = getConnection().prepareStatement(sql);
		boolean retorno = false;
		if (id != 0) {
			try {
				ps.setInt(1, id);
				ps.execute();
				retorno = true;
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				ps.close();
			}
		}
		return retorno;

	}

	public List<Motorista> consultar() {
		PreparedStatement ps = null;
		final List<Motorista> motoristas  = new ArrayList<Motorista>();	

		final String sql = "Select * from motorista";
		try {
			ps = getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();


			while(rs.next()) {
				Motorista dadosMotorista = new Motorista();
				dadosMotorista.setId(rs.getInt("id"));
				dadosMotorista.setCpf(rs.getString("cpf"));
				dadosMotorista.setNome(rs.getString("nome"));
				dadosMotorista.setDataNascimento(rs.getDate("dataNascimento"));
				dadosMotorista.setMatricula(rs.getString("matricula"));
				dadosMotorista.setEndereco(rs.getString("endereco"));

				motoristas.add(dadosMotorista);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} 
		return motoristas;
	}

	public boolean atualizar(Motorista motorista) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "UPDATE motorista SET nome = ?, cpf = ?, matricula = ?, endereco = ?, dataNascimento = ? WHERE id = ?";

		PreparedStatement ps = getConnection().prepareStatement(sql);
		boolean retorno = false;

		if (motorista != null) {
			try {
				ps.setString(1, motorista.getNome());
				ps.setString(2, motorista.getCpf());
				ps.setString(3, motorista.getMatricula());
				ps.setString(4, motorista.getEndereco());
				ps.setDate(5, new Date (motorista.getDataNascimento().getTime()));
				ps.setInt(6, motorista.getId());
				ps.execute();
				retorno = true;
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				ps.close();
			}
		}
		return retorno;
	}

	public Motorista buscaPorId(int id) {
		PreparedStatement ps = null;

		final String sql = "Select * from motorista where id = ?";
		Motorista dadosMotorista = null;
		try {
			ps = getConnection().prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();


			dadosMotorista = new Motorista();
			dadosMotorista.setId(rs.getInt("id"));
			dadosMotorista.setCpf(rs.getString("cpf"));
			dadosMotorista.setNome(rs.getString("nome"));
			dadosMotorista.setDataNascimento(rs.getDate("dataNascimento"));
			dadosMotorista.setMatricula(rs.getString("matricula"));
			dadosMotorista.setEndereco(rs.getString("endereco"));

		}catch (SQLException e) {
			e.printStackTrace();
		} 
		return dadosMotorista;
	}

}
