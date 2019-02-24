package listaUm;

public class Ordenador {
	public int arrayDeValores[];
	public int saida;
	
	public int inverterValores () {
        for ( int i =  arrayDeValores.length - 1 ; i >= 0 ; i-- ) {
            saida = saida + arrayDeValores[i] +"\n"; // /n é opcional, apenas para separar por linha mesmo
            System.out.println ( saida );
	}
        return inverterValores();
}
}
