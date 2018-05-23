package br.com.connectcargas.services;

import java.util.List;

import br.com.connectcargas.dao.IUsuarioDAO;
import br.com.connectcargas.dao.UsuarioDAO;
import br.com.connectcargas.model.Usuario;

public class UsuarioService implements IUsuarioService{	
	private IUsuarioDAO dao;

	public UsuarioService() {
		this.dao = new UsuarioDAO();
	}

	public boolean salvar(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deletar(int id) {
		if (id == 0) {
			return false;
		}
		return false;
	}

	public List<Usuario> consultar() {
		return this.dao.consultar();
	}

	public Usuario atualizar(Usuario usuario) {
		if (usuario == null) {
			return null;
		} if (usuario.getId() == null) {
			return null;
		}
		return null;
	}

	public Usuario buscaPorId(int id) {
		return this.dao.buscaPorId(id);
	}

}
