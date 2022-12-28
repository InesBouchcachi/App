package appli;

import java.util.Scanner;  

//pour scanner et afficher les categories 
	public class Categorie
	{  
	public void categorie(final String[] args)   
	{  
	try (Scanner sc = new Scanner(System.in)) {
		System.out.print("Veuillez entret le nombre des categories: ");   
		        
		String[] string = new String [sc.nextInt()];      

		sc.nextLine();   
		for (int i = 0; i < string.length; i++)   
		{  
		string[i] = sc.nextLine();  
		}  
		System.out.println("\nVous avez en stock les categories suivantes : ");  
 
		for (String element : string) { 
			System.out.println(element);
		}
	}
	}  
	}  


