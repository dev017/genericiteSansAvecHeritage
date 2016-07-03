package ex1;

public class Main {
public static void main(String[] args) {
	Paire p=new Paire("abc", "xyz");
	String x=(String)p.getPremier();
	Double y=(Double)p.getSecond(); // il faut attendre l'execution pour avoir une erreur (ClassCastException)
	
	}
}
