package tp2;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

int x = scanner.nextInt();
int z = x;
int i = x;
int contador = 1;

while(z <= x){
z = scanner.nextInt();
}

while(x <= z){
x = x + (++i);
contador++;
}

System.out.println(contador);

}
}