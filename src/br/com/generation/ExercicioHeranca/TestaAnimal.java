package br.com.generation.ExercicioHeranca;

public class TestaAnimal {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Cavalo cav = new Cavalo();
		Preguiça preg = new Preguiça();
		
		preg.setNome("Clovis");
		preg.setIdade(5);
		
		cav.setNome("Mustang");
		cav.setIdade(7);
		
		dog.setNome("Smolk");
		dog.setIdade(5);
		
		System.out.println("O nome do Cachorro é: "		+ dog.getNome());
		System.out.println("Sua idade em anos é: "		+ dog.getIdade());
		System.out.println();
		dog.correr();
		
		System.out.println();
		System.out.println("O nome do Cavalo é: "		+ cav.getNome());
		System.out.println("A idade dele é: "           + cav.getIdade());
		System.out.println();
		cav.cavalgar();
		
		System.out.println();
		System.out.println("O nome da preguiça é: "     + preg.getNome());
		System.out.println("A idade dele é: "           + preg.getIdade());
		System.out.println();
		preg.Subir();

	}
	

}
