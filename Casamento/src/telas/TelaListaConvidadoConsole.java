package telas;

import java.util.ArrayList;
import java.util.List;

import Repositorio.RepositorioConvidado;
import entidades.Convidado;



public class TelaListaConvidadoConsole {
	
	List<Convidado> listaConvidadoCompleta = new ArrayList<>();

	public void telaListaConvidado (RepositorioConvidado repositorio) {
		
		listaConvidadoCompleta = repositorio.retornaLista();
		
		for(Convidado convidadoo: listaConvidadoCompleta ){
			System.out.println(convidadoo.getNome());
			System.out.println(convidadoo.getConvite());
			System.out.println(convidadoo.getEndereco());
			System.out.println(convidadoo.getProfissao());
			
			
		}
	}
	
	
	
}