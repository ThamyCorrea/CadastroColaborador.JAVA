package br.com.empresa.teste;

import java.util.Calendar;

import br.com.empresa.bean.Colaborador;
import br.com.empresa.dao.ColaboradorDAO;
import br.com.empresa.dao.OracleColaboradorDAO;

public class TesteCadastro {

	public static void main(String[] args) {
		
		ColaboradorDAO dao = new OracleColaboradorDAO();

		Colaborador colaborador = new Colaborador();
			colaborador.setNome("Pedro");
			colaborador.setEmail("pedro@email.com");
			colaborador.setSalario(5000);
			colaborador.setDataContratacao(Calendar.getInstance());

				
			dao.cadastrar(colaborador);

				System.out.println("Cadastrado!");
	}

}
	

	
