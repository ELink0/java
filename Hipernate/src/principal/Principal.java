package principal;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dao.DAOEstado;
import entidade.Estado;

public class Principal {
	
	Scanner scan = new Scanner(System.in);
	
	static DAOEstado dao = new DAOEstado();
	
	public static void main(String args[]) {
		
		String nomeEstado="Espirito Santo";
		String sigla="ES";
		dao.inserir(nomeEstado, sigla);
		
	}
	
}
