package telas;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import Repositorio.RepositorioConvidado;
import controladores.ControladorTelaDeleteConvidado;
import entidades.Convidado;

public class TelaDeleteConvidado {
	
	public void deleteConvidado(List<Convidado> listaConvidado,JFrame frameMenuPrincipal,RepositorioConvidado repositorioConvidado) {
		
		int quantidadeLinhas = listaConvidado.size();
		
		String [][] tabelaString = new String [quantidadeLinhas][6];
		
		int posicaoLinha = 0;
		int posicaoColuna = 0;
		
		for(Convidado convidado: listaConvidado) {
			
			tabelaString[posicaoLinha][posicaoColuna] = convidado.getNome();
			posicaoColuna++;
			tabelaString[posicaoLinha][posicaoColuna] = convidado.getCpf();
			posicaoColuna++;
			tabelaString[posicaoLinha][posicaoColuna] = convidado.getConvite();
			posicaoColuna++;
			tabelaString[posicaoLinha][posicaoColuna] = convidado.getEndereco();
			posicaoColuna++;
			tabelaString[posicaoLinha][posicaoColuna] = convidado.getProfissao();
			posicaoColuna++;
			tabelaString[posicaoLinha][posicaoColuna] = convidado.getEmail();
			
			posicaoLinha++;
			posicaoColuna = 0;
			
		}
		
		JFrame frameTelaDeleteConvidado = new JFrame();
		frameTelaDeleteConvidado.setSize(400,400);
		JPanel painelTelaDeleteConvidado = new JPanel();
		
		JLabel texto01 = new JLabel("CPF Convidado");
		painelTelaDeleteConvidado.add(texto01);
		JTextField respostaRecebida = new JTextField(10);
		painelTelaDeleteConvidado.add(respostaRecebida);
		JButton botaoTelaDeleteConvidado = new JButton("deletar");
		painelTelaDeleteConvidado.add(botaoTelaDeleteConvidado);
		
		JButton botaoTelaVoltarConvidado = new JButton("Voltar");
		painelTelaDeleteConvidado.add(botaoTelaVoltarConvidado);
		
		String nomesColunasTelaDeleteConvidado[] = {"NOME","CPF","CONVITE","ENDEREÇO","PROFISSÃO","EMAIL"};
		JTable tabelaConvidadoDelete = new JTable(tabelaString,nomesColunasTelaDeleteConvidado);
		
		tabelaConvidadoDelete.setBounds(50, 70, 400, 400);
		JScrollPane scrollPaneListarJogador = new JScrollPane(tabelaConvidadoDelete);
		painelTelaDeleteConvidado.add(scrollPaneListarJogador);
		
		
		frameTelaDeleteConvidado.add(painelTelaDeleteConvidado);
		frameTelaDeleteConvidado.setVisible(true);
		
		ControladorTelaDeleteConvidado controladorTelaDeleteConvidado = new ControladorTelaDeleteConvidado(respostaRecebida,repositorioConvidado,frameMenuPrincipal,frameTelaDeleteConvidado);
		botaoTelaDeleteConvidado.addActionListener(controladorTelaDeleteConvidado);
		botaoTelaVoltarConvidado.addActionListener(controladorTelaDeleteConvidado);
		
	}

}
