package ProyectosJAVA;

import java.util.Random;
import java.util.Scanner;
public class Index {
public static void main (String args[]){

Random random = new Random();
Scanner scanner = new Scanner (System.in);

while (true){
int nRandom = random.nextInt(5);

System.out.println("NUMERO AL AZAR");
System.out.println("Digite el primer numero (o la palabra 'salir' si desea salir del juego)");
String entrada = scanner.nextLine();

if (entrada.equalsIgnoreCase("salir")){
    System.out.println("Gracias por jugar");
    break;
}

try {

    double numero = Double.parseDouble(entrada);


    if (numero == nRandom){
        System.out.println("El numero es el mismo");
        System.out.println("Su numero "+ numero);
        System.out.println("Numero de la maquina "+ nRandom);
    } else if (numero != nRandom) {
        System.out.println("El numero que digito no es el mismo de la maquina");
        System.out.println("Su numero "+ numero);
        System.out.println("Numero de la maquina "+ nRandom);
    }
    } catch (Exception e) {
        System.out.println("Entrada no válida. Por favor, ingrese un número o 'salir'.");
    }
        }
    }
}