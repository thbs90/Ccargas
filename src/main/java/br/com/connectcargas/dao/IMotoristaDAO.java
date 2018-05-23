package br.com.connectcargas.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.connectcargas.model.Motorista;

public interface IMotoristaDAO {
	
	public boolean salvar(Motorista motorista) throws SQLException;
	public boolean deletar(int id) throws SQLException;
	public List<Motorista> consultar();
	public boolean atualizar(Motorista motorista) throws SQLException;
	public Motorista buscaPorId(int id);

}
