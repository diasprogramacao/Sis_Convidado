package telas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controladores.ControladorTelaMenuPrincipal;

public class MenuPrincipal {
	
	public void TelaMenuPrincipal() {
		
	 String opcao01 = "1 - Cadastrar Convidado";
	 String opcao02 = "2 - Listar Convidado";
	 String opcao03 = "3 - Deletar";
	 String opcao04 = "4 - Alterar"; 

	 
	 JFrame frameTelaMenuPrincipal = new JFrame();
	 frameTelaMenuPrincipal.setSize(300,300);
	 frameTelaMenuPrincipal.setTitle("Menu Principal");
	 
	 
	 JPanel painelTelaMenuPrincipal = new JPanel();
	 
	 GridLayout grid = new GridLayout (0,1);
	 painelTelaMenuPrincipal.setLayout(grid);
	 
	 JLabel textOpcao01 = new JLabel(opcao01);
	 painelTelaMenuPrincipal.add(textOpcao01);
	 
	 JLabel textOpcao02 = new JLabel(opcao02);
	 painelTelaMenuPrincipal.add(textOpcao02);
	 
	 JLabel textOpcao03 = new JLabel(opcao03);
	 painelTelaMenuPrincipal.add(textOpcao03);
	 
	 JLabel textOpcao04 = new JLabel(opcao04);
	 painelTelaMenuPrincipal.add(textOpcao04);
	 
	 JTextField textoRecebido = new JTextField(10);
	 painelTelaMenuPrincipal.add(textoRecebido);
	 
	 JButton botaoMenuPrincipal = new JButton("Confirmar");
	 painelTelaMenuPrincipal.add(botaoMenuPrincipal);
	 
	 frameTelaMenuPrincipal.add(painelTelaMenuPrincipal);
	 frameTelaMenuPrincipal.setVisible(true);
	 
	 ControladorTelaMenuPrincipal controladorTelaMenuPrincipal = new ControladorTelaMenuPrincipal(textoRecebido,frameTelaMenuPrincipal);
	 botaoMenuPrincipal.addActionListener(controladorTelaMenuPrincipal);
	 
	}

}
