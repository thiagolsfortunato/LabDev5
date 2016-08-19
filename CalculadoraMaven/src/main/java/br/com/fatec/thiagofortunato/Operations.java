package br.com.fatec.thiagofortunato;

public class Operations {
	
	public static Float sum (Float value1, Float value2){
		return value1 + value2;
	}
	
	public static Float subtract (Float value1, Float value2){
		return value1 - value2;
	}
	
	public static Float multiply (Float value1, Float value2){
		return value1 * value2;
	}
	
	public static Float divide (Float value1, Float value2){
		if(value2 != 0){
			return value1 / value2;
		}else{
			return (float) 0;
		}		
	}
}
