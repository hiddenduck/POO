package Ficha2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número do exercício:");
        switch (sc.nextInt()) {
            case 1:
                Exe1 ficha_1 = new Exe1();
                System.out.println("Escolha a alinea");
                switch (sc.next()) {
                case "a":
                    System.out.println("Introduza o número de inteiros:");
                    int n = sc.nextInt();
                    int[] array = new int[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Insira o próximo inteiro:");
                        array[i] = sc.nextInt();
                    }

                    System.out.println("Valor Minimo do arrray é " + ficha_1.minimo(array));
                    break;

                case "b":
                    System.out.println("Introduza o número de inteiros:");
                    int n2 = sc.nextInt();
                    int[] array2 = new int[n2];
                    for (int i = 0; i < n2; i++) {
                        System.out.println("Insira o próximo inteiro:");
                        array2[i] = sc.nextInt();
                    }

                    System.out.println("Introduza o primeiro indice:");
                    int primeiro = sc.nextInt();
                    System.out.println("Introduza o segundo indice:");
                    int segundo = sc.nextInt();

                    System.out.println("O array entre " + primeiro + " e " + segundo + ": " + Arrays.toString(ficha_1.entreInd(array2, primeiro, segundo)));
                    break;

                case "c":
                    System.out.println("Primeiro Array:");
                    System.out.println("Introduza o número de inteiros:");
                    int nC = sc.nextInt();
                    int[] arrayC = new int[nC];
                    for (int i = 0; i < nC; i++) {
                        System.out.println("Insira o próximo inteiro:");
                        arrayC[i] = sc.nextInt();
                    }
                    System.out.println("Segundo Array:");
                    System.out.println("Introduza o número de inteiros:");
                    int nC2 = sc.nextInt();
                    int[] arrayC2 = new int[nC2];
                    for (int i = 0; i < nC2; i++) {
                        System.out.println("Insira o próximo inteiro:");
                        arrayC2[i] = sc.nextInt();
                    }

                    System.out.println("O array em comum entre o primeiro array (" + Arrays.toString(arrayC) + ") e o segundo array (" + Arrays.toString(arrayC2) + "): " + Arrays.toString(ficha_1.emComum(arrayC, arrayC2)));
                    break;
                }
                break;

            case 2:
                


                break;

            case 3:

                break;

            case 4:
                Exe4 ficha_4 = new Exe4();
                System.out.println("Criação de um Array antes da escolha da alínea:");
                System.out.println("Introduza o número de inteiros:");
                int n = sc.nextInt();
                int[] array = new int[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("Insira o próximo inteiro:");
                    array[i] = sc.nextInt();
                }
                System.out.println("Escolha a alinea");
                switch (sc.next()) {
                    case "a":
                        System.out.printf("Ordenação do array %s: ", Arrays.toString(array));
                        ficha_4.arraySort(array);
                        System.out.printf("%s", Arrays.toString(array));
                        break;

                    case "b":
                        System.out.println("Introduza um elemento que pretenda procurar no array:");
                        int find = sc.nextInt();
                        int ind = ficha_4.arrayBinarySearch(array, find);
                        System.out.println("O elemento " + find + ((ind >= 0) ? (" está no indice " + ind) : (" não está no array")));
                        break;
                }

        }
    }
}
