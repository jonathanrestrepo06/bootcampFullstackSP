package com.Challenges;

import java.util.ArrayList;
import java.util.List;

public class Challenge1 {
	
	public static String generateString(String type) {
		String ini;
		
		int numero = (int)(Math.random() * ((99999999 - 9999999) + 1)) + 9999999;

		
		if(type.equals("Tipo A")) {
			
			ini = "54";
		}
		else if(type.equals("Tipo B")) {
			ini = "08";
		}
		else {
			System.out.println("Tipo inicorrecto");
			return null;
		}
		return ini+ String.valueOf(numero);
	}
	
	public static Boolean isConteiner(String s,List<String> list) {
		
		for(String p: list) {
			if(s.equals(p)) return false;
		}
		return true;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(generateString("Tipo A"));
		System.out.println(generateString("Tipo B"));
		
		for(int i = 0 ; i<100000;i++) {
			if(generateString("Tipo A").length()>10 || generateString("Tipo A").length()<9 ) {
				System.out.println("error" + i);
				
			}
		}
		
		List<String> lista = new ArrayList<>() ;
		
		lista.add("h33d");
		lista.add("holfsasfva");
		lista.add("holdgssga");
		lista.add("hosgssla");
		lista.add("holsgga");
		lista.add("hovssvla");
		lista.add("hola");
		
		System.out.println(isConteiner("hola", lista));
		System.out.println(isConteiner("hosgssla", lista));
		System.out.println(isConteiner("no", lista));
		System.out.println("fin");


	}

}
