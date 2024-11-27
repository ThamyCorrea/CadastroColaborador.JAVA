package br.com.empresa.teste;

import br.com.empresa.bean.Colaborador;
import br.com.empresa.dao.ColaboradorDAO;
import br.com.empresa.dao.OracleColaboradorDAO;

public class TesteAlteracao {

	public static void main(String[] args) {
		
		ColaboradorDAO dao = new OracleColaboradorDAO();
	    
	    Colaborador colaborador = dao.buscarPorId(1);
	    
	    System.out.println(colaborador.getCodigo() + " "
	        + colaborador.getNome() + " " + colaborador.getEmail() + " "
	        + colaborador.getSalario() + " "
	        + colaborador.getDataContratacao().getTime());
	    
	    colaborador.setSalario(8500);
	    colaborador.setEmail("joana@email.com.br");
	   
	    dao.atualizar(colaborador);
	  }

	}




    