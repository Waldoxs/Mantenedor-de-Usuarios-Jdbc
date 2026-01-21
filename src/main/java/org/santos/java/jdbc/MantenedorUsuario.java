package org.santos.java.jdbc;

import java.util.Scanner;

public class MantenedorUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====[Menú]=====\n" +
                "[1] Actualizar \n" +
                "[2] Eliminar \n" +
                "[3] Crear \n" +
                "[4] Listar \n" +
                "[5] Salir");
        System.out.print("Ingresa del 1-5 la opción: ");

        int opciones;
        do {
            opciones = scanner.nextInt();
            switch (opciones) {
                case 1:

                    System.out.println("op1");

//                    System.out.println("Seleccione una nueva opción");
//                    main(args);
                    break;
                case 2:
                    System.out.println("op2");
                    break;
                case 3:
                    System.out.println("op3");
                    break;
                case 4:
                    System.out.println("op4");
                    break;
                case 5:
                    System.out.println("Salida con éxito!");
                    System.exit(0);
                    break;
                default:
                    System.out.print("Número no reconocido... Vuelva a intentar: ");
                    main(args);
            }

        } while (true);

    }
}


