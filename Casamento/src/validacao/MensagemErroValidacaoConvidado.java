package validacao;

import javax.swing.JOptionPane;

import entidades.Convidado;

public class MensagemErroValidacaoConvidado {

	
	public String retornoMensagemErro (Convidado convidado) {
		
	String mensagemErro ;
		
	ValidarEntidades validarEntidades = new ValidarEntidades();
	
	if(! validarEntidades.validarEmail(convidado.getEmail())) {
		
		mensagemErro = "O e-mail "  +  convidado.getEmail() + "cadastrado é invalido" ;
		
		JOptionPane.showMessageDialog(null, mensagemErro);
		
		return mensagemErro;
	} 
	
	if (! validarEntidades.validarCpf(convidado.getCpf())) {
		
		mensagemErro = "O CPF:  "  +  convidado.getCpf() + " cadastrado é invalido" ;
		
		JOptionPane.showMessageDialog(null, mensagemErro);
		
		return mensagemErro;
	}
	
	if(!validarEntidades.validaNome(convidado.getNome())) {
		
		mensagemErro = "O nome: " + convidado.getNome() + " não é valido!!";
		
		JOptionPane.showMessageDialog(null, mensagemErro);
		
		return mensagemErro;
		
	}
	
     if(!validarEntidades.validarCpfRepitido(convidado.getCpf())) {
		
		mensagemErro = "O CPF : " + convidado.getCpf() + " Já foi cadastrado na base de dados";
		
		JOptionPane.showMessageDialog(null, mensagemErro);
		
		return mensagemErro;
	
     }
		return null;
	
	}
	
}
