package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ControladorTelaListaConvidado implements ActionListener {
	
	JFrame TelaListaConvidado;
	JFrame TelaMenuPrincipal;
	
	

	public ControladorTelaListaConvidado(JFrame telaListaConvidado, JFrame telaMenuPrincipal) {
		TelaListaConvidado = telaListaConvidado;
		TelaMenuPrincipal = telaMenuPrincipal;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		TelaListaConvidado.setVisible(false);
		TelaMenuPrincipal.setVisible(true);
		
	}

}
