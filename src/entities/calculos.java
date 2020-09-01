package entities;

public class calculos {
 
	public double wigth;
	public double height;
	
	public double area() {
		return wigth * height;
	}
	public double perimetro() {
		return 2*wigth + 2*height;
	}
	public double diagonal() {
		return Math.sqrt(Math.pow(wigth, 2) + Math.pow(height, 2));
	}
	
}
