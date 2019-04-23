package fabrica;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fabrica {
	public static EntityManagerFactory get() {
/*		try {
			if(EntityManagerFactory == null) {
				EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("ProjetoAula");
			}
		}*/
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("ProjetoAula");
		
		return fabrica;
	}
	
//	EntityTransaction transacao = gerenciador.getTransaction();
}
