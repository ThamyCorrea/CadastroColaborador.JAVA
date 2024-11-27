package br.com.empresa.teste;

import br.com.empresa.dao.ColaboradorDAO;
import br.com.empresa.dao.OracleColaboradorDAO;

public class TesteRemocao {

	public static void main(String[] args) {
		
		ColaboradorDAO dao = new OracleColaboradorDAO();
		
		dao.remover(50);

	}

}
