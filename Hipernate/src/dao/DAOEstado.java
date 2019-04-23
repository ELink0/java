package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entidade.Estado;
import fabrica.Fabrica;

public class DAOEstado {
	Fabrica fabrica = new Fabrica();
	Estado estado = new Estado();
	EntityManager gerenciador = fabrica.get().createEntityManager();
	EntityTransaction transacao = gerenciador.getTransaction();
	public void inserir(String nomeEstado, String sigla) {
		fabrica.get();
		

		estado.setNome(nomeEstado);
		estado.setSigla(sigla);
		
		transacao.begin(); 
		gerenciador.persist(estado);
		transacao.commit();
	}
	
	public void deletar() {
		fabrica.get();
		estado.getId();
		transacao.remove();
		gerenciador.persist(estado);
		transacao.commit();
		
	}
}
