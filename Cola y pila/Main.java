package org.example;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Pila<Integer> pila = new Pila<>();
   static Cola<Integer> cola = new Cola<>();
    public static void main(String[] args) {
        System.out.println("Hola 1- Pila 2- Cola");
        int option = new Scanner(System.in).nextInt();
        if(option == 1) {
            menuPila();
        }
        if(option==2){
            menuCola();
        }


    }

   static void menuCola(){
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("1. Agregar elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Mostrar elementos");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número: ");
                    int numero = scanner.nextInt();
                    cola.encolar(numero);
                    break;
                case 2:
                    System.out.println("Elemento eliminado de la cola: " + cola.desencolar());
                    break;
                case 3:
                    System.out.println("Elementos de la cola: ");
                    while (cola.getLenght() > 0) {
                        System.out.println(cola.desencolar());
                    }
                    System.out.println("Elementos de la pila: ");
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

   static void menuPila(){
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("1. Agregar elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Mostrar elementos");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número: ");
                    int numero = scanner.nextInt();
                    pila.push(numero);
                    break;
                case 2:
                    System.out.println("Elemento eliminado de la pila: " + pila.pop());
                    break;
                case 3:
                    System.out.println("Elementos de la pila: ");
                    while (!pila.estaVacia()) {
                        System.out.println(pila.pop());
                    }

                    break;
                case 4:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }


}

