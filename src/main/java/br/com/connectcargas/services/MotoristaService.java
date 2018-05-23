package br.com.connectcargas.services;

import java.sql.SQLException;
import java.util.List;

import br.com.connectcargas.dao.IMotoristaDAO;
import br.com.connectcargas.dao.MotoristaDAO;
import br.com.connectcargas.model.Motorista;

public class MotoristaService implements IMotoristaService {
	
	private IMotoristaDAO dao;
	
	public MotoristaService() {
		this.dao = new MotoristaDAO();
	}

	public boolean salvar(Motorista motorista) throws SQLException {
		return this.dao.salvar(motorista);
	}

	public boolean deletar(int id) throws SQLException {
		return this.dao.deletar(id);
	
	}

	public List<Motorista> consultar() {
		
		return this.dao.consultar();
	}

	public boolean atualizar(Motorista motorista) throws SQLException {
		return this.dao.atualizar(motorista);
	}
//	public Motorista atualizar(Motorista motorista) {
//		if (motorista == null) {
//			return null;
//		} if (motorista.getId() == null) {
//			return null;
//		}
//		return null;
//	}

	public Motorista buscaPorId(int id) {
		return this.dao.buscaPorId(id);
	}

}
