package ex3;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

	// <? extends Employe> permet à la fonction d’afficher n’importe quel objet de type collection héritant de la classe Employe.
   //	<? super Employe> L’instruction suivante permet d’afficher les objets de type collection qui eux mêmes sont les superclasse de la classe Employe
  // Collection<Employe> list affiche une erreur
	
	static void afficher(Collection<? extends Employe> list) {
		for (Employe e : list) {
			System.out.println(e.toString());
		}
	}

	static void afficherr(Collection<? super Manager> list) {
		for (Object e : list) {
			System.out.println(e.toString());
		}
	}

	
	public static void main(String[] args) {
	
		Collection<Employe> listEmploye=new ArrayList<Employe>();
		Collection<Manager> listManager=new ArrayList<Manager>();
		
		Employe emp1=new Employe("Nom 1", "Prenom 1");
		Employe emp2=new Employe("Nom 2", "Prenom 2");
		Manager man1=new  Manager("Nom 3", "Prenoml 3");
		
		listEmploye.add(emp1);
		listEmploye.add(emp2);
		listManager.add(man1);
		
		System.out.println(" ############# <? extends Employe> ##############");
		
		afficher(listEmploye);
		afficher(listManager); 
		
		System.out.println("############## <? super Manager>############");
		
		afficherr(listEmploye);
		afficherr(listManager); 
		
	}
}
