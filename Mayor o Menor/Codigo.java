package asd;

import java.util.Arrays;
import java.util.Scanner;

public class NewClass4 {

	private static Scanner scanner;
    

	public static void main(String[] args){
       
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt(); 
		int [] array = new int[x];
		int rondas = scanner.nextInt();
		int cantRondas = 0;
		int c = 0;
	    
		for(c=0;c<array.length;c++) {
	    	array[c] = scanner.nextInt(); 
	    };
		
		while(cantRondas<rondas) {   //condicion para llevar cuenta de las rondas
		
	    int l = scanner.nextInt();	
	    int r = scanner.nextInt();
	    int k = scanner.nextInt();		
	
	   
	    int g = scanner.nextInt();
	    int d = scanner.nextInt();
	   
	    
		int [] intervalo = new int [(r-l)+1]; // se genera un nuevo arreglo para pasar el intervalo
		
		
		                                               
		System.arraycopy(array, l-1, intervalo, 0, (r-l)+1); // condición para pasar los elementos del primer arreglo al segundo (intervalo)
			
	
		Arrays.sort(intervalo);//se ordena el arreglo de menor a mayor
		
	    int menor = intervalo[k-1]; //el menor sera igual a la posicion k-1, y al estar ordenado nos dara el k-esimo pedido 
    
	    int n = 0;
	    int i;
	    int valor = menor;
	    
	    for(i = 0; i < intervalo.length; i++){  //cuántas veces está presente el menor elemento
	        if(intervalo[i] == valor){
	        	n++;
	        }
       }
	    
	    int dif1 = (g - n < 0) ? (g - n) *-1 : g - n;
	    int dif2 = (d - n < 0) ? (d - n) *-1 : d - n;

	    if(dif1 < dif2) {
	    	System.out.println(menor+" "+n+" "+"G");
	    }else if(dif2 < dif1) {
	    	System.out.println(menor+" "+n+" "+"D");
	    }else {
	    	System.out.println(menor+" "+n+" "+"E");
	    }
	    
	    cantRondas++; 
	}
		
  }

}