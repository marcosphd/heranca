package br.com.heranca.polimorfismo;

public class Objetoexibicao {

	public static void main(String[] args) {
		
		cachorro ca = new cachorro();
		cavalo cl = new cavalo();
		pregui�a pg = new pregui�a();
	
	// Cachorro
	ca.setNome("Bolinha");
	ca.setIdade(5);
	ca.setEmitirSom("Auau");
	ca.setCorrer("Correr");
	
	// exibi��o
	System.out.println("---------------------------------------------------------");
	System.out.println("===================CACHORRO===========================");
	System.out.println("      |"+"O nome do cachorro �: "+ ca.getNome());
	System.out.println("      |"+"A idade do cachorro �: "+ ca.getIdade()+ " Anos");
	System.out.println("      |"+"O cachorro emite esse som: "+ ca.getEmitirSom());
	System.out.println("      |"+"O cachorro sabe: "+ ca.getCorrer());
	System.out.println("======================================================");
	System.out.println("------------------------------------------------------------");
	System.out.println("");
	System.out.println("");
	//cavalo
	cl.setNome("Gal�");
	cl.setIdade(3);
	cl.setCorrer("Correr");
	cl.setEmitirSom("Hihihih");
	
	System.out.println("---------------------------------------------------------");
	System.out.println("====================CAVALO===========================");
	System.out.println("      |"+"O nome do Cavalo �: "+ cl.getNome());
	System.out.println("      |"+"A idade do cavalo �: "+ cl.getIdade() + " Anos");
	System.out.println("      |"+"O cavalo emite esse som: " + cl.getEmitirSom());
	System.out.println("      |"+"O Cavalo sabe: "+ cl.getCorrer());
	System.out.println("======================================================");
	System.out.println("------------------------------------------------------------");
	System.out.println("");
	System.out.println("");
	
	pg.setNome("Bicho Pregui�a");
	pg.setIdade(1);
	pg.setSubirArvore("Subir em todo tipo de Arvore");;
	pg.setEmitirSom("Ouhhhhh");
	
	System.out.println("------------------------------------------------------------");
	System.out.println("=====================PREGUI�A==========================");
	System.out.println("      |"+"O nome da Pregui�a: "+ pg.getNome());
	System.out.println("      |"+"A idade da Pregui�a �: "+ pg.getIdade()+ " Ano");
	System.out.println("      |"+"A Pregui�a emite esse som: " + pg.getEmitirSom());
	System.out.println("      |"+"A Pregui�a sabe: "+ pg.getSubirArvore()); 
	System.out.println("========================================================");
	System.out.println("------------------------------------------------------------");
	
	}
}
