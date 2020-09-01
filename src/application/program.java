package application;

import java.util.Locale;
import java.util.Scanner;

import entities.calculos;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	    Locale.setDefault(Locale.US);
	    
	    calculos rectangle = new calculos();
	    
	    System.out.println("Enter rectangle wigth and height: ");
	    rectangle.height = sc.nextDouble();
	    rectangle.wigth = sc.nextDouble();
	    System.out.println("AREA = " + String.format("%.2f", rectangle.area()));
	    System.out.println("PRIMETRO = " + String.format("%.2f", rectangle.perimetro()));
	    System.out.println("DIAGONAL = " + String.format("%.2f", rectangle.diagonal()));
	    
	    
	    sc.close();
	}

}
