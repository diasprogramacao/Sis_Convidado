package telas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Repositorio.RepositorioConvidado;
import controladores.ControladorAlterarConvidado;
import entidades.Convidado;

public class TelaAlterarConvidado {
	
	Convidado convidadoIdentificadoRecebido;
	
	JFrame FrameMenuPrincipal;
	JFrame FrameTelaIdentificarConvidado;
	RepositorioConvidado repositorioRecebido;
	Convidado convidadoRecebido;
	
	Convidado convidadoIdentificado = convidadoIdentificadoRecebido;
	
	public void AlterarConvidado(Convidado convidado,JFrame JframeMenuPrincipal,RepositorioConvidado repositorioConvidado) {
		
		 String campo01 = "Nome"; 
		 String campo02 = "Convite";
		 String campo03 = "Endereco";
		 String campo04 = "Profissao";
		 String campo05 = "Cpf";
		 String campo06 = "Email";
		 
		 convidadoRecebido = convidado;
		 
		 JFrame frameTelaAlterarConvidado = new JFrame();
		 frameTelaAlterarConvidado.setTitle("Cadastro Convidado");
		 frameTelaAlterarConvidado.setSize(400,400);
		 
		 JPanel painelTelaAlterarConvidado = new JPanel();
		 
		 GridLayout grid = new GridLayout(0,1);
		 painelTelaAlterarConvidado.setLayout(grid);
		 
		 JLabel nome = new JLabel(campo01);
		 painelTelaAlterarConvidado.add(nome);
		 JTextField  respostaCampo01 = new JTextField(10);
		 respostaCampo01.setText(convidadoRecebido.getNome());
		 painelTelaAlterarConvidado.add(respostaCampo01);
		 
		 JLabel cpf = new JLabel(campo05);
		 painelTelaAlterarConvidado.add(cpf);
		 JTextField  respostaCampo02 = new JTextField(10);
		 respostaCampo02.setText(convidadoRecebido.getCpf());
		 respostaCampo02.setEditable(false);
		 painelTelaAlterarConvidado.add(respostaCampo02);
		 
		 JLabel convite = new JLabel(campo02);
		 painelTelaAlterarConvidado.add(convite);
		 JTextField  respostaCampo03 = new JTextField(10);
		 respostaCampo03.setText(convidadoRecebido.getConvite());
		 painelTelaAlterarConvidado.add(respostaCampo03);
		 
		 JLabel endereco = new JLabel(campo03);
		 painelTelaAlterarConvidado.add(endereco);
		 JTextField  respostaCampo04 = new JTextField(10);
		 respostaCampo04.setText(convidadoRecebido.getEndereco());
		 painelTelaAlterarConvidado.add(respostaCampo04);
		 
		 JLabel profissao = new JLabel(campo04);
		 painelTelaAlterarConvidado.add(profissao);
		 JTextField  respostaCampo05 = new JTextField(10);
		 respostaCampo05.setText(convidadoRecebido.getProfissao());
		 painelTelaAlterarConvidado.add(respostaCampo05);
		 
		 JLabel email = new JLabel(campo06);
		 painelTelaAlterarConvidado.add(email);
		 JTextField  respostaCampo06 = new JTextField(10);
		 respostaCampo06.setText(convidadoRecebido.getEmail());
		 painelTelaAlterarConvidado.add(respostaCampo06);
		 
		 JButton botaoAlterar = new JButton("Alterar");
		 painelTelaAlterarConvidado.add(botaoAlterar);
		 JButton botaoVoltar  = new JButton();
		 painelTelaAlterarConvidado.add(botaoVoltar);
		 
		 frameTelaAlterarConvidado.add(painelTelaAlterarConvidado);
		 frameTelaAlterarConvidado.setVisible(true);
		
		 ControladorAlterarConvidado ControladorAlterarConvidado =  new ControladorAlterarConvidado(frameTelaAlterarConvidado,JframeMenuPrincipal,convidado,repositorioConvidado,respostaCampo01,respostaCampo02,
				 respostaCampo03,respostaCampo04,respostaCampo05,respostaCampo06);
		 
		 botaoAlterar.addActionListener(ControladorAlterarConvidado);
		 botaoVoltar.addActionListener(ControladorAlterarConvidado);
	}
	

	
}
