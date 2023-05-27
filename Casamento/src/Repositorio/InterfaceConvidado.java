package Repositorio;

import java.util.List;

import entidades.Convidado;

public interface InterfaceConvidado {
	
	public void salvarConvidado(Convidado convidado);
	
	public List<Convidado> retornaLista();
	
	public Convidado BuscarConvidado(String cpf);
	
	public boolean deletarConvidado(Convidado convidado);
	
	public void alterarConvidado (Convidado convidadoAntigo,Convidado convidadoNovo);
	
}
