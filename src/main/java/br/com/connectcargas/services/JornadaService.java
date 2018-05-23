package br.com.connectcargas.services;

import java.util.List;

import br.com.connectcargas.dao.IJornadaDAO;
import br.com.connectcargas.dao.JornadaDAO;
import br.com.connectcargas.model.Jornada;

public class JornadaService implements IJornadaService {

	private IJornadaDAO dao;
	
	public JornadaService() {
		this.dao = new JornadaDAO();
	}
	
	public boolean salvar(Jornada jornada) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deletar(int id) {
		if (id == 0) {
			return false;
		}
		return false;
	}

	public List<Jornada> consultar() {
		
		return this.dao.consultar();
	}

	public Jornada atualizar(Jornada jornada) {
		if (jornada == null) {
			return null;
		}
		if (jornada.getId() == null) {
			return null;
			}
		return null;
	}
	
}
