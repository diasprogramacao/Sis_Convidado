package manipularArquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

import entidades.Convidado;
import persistencia.LogConvidadoDao;

public class LogCrudConvidado {
	
	public void escreverNoArquivoLogJogador(Convidado convidado, String tipoOperacao) {
		
	
		LogConvidadoDao  logConvidadoDao  = new LogConvidadoDao();
		
		LocalDateTime horaAtual = LocalDateTime.now();
		
		String enderecoArquivo = "C:\\RepositorioGitHub\\MeuRepositorio\\CursoJavaProgrammer\\Aula-03-05-2023\\log\\logConvidado";
		String escrita = "";
		switch (tipoOperacao) {
		
		case  "Deletar":
			escrita = horaAtual + "O Convidado(a) " + convidado.getNome() + " com Cpf: "+ convidado.getCpf() + "foi excluido!";
			break;
		case  "Alterar":
			escrita = horaAtual + " - O Convidado(a) " + convidado.getNome() + " com Cpf: "+ convidado.getCpf() + " foi alterado!";
			break;
		case  "Cadastrar":
			escrita = horaAtual + " - O Convidado(a) " + convidado.getNome() + " com Cpf: "+ convidado.getCpf() + " foi cadastrado!" ;
			break;
		
		}
		try {
			
			BufferedWriter buWriter = new BufferedWriter(new FileWriter(enderecoArquivo, true));

			buWriter.append(escrita + "\n"); 
			buWriter.close();
			
			System.out.println("deu certo");
			
			logConvidadoDao.registrarLog(escrita);
			
		}catch (IOException mensagemErro) {
			System.out.println("Problema ao gerar log:  " + mensagemErro);

		}








	}
	
	
	
	
}