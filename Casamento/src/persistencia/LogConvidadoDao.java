package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class LogConvidadoDao {
	
	
	public void registrarLog(String escritaLog) {
		
		FabricaConexao fabricaConexao = new FabricaConexao();
		
		String insertLogComando = "insert into tabela_log(escrita_log) values(?)"; 
		
		Connection conexao = null;
		PreparedStatement declaracaoComando = null;
		
		try {
			conexao = fabricaConexao.criarConexao();
			
			declaracaoComando = (PreparedStatement)conexao.prepareStatement(insertLogComando); 
			
			declaracaoComando.setString(1, escritaLog);
			
			declaracaoComando.execute();
		
		} catch (Exception e) {
			System.out.println("Erro ao registrar Log");
		
		}finally {
			try {
				if(conexao != null) {
					conexao.close();
				}
				
				if(declaracaoComando != null) {
					declaracaoComando.close();
				}
				
				
			} catch (Exception e2) {
				System.out.println("Erro ao fechar a conexao");
			}
			
		}
		
		
		
		
		
	}

}
