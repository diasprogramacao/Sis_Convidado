package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entidades.Convidado;

public class ConvidadoDao {
	
	public boolean salvarJogadorBanco(Convidado convidado) {
		
		FabricaConexao fabricaConexao = new FabricaConexao();
		boolean salvamento;
		String comandoSqlInsert = "insert into convidados(nome,cpf,convite,endereco,profissao,email) values (?,?,?,?,?,?)";
		Connection conexao = null;
		PreparedStatement declaracaoComando = null;
		
		try {
			
			conexao = fabricaConexao.criarConexao();
			declaracaoComando = (PreparedStatement)conexao.prepareStatement(comandoSqlInsert);
			
			declaracaoComando.setString(1, convidado.getNome());
			declaracaoComando.setString(2, convidado.getCpf());
			declaracaoComando.setString(3, convidado.getConvite());
			declaracaoComando.setString(4, convidado.getEndereco());
			declaracaoComando.setString(5, convidado.getProfissao());
			declaracaoComando.setString(6, convidado.getEmail());
			
			declaracaoComando.execute();
			
			salvamento = true;
			
			JOptionPane.showMessageDialog(null, "Convidado Salvo Com Sucesso");
			
		} catch (Exception e) {
			
			System.out.println("Erro do Exception ao salvar novo convidado" + e);
			JOptionPane.showMessageDialog(null, "Erro ao Salvar Convidado");
			salvamento = false;
			
		} finally {
			
			try {
				if(conexao != null) {
					conexao.close();
					if (declaracaoComando != null) {
						declaracaoComando.close();
					}
				}
			} catch(Exception e){
				
				System.out.println(e);
				System.out.println("Erro ao tentar fechar a conexão");
			}
			
		}
		
		return salvamento;
		
	}

		public List<Convidado> retornaListaConvidadoBanco() {
		
			FabricaConexao fabricaConexao = new FabricaConexao();
			
			List<Convidado>  listaConvidadoBanco = new ArrayList<>();
			
			String comandoSql = "Select * from convidados";
			Connection conexao;
			PreparedStatement declaracaoComando;
			ResultSet resultadoTabela;
			
			try {
				conexao = fabricaConexao.criarConexao();
				declaracaoComando = (PreparedStatement)conexao.prepareStatement(comandoSql); // o conexao.prepareStatement(comandoSql) devolve um objeto do tipo PreparedStatement na qual já recebeu o comando sql. 
				resultadoTabela = declaracaoComando.executeQuery(); // o declaracaoComando.executeQuery() devolve o resultado da consulta.
				
				
				while (resultadoTabela.next()) {
					
					Convidado convidado = new Convidado();
					
					convidado.setNome(resultadoTabela.getString("nome"));
					convidado.setCpf(resultadoTabela.getString("cpf"));
					convidado.setConvite(resultadoTabela.getString("convite"));
					convidado.setEndereco(resultadoTabela.getString("endereco"));
					convidado.setProfissao(resultadoTabela.getString("profissao"));
					convidado.setEmail(resultadoTabela.getString("email"));
					
					listaConvidadoBanco.add(convidado);
					
				}
				
			}catch (Exception e) {
				
				System.out.println("Erro do Exception apresentar lista convidado" + e);
				System.out.println("Erro ao buscar lista de convidados");
				
			} 
			
			return listaConvidadoBanco;
			
		}

		public boolean deletarConvidadoBancoDadosPeloCpf(String cpf) {
			
			boolean deletou= false;
			
			FabricaConexao fabricaConexao = new FabricaConexao(); 
			Connection conexao;
			PreparedStatement declaracaoComando;
			String ComandoSql = "delete  from convidados where cpf = ?";
			
			try {
				conexao = fabricaConexao.criarConexao();
				declaracaoComando = (PreparedStatement)conexao.prepareStatement(ComandoSql);
				declaracaoComando.setString(1, cpf);
				declaracaoComando.execute();
			    
				deletou = true;
				
			}catch(Exception e) {
				
				System.out.println("Erro do Exception ao deletar convidado" + e);
				JOptionPane.showMessageDialog(null, "Erro ao deletar convidado");
				deletou = false;
			}
			
			return deletou;
		}
		
		public boolean alterarJogador(Convidado convidadoNovo) {
			
			FabricaConexao conexao = new FabricaConexao();
			
			boolean alteracao = false; 
			String comandoSql = "update  convidados set cpf = ?, nome = ?,convite = ?, endereco = ? , profissao= ?  where  cpf = ?" ;
			
			
			
			Connection conexaoRecebida = null; 
			PreparedStatement declaracaoComando = null; 
			try {
				conexaoRecebida = conexao.criarConexao();
				
				declaracaoComando = (PreparedStatement)conexaoRecebida.prepareStatement(comandoSql);
				
				declaracaoComando.setString(1, convidadoNovo.getCpf());
				declaracaoComando.setString(2, convidadoNovo.getNome());
				declaracaoComando.setString(3, convidadoNovo.getConvite());
				declaracaoComando.setString(4, convidadoNovo.getEndereco());
				declaracaoComando.setString(5, convidadoNovo.getProfissao());
				
				
				declaracaoComando.setString(6, convidadoNovo.getCpf());
				
				declaracaoComando.execute();
				
				alteracao = true;
				System.out.println("Convidado Alterado com sucesso");
			
				
			} catch (Exception mensagemErro) {
				System.out.println(mensagemErro);
				System.out.println("Erro ao alterar!");
				alteracao = false;
				
			}finally { 
				
				try {
					if(conexaoRecebida != null) {
						conexaoRecebida.close();
					}
					
					if (declaracaoComando != null) {
						declaracaoComando.close();
					}
					
				} catch (Exception msgErro) {
					System.out.println(msgErro);
					System.out.println("Erro ao tentar fechar a conexao");
				}
				
			}
			
			return alteracao;

		}
}


