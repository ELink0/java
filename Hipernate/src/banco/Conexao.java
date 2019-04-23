package banco;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("ProjetoAula"); // faz a conexão com o banco de dados
}
