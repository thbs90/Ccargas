package br.com.connectcargas.dao;

import java.util.List;

import br.com.connectcargas.model.Jornada;

public interface IJornadaDAO {
	
	public boolean salvar(Jornada jornada);
	public boolean deletar(int id);
	public List<Jornada> consultar();
	public Jornada atualizar(Jornada jornada);

}
