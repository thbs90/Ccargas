package br.com.connectcargas.services;

import java.util.List;

import br.com.connectcargas.dao.ITransportadoraDAO;
import br.com.connectcargas.dao.TransportadoraDAO;
import br.com.connectcargas.model.Transportadora;

public class TransportadoraService implements ITransportadoraService{
	
	private ITransportadoraDAO dao;
	
	public TransportadoraService() {
		this.dao = new TransportadoraDAO();
	}

	public boolean salvar(Transportadora transportadora) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deletar(int id) {
		if (id == 0) {
			return false;
		}
		return false;
	}

	public List<Transportadora> consultar() {
		
		return this.dao.consultar();
	}

	public Transportadora atualizar(Transportadora transportadora) {
		if (transportadora == null) {
			return null;
		}if (transportadora.getId() == null) {
			return null;
		}
		return null;
	}

}
