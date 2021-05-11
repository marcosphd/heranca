package br.com.heranca.polimorfismo;

public class Objetoexibicao {

	public static void main(String[] args) {
		
		cachorro ca = new cachorro();
		cavalo cl = new cavalo();
		preguiça pg = new preguiça();
	
	// Cachorro
	ca.setNome("Bolinha");
	ca.setIdade(5);
	ca.setEmitirSom("Auau");
	ca.setCorrer("Correr");
	
	// exibição
	System.out.println("---------------------------------------------------------");
	System.out.println("===================CACHORRO===========================");
	System.out.println("      |"+"O nome do cachorro é: "+ ca.getNome());
	System.out.println("      |"+"A idade do cachorro é: "+ ca.getIdade()+ " Anos");
	System.out.println("      |"+"O cachorro emite esse som: "+ ca.getEmitirSom());
	System.out.println("      |"+"O cachorro sabe: "+ ca.getCorrer());
	System.out.println("======================================================");
	System.out.println("------------------------------------------------------------");
	System.out.println("");
	System.out.println("");
	//cavalo
	cl.setNome("Galã");
	cl.setIdade(3);
	cl.setCorrer("Correr");
	cl.setEmitirSom("Hihihih");
	
	System.out.println("---------------------------------------------------------");
	System.out.println("====================CAVALO===========================");
	System.out.println("      |"+"O nome do Cavalo é: "+ cl.getNome());
	System.out.println("      |"+"A idade do cavalo é: "+ cl.getIdade() + " Anos");
	System.out.println("      |"+"O cavalo emite esse som: " + cl.getEmitirSom());
	System.out.println("      |"+"O Cavalo sabe: "+ cl.getCorrer());
	System.out.println("======================================================");
	System.out.println("------------------------------------------------------------");
	System.out.println("");
	System.out.println("");
	
	pg.setNome("Bicho Preguiça");
	pg.setIdade(1);
	pg.setSubirArvore("Subir em todo tipo de Arvore");;
	pg.setEmitirSom("Ouhhhhh");
	
	System.out.println("------------------------------------------------------------");
	System.out.println("=====================PREGUIÇA==========================");
	System.out.println("      |"+"O nome da Preguiça: "+ pg.getNome());
	System.out.println("      |"+"A idade da Preguiça é: "+ pg.getIdade()+ " Ano");
	System.out.println("      |"+"A Preguiça emite esse som: " + pg.getEmitirSom());
	System.out.println("      |"+"A Preguiça sabe: "+ pg.getSubirArvore()); 
	System.out.println("========================================================");
	System.out.println("------------------------------------------------------------");
	
	}
}
