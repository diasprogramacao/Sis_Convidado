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
import controladores.ControladorTelaIdentificarConvidado;
import entidades.Convidado;


public class TelaIdentificarAlterarConvidado {
		
		
		public void IdentificarConvidado(List<Convidado> listaConvidado,JFrame frameMenuPrincipal,RepositorioConvidado repositorioConvidado) {
			
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
			
			JFrame frameIdentificarConvidadoAlterar = new JFrame();
			frameIdentificarConvidadoAlterar.setSize(400,400);
			JPanel painelIdentificarConvidadoAlterar = new JPanel();
			
			JLabel texto01 = new JLabel("CPF Convidado");
			painelIdentificarConvidadoAlterar.add(texto01);
			JTextField respostaRecebida = new JTextField(10);
			painelIdentificarConvidadoAlterar.add(respostaRecebida);
			JButton botaoDeletarIdentificarConvidadoAlterar = new JButton("Alterar");
			painelIdentificarConvidadoAlterar.add(botaoDeletarIdentificarConvidadoAlterar);
			
			JButton botaoTelaVoltarConvidado = new JButton("Voltar");
			painelIdentificarConvidadoAlterar.add(botaoTelaVoltarConvidado);
			
			String nomesColunasTelaIdentificarConvidadoAlterar[] = {"NOME","CPF","CONVITE","ENDEREÇO","PROFISSÃO","EMAIL"};
			JTable tabelaConvidadoDelete = new JTable(tabelaString,nomesColunasTelaIdentificarConvidadoAlterar);
			
			tabelaConvidadoDelete.setBounds(50, 70, 400, 400);
			JScrollPane scrollPaneListarJogador = new JScrollPane(tabelaConvidadoDelete);
			painelIdentificarConvidadoAlterar.add(scrollPaneListarJogador);
			
			
			frameIdentificarConvidadoAlterar.add(painelIdentificarConvidadoAlterar);
			frameIdentificarConvidadoAlterar.setVisible(true);
			
			ControladorTelaIdentificarConvidado  controladorTelaIdentificarConvidado = new ControladorTelaIdentificarConvidado(frameMenuPrincipal,frameIdentificarConvidadoAlterar,repositorioConvidado,respostaRecebida);
			
			botaoDeletarIdentificarConvidadoAlterar.addActionListener(controladorTelaIdentificarConvidado);
			botaoTelaVoltarConvidado.addActionListener(controladorTelaIdentificarConvidado);
	
		 }
		
      }
	

