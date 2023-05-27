package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Repositorio.RepositorioConvidado;
import entidades.Convidado;
import validacao.MensagemErroValidacaoConvidado;

public class ControladorAlterarConvidado implements ActionListener {
	
	
	public ControladorAlterarConvidado(JFrame frameTelaAlterar, JFrame frameMenuPrincipal, Convidado convidadoRecebido,
			RepositorioConvidado repositorioRecebido, JTextField nomeAntigo, JTextField cpfAntigo,
			JTextField conviteAntigo, JTextField enderecoAntigo, JTextField profissaoAntigo, JTextField emailAntigo) {
		
		this.frameTelaAlterar = frameTelaAlterar;
		this.frameMenuPrincipal = frameMenuPrincipal;
		this.convidadoRecebido = convidadoRecebido;
		RepositorioRecebido = repositorioRecebido;
		this.nomeAntigo = nomeAntigo;
		this.cpfAntigo = cpfAntigo;
		this.conviteAntigo = conviteAntigo;
		this.enderecoAntigo = enderecoAntigo;
		this.profissaoAntigo = profissaoAntigo;
		this.emailAntigo = emailAntigo;
		
	}

	JFrame frameTelaAlterar;
	JFrame frameMenuPrincipal;
	Convidado convidadoRecebido;
	RepositorioConvidado RepositorioRecebido;
	JTextField nomeAntigo;
	JTextField cpfAntigo;
	JTextField conviteAntigo;
	JTextField enderecoAntigo;
	JTextField profissaoAntigo;
	JTextField emailAntigo;

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(popularConvidado() != null) {
		
		RepositorioRecebido.alterarConvidado(convidadoRecebido, popularConvidado());
		frameTelaAlterar.setVisible(false);
		frameMenuPrincipal.setVisible(true);
		}
	}
	
	public Convidado  popularConvidado() {
		
		Convidado convidadoNovo = new Convidado();
		
		convidadoNovo.setNome(nomeAntigo.getText());
		convidadoNovo.setCpf(cpfAntigo.getText());
		convidadoNovo.setConvite(conviteAntigo.getText());
		convidadoNovo.setEndereco(enderecoAntigo.getText());
		convidadoNovo.setProfissao(profissaoAntigo.getText());	
		convidadoNovo.setEmail(emailAntigo.getText());
		
		MensagemErroValidacaoConvidado mensagemErroValidacaoConvidado = new MensagemErroValidacaoConvidado();
		
		if(mensagemErroValidacaoConvidado.retornoMensagemErro(convidadoNovo) == null) {
			
			JOptionPane.showMessageDialog(null, "Alteração é valida");
			
			return convidadoNovo;
			
		} else {
			
			JOptionPane.showMessageDialog(null, "Alteração invalida");
			return null;
			
		}
		
		
	}

}
