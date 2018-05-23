package br.com.connectcargas.services;

import java.util.List;

import br.com.connectcargas.model.Usuario;

public interface IUsuarioService {
	
	public boolean salvar(Usuario usuario);
	public boolean deletar(int id);
	public List<Usuario> consultar();
	public Usuario atualizar(Usuario usuario);
	public Usuario buscaPorId(int id);
}
