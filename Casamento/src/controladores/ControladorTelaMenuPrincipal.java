package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import Repositorio.RepositorioConvidado;
import telas.CadastroConvidado;
import telas.TelaDeleteConvidado;
import telas.TelaIdentificarAlterarConvidado;
import telas.TelaListaConvidado;
import telas.TelaListaConvidadoConsole;

public class ControladorTelaMenuPrincipal implements ActionListener {
	
	RepositorioConvidado repositorioConvidado = new RepositorioConvidado();
	TelaIdentificarAlterarConvidado  telaIdentificarAlterarConvidado = new TelaIdentificarAlterarConvidado();
	TelaListaConvidadoConsole telaListaConvidadoConsole = new TelaListaConvidadoConsole();
	TelaDeleteConvidado telaDeleteConvidado = new TelaDeleteConvidado();
	TelaListaConvidado telaListaConvidado = new TelaListaConvidado();
	CadastroConvidado cadastroConvidado = new CadastroConvidado();
	JTextField respostaRecebidaTelaMenuPrincipal; 
	JFrame frameTelaMenuPrincipal;

	
	public ControladorTelaMenuPrincipal(JTextField respostaRecebidaTelaMenuPrincipal, JFrame frameTelaMenuPrincipal) {
		this.respostaRecebidaTelaMenuPrincipal = respostaRecebidaTelaMenuPrincipal;
		this.frameTelaMenuPrincipal = frameTelaMenuPrincipal;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		String respotaTelaMenu = respostaRecebidaTelaMenuPrincipal.getText();
		
		switch(respotaTelaMenu){
			case "1":
			cadastroConvidado.telaCadastroConvidado(frameTelaMenuPrincipal,repositorioConvidado);
			frameTelaMenuPrincipal.setVisible(false);
			break;
			
			case "2":
				
				telaListaConvidado.exibirListaConvidado(repositorioConvidado.retornaLista(),frameTelaMenuPrincipal);
				frameTelaMenuPrincipal.setVisible(false);
				break;
			case"3":
				telaDeleteConvidado.deleteConvidado(repositorioConvidado.retornaLista(), frameTelaMenuPrincipal,repositorioConvidado);
				frameTelaMenuPrincipal.setVisible(false);
				break;
			case"4":
				telaIdentificarAlterarConvidado.IdentificarConvidado(repositorioConvidado.retornaLista(), frameTelaMenuPrincipal,repositorioConvidado);
				frameTelaMenuPrincipal.setVisible(false);
				break;
		}
		
	}

}
