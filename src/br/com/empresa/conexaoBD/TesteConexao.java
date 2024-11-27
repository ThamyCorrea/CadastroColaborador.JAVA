package br.com.empresa.conexaoBD;

import java.sql.Connection;

public class TesteConexao {
    public static void main(String[] args) {
        Connection conexao = null;

        try {
            conexao = ConexaoBD.obterConexao();

            if (conexao != null) {
                System.out.println("Conexão estabelecida com sucesso!");
            } else {
                System.out.println("Falha ao estabelecer a conexão.");
            }
        } catch (Exception e) {
            System.err.println("Erro durante o teste de conexão:");
            e.printStackTrace();
        } finally {
            // Fechar a conexão (boas práticas)
            try {
                if (conexao != null) {
                    conexao.close();
                    System.out.println("Conexão fechada.");
                }
            } catch (Exception e) {
                System.err.println("Erro ao fechar a conexão:");
                e.printStackTrace();
            }
        }
    }
}
