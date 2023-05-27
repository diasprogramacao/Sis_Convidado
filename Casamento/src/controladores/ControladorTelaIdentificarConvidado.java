package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Repositorio.RepositorioConvidado;
import entidades.Convidado;
import telas.TelaAlterarConvidado;

public class ControladorTelaIdentificarConvidado implements ActionListener {
	

	
	JFrame frameMenuPrincipal;
	JFrame frameTelaIdentificarConvidado;
	RepositorioConvidado RepositorioRecebido;
	JTextField respostaRecebida;
	TelaAlterarConvidado  telaAlterarConvidado = new TelaAlterarConvidado();
	
	

	public ControladorTelaIdentificarConvidado(JFrame FrameMenuPrincipal,JFrame frameTelaIdentificarConvidado, RepositorioConvidado repositorio,
			JTextField respostaRecebida) {
		this.frameTelaIdentificarConvidado = frameTelaIdentificarConvidado;
		this.RepositorioRecebido = repositorio;
		this.respostaRecebida = respostaRecebida;
		this.frameMenuPrincipal= FrameMenuPrincipal;
		
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String botao = e.getActionCommand();
		
		
		if (botao == "Alterar") {
		
		Convidado ConvidadoIdentificado = new Convidado(); 
		
		ConvidadoIdentificado = RepositorioRecebido.BuscarConvidado(respostaRecebida.getText());
		
		if (ConvidadoIdentificado != null) {
					
			telaAlterarConvidado.AlterarConvidado(ConvidadoIdentificado,frameMenuPrincipal,RepositorioRecebido);
			frameTelaIdentificarConvidado.setVisible(false);
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Não foi identificado nenhum Convidado com esse CPF");
		  }
		
		}
		if (botao == "Voltar") {
			frameTelaIdentificarConvidado.setVisible(false);
			frameMenuPrincipal.setVisible(true);
			
		}
	}

}
