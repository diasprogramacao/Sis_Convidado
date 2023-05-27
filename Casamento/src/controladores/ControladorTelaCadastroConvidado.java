package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Repositorio.RepositorioConvidado;
import entidades.Convidado;
import validacao.MensagemErroValidacaoConvidado;

public class ControladorTelaCadastroConvidado implements ActionListener {

	RepositorioConvidado repositorioIniciadoControladorMenuPrincipal;
	JFrame JframeMenuPrincipal;
	JFrame frameTelaCadastroConvidado;
	JTextField nome;
	JTextField cpf;
	JTextField convite;
	JTextField endereco;
	JTextField profissao;
	JTextField email;

	
	public ControladorTelaCadastroConvidado(RepositorioConvidado repositorio,JFrame frameTelaMenuPrincipal, JFrame frameTelaCadastroConvidado, JTextField nome,JTextField cpf, JTextField convite,
			JTextField endereco, JTextField profissao,JTextField email) {
		this.frameTelaCadastroConvidado = frameTelaCadastroConvidado;
		this.nome = nome;
		this.cpf = cpf;
		this.convite = convite;
		this.endereco = endereco;
		this.profissao = profissao;
		this.email = email;
		this.repositorioIniciadoControladorMenuPrincipal = repositorio;
		this.JframeMenuPrincipal = frameTelaMenuPrincipal;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (popular() != null) {
		
		repositorioIniciadoControladorMenuPrincipal.salvarConvidado(popular());
		frameTelaCadastroConvidado.setVisible(false);
		JframeMenuPrincipal.setVisible(true);
		
		}
		
	}
	
	
	public Convidado popular() {
		
		Convidado convidado = new Convidado();
		convidado.setNome(nome.getText());
		convidado.setCpf(cpf.getText());
		convidado.setConvite(convite.getText());
		convidado.setEndereco(endereco.getText());
		convidado.setProfissao(profissao.getText());
		convidado.setEmail(email.getText());
		
		MensagemErroValidacaoConvidado mensagemErroValidacaoConvidado = new MensagemErroValidacaoConvidado();
		
		if(mensagemErroValidacaoConvidado.retornoMensagemErro(convidado) == null ) {
			JOptionPane.showMessageDialog(null, "Convidado Validado!!");
			return convidado;
		} else {
			
			JOptionPane.showMessageDialog(null, "Convidado não validado");
			
			return null;
		}
		
	}
	

}
