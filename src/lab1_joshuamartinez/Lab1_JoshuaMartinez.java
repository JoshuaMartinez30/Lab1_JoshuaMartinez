
package lab1_joshuamartinez;

import java.util.Scanner;


public class Lab1_JoshuaMartinez {

    static char[][] Jugador_1 = new char[8][8];
    static char[][] Jugador_2 = new char[8][8];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < Jugador_1.length; i++) {
            for (int j = 0; j < Jugador_1[i].length; j++) {
                if (i == 1 && j == 1 || i == 1 && j == 2 || i == 1 && j == 3) {
                    Jugador_1[i][j] = 'o';
                } else if (i == 2 && j == 7 || i == 3 && j == 7 || i == 4 && j == 7) {
                    Jugador_1[i][j] = 'o';
                } else if (i == 3 && j == 4 || i == 4 && j == 4 || i == 5 && j == 4) {
                    Jugador_1[i][j] = 'o';
                } else if (i == 7 && j == 1 || i == 7 && j == 2 || i == 7 && j == 3) {
                    Jugador_1[i][j] = 'o';
                } else {
                    Jugador_1[i][j] = '*';
                }
            }
            System.out.println("");
        }

        for (int i = 0; i < Jugador_2.length; i++) {
            for (int j = 0; j < Jugador_2[i].length; j++) {
                if (i == 0 && j == 1 || i == 0 && j == 2 || i == 0 && j == 3) {
                    Jugador_2[i][j] = 'o';
                } else if (i == 7 && j == 1 || i == 6 && j == 1 || i == 5 && j == 1) {
                    Jugador_2[i][j] = 'o';
                } else if (i == 6 && j == 4 || i == 5 && j == 4 || i == 4 && j == 4) {
                    Jugador_2[i][j] = 'o';
                } else if (i == 3 && j == 5 || i == 3 && j == 6 || i == 3 && j == 7) {
                    Jugador_2[i][j] = 'o';
                } else {
                    Jugador_2[i][j] = '*';
                }

            }
            System.out.println("");
        }
        System.out.println("Jugador1");
        Mostrar(Jugador_1);
        System.out.println("");
        System.out.println("Jugador2");
        Mostrar(Jugador_2);
        double vidaJ1 = 100.00;
        double vidaJ2 = 100.00;
        double turnos = 0, partesD1 = 0, partesD2 = 0;
        double resultado = 0.0, resultado2 = 0.0;
        int x, y;
        int n = 0;
        while (turnos <= 100) {
            if (n == 0) {
                System.out.println("Turno Jugador1");
                System.out.println("Ingrese coordenadas de ataque");
                System.out.println("Ingrese coordenadas de x: ");
                x = input.nextInt();
                while (x < 0 || x > 7) {
                    System.out.println("Error, ingrese coordenadas de 0 a 7");
                    System.out.println("Ingrese coordenadas x: ");
                    x = input.nextInt();
                }
                System.out.println("Ingrese coordenadas y: ");
                y = input.nextInt();
                while (x < 0 || x > 7) {
                    System.out.println("Error, ingrese coordenadas de 0 a 7");
                    System.out.println("Ingrese coordenadas y: ");
                    y = input.nextInt();
                }
                for (int i = 0; i < Jugador_2.length; i++) {
                    for (int j = 0; j < Jugador_2[i].length; j++) {
                        if (Jugador_2[x][y] == 'o') {
                            Jugador_2[x][y] = 'x';
                            partesD2++;
                            i = Jugador_2.length - 1;
                            j = Jugador_2.length - 1;
                        } else {
                            System.out.println("El ataque cayo al agua");
                            i = Jugador_2.length - 1;
                            j = Jugador_2.length - 1;
                        }
                    }
                }
                resultado2 = 100 - ((partesD2 / 12) * 100);
                vidaJ2 = resultado2;
                System.out.println("Vida del Jugador1: " + vidaJ1);
                System.out.println("Jugador1");
                Mostrar(Jugador_1);
                System.out.println("");
                System.out.println("Vida del Jugador2: " + vidaJ2);
                System.out.println("Partes de barcos dañados: " + partesD2);
                System.out.println("Jugador2");
                Mostrar(Jugador_2);

                if (partesD2 >= 3 && vidaJ1 == 100.00) {
                    System.out.println("El jugador1 ah gando");
                    turnos = 100;
                }
                n = 1;
                turnos++;
            } else if (n == 1) {
                System.out.println("Turno Jugador2");
                System.out.println("Ingrese coordenadas de ataque");
                System.out.println("Ingrese coordenadas de x: ");
                x = input.nextInt();
                while (x < 0 || x > 7) {
                    System.out.println("Error, ingrese coordenadas de 0 a 7");
                    System.out.println("Ingrese coordenadas x: ");
                    x = input.nextInt();
                }
                System.out.println("Ingrese coordenadas y: ");
                y = input.nextInt();
                while (x < 0 || x > 7) {
                    System.out.println("Error, ingrese coordenadas de 0 a 7");
                    System.out.println("Ingrese coordenadas y: ");
                    y = input.nextInt();
                }
                for (int i = 0; i < Jugador_1.length; i++) {
                    for (int j = 0; j < Jugador_1[i].length; j++) {
                        if (Jugador_1[x][y] == 'o') {
                            Jugador_1[x][y] = 'x';
                            partesD1++;
                            i = Jugador_1.length - 1;
                            j = Jugador_1.length - 1;

                        } else {
                            System.out.println("El ataque cayo al agua");
                            i = Jugador_1.length - 1;
                            j = Jugador_1.length - 1;
                        }
                    }
                }
                resultado = 100 - ((partesD1 / 12) * 100);
                vidaJ1 = resultado;
                System.out.println("Vida del Jugador1: " + vidaJ1);
                System.out.println("Partes de barcos dañados:" + partesD1);
                System.out.println("Jugador1");
                Mostrar(Jugador_1);
                System.out.println("");
                System.out.println("Vida del Jugador2: " + vidaJ2);
                System.out.println("Jugador2");
                Mostrar(Jugador_2);
                if (partesD1 >= 3 && vidaJ2 == 100.00) {
                    System.out.println("El jugador2 ah gando");
                    turnos = 100;
                }
                n = 0;
                turnos++;
            }

        }

    }

    public static void Mostrar(char[][] Matriz) {
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                System.out.print("[" + Matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

    

}