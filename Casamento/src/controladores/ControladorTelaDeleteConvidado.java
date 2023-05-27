package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Repositorio.RepositorioConvidado;
import entidades.Convidado;

public class ControladorTelaDeleteConvidado implements ActionListener {
	
	
	JTextField CpfRecebidoTelaDeleConvidado;
	RepositorioConvidado repositorioRecebidoTelaMenuPrincipal;
	JFrame frameMenuPrincipalRecebido;
	JFrame frameTelaDeleteConvidadoRecebido;
	

	
	public ControladorTelaDeleteConvidado(JTextField cpfRecebidoTelaDeleConvidado,
			RepositorioConvidado repositorioRecebidoTelaMenuPrincipal,JFrame FrameMenuPrincipalRecebido,JFrame FrameTelaDeleteConvidadoRecebido ) {
		CpfRecebidoTelaDeleConvidado = cpfRecebidoTelaDeleConvidado;
		this.repositorioRecebidoTelaMenuPrincipal = repositorioRecebidoTelaMenuPrincipal;
		this.frameMenuPrincipalRecebido = FrameMenuPrincipalRecebido;
		this.frameTelaDeleteConvidadoRecebido = FrameTelaDeleteConvidadoRecebido;
	}

  

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String botao = e.getActionCommand();
		
		if (botao == "deletar") {
		
		Convidado convidadoDelete = new Convidado();
		
		convidadoDelete = repositorioRecebidoTelaMenuPrincipal.BuscarConvidado(CpfRecebidoTelaDeleConvidado.getText());
	
		if (convidadoDelete != null) {
			repositorioRecebidoTelaMenuPrincipal.deletarConvidado(convidadoDelete);
			JOptionPane.showMessageDialog(null, "O Convidado " + convidadoDelete.getNome() + " Foi Deletado");
			frameTelaDeleteConvidadoRecebido.setVisible(false);
			frameMenuPrincipalRecebido.setVisible(true);
			
		} 
		
		else {
			JOptionPane.showMessageDialog(null,"Não foi encontrado nenhum convidado com esse CPF.");
		}
		
	  } 
		
		if (botao == "Voltar") {
			frameTelaDeleteConvidadoRecebido.setVisible(false);
			frameMenuPrincipalRecebido.setVisible(true);
		}
		
	}
}
