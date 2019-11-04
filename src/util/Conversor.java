package util;

public class Conversor {
	
	public static double IOF = 0.06;
	
	public static double converte(double dollar, double valor) {
		return (dollar + (dollar * IOF)) * valor ; 
		
	}

}
