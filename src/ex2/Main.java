package ex2;

public class Main {
public static void main(String[] args) {
	Paire<String> p=new Paire<String>("abc", "xyz");
	String x=p.getPremier();
//	Double y=p.getSecond(); // erreur de compilation (Type mismatch)
	
	
	Paire<Integer> pp=new Paire<Integer>(11, 166);
	Integer i =pp.getPremier();
	System.out.println(i);
	}
}
