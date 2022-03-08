package br.com.generation.heranca;

public class TestaTudo {

	public static void main(String[] args) {
		
		Animal an = new Animal();
		Cachorro cr = new Cachorro();
		Cavalo cv = new Cavalo ();
		Preguica pr = new Preguica();
		
		cr.setNome("Kin");
		cr.setEspecie("pug");
		cr.setSom("latido");
		
		System.out.println("Cachorro");
		System.out.println("Nome: " + cr.getNome());
		System.out.println("Espécie: " + cr.getEspecie());
		System.out.println("Som emitido: " + cr.getSom());

		System.out.println();
		
		cv.setNome("Marrento");
		cv.setEspecie("andaluz");
		cv.setSom("relinche");
		
		System.out.println("Cavalo");
		System.out.println("Nome: " + cv.getNome());
		System.out.println("Espécie: " + cv.getEspecie());
		System.out.println("Som emitido: " + cv.getSom());

		System.out.println();
		
		pr.setNome("Preguicinha");
		pr.setEspecie("bentinho");
		pr.setSom("gritinhos");
		
		System.out.println("Bicho-Preguiça");
		System.out.println("Nome: " + pr.getNome());
		System.out.println("Espécie: " + pr.getEspecie());
		System.out.println("Som emitido: " + pr.getSom());

	}

}
