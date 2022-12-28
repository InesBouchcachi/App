package appli;
import java.util.Scanner;

// pour scanner et afficher les produits 
public class Produit {
 public static Object produit(String[] args){
	    try (Scanner input = new Scanner(System.in)) {
			System.out.println("Veuillez entrer le nombre de produits product");
			int numofstu = input.nextInt();
			for (int count = numofstu; count != 0; count--){
			  if (count == numofstu) {
			    System.out.println("Nom de produit \t\t code \t\t prix ");
			  System.out.print("Entrer le nom de produit: ");
			  String name = input.next();
			  System.out.print("Entrer le code: ");
			  double code = input.nextDouble();
			  System.out.print("Entrer le prix: ");
			  double prix = input.nextDouble();
			  System.out.println(name + "\t\t" + code + "\t\t\t" + prix + "\t\t\t" );
			}
		}
	    System.out.println("fin  ");
	  }
 	  
 Object name = null;
return name ;
}}


