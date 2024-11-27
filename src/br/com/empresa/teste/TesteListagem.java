package br.com.empresa.teste;

import java.util.List;

import br.com.empresa.bean.Colaborador;
import br.com.empresa.dao.ColaboradorDAO;
import br.com.empresa.dao.OracleColaboradorDAO;

public class TesteListagem {

	public static void main(String[] args) {
		
		ColaboradorDAO dao = new OracleColaboradorDAO();
		
		List<Colaborador> lista = dao.listar();
		for (Colaborador item : lista) {
			System.out.println(item.getCodigo() 
							+ " " + item.getNome() 
							+ " " + item.getEmail() 
							+ " " + item.getSalario() 
							+ " " + item.getDataContratacao().getTime());
		}
		
	}

}
