package telas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Repositorio.RepositorioConvidado;
import controladores.ControladorTelaCadastroConvidado;

public class CadastroConvidado {
	
	
	public void telaCadastroConvidado(JFrame frameTelaMenuPrincipal, RepositorioConvidado repositorioConvidado) {
		
	 String campo01 = "Nome"; 
	 String campo02 = "Convite";
	 String campo03 = "Endereco";
	 String campo04 = "Profissao";
	 String campo05 = "Cpf";
	 String campo06 = "Email";
	 
	 JFrame frameTelaCadastroConvidado = new JFrame();
	 frameTelaCadastroConvidado.setTitle("Cadastro Convidado");
	 frameTelaCadastroConvidado.setSize(400,400);
	 
	 JPanel painelTelaCadastroConvidado = new JPanel();
	 
	 GridLayout grid = new GridLayout(0,1);
	 painelTelaCadastroConvidado.setLayout(grid);
	 
	 JLabel nome = new JLabel(campo01);
	 painelTelaCadastroConvidado.add(nome);
	 JTextField  respostaCampo01 = new JTextField(10);
	 painelTelaCadastroConvidado.add(respostaCampo01);
	 
	 JLabel cpf = new JLabel(campo05);
	 painelTelaCadastroConvidado.add(cpf);
	 JTextField  respostaCampo05 = new JTextField(10);
	 painelTelaCadastroConvidado.add(respostaCampo05);
	 
	 JLabel convite = new JLabel(campo02);
	 painelTelaCadastroConvidado.add(convite);
	 JTextField  respostaCampo02 = new JTextField(10);
	 painelTelaCadastroConvidado.add(respostaCampo02);
	 
	 JLabel Endereco = new JLabel(campo03);
	 painelTelaCadastroConvidado.add(Endereco);
	 JTextField  respostaCampo03 = new JTextField(10);
	 painelTelaCadastroConvidado.add(respostaCampo03);
	 
	 JLabel Profissao = new JLabel(campo04);
	 painelTelaCadastroConvidado.add(Profissao);
	 JTextField  respostaCampo04 = new JTextField(10);
	 painelTelaCadastroConvidado.add(respostaCampo04);
	 
	 JLabel Email = new JLabel(campo06);
	 painelTelaCadastroConvidado.add(Email);
	 JTextField  respostaCampo06 = new JTextField(10);
	 painelTelaCadastroConvidado.add(respostaCampo06);
	 
	 JButton botaoTelaCadastroConvidado = new JButton("Registrar");
	 painelTelaCadastroConvidado.add(botaoTelaCadastroConvidado);
	 
	 frameTelaCadastroConvidado.add(painelTelaCadastroConvidado);
	 frameTelaCadastroConvidado.setVisible(true);
	 
	 ControladorTelaCadastroConvidado controladorTelaCadastroConvidado = new ControladorTelaCadastroConvidado(repositorioConvidado,frameTelaMenuPrincipal,frameTelaCadastroConvidado,respostaCampo01,respostaCampo05,respostaCampo02,respostaCampo03,respostaCampo04,respostaCampo06);
	 botaoTelaCadastroConvidado.addActionListener(controladorTelaCadastroConvidado);
	 
	}

}
