package br.com.empresa.dao;

import java.util.List;

import br.com.empresa.bean.Colaborador;


public interface ColaboradorDAO {
	
	
		public void cadastrar(Colaborador colaborador);

		public List<Colaborador> listar();
		
		public void atualizar(Colaborador colaborador);

		public void remover(int codigo);
		
		public Colaborador buscarPorId(int codigoBusca);
	}


