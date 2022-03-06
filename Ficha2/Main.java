package Ficha2;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
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
                Exe2 ficha_2 = new Exe2();
                String lido="";
                System.out.println("O número dos alunos é de 1 a 5");
                while(!lido.equals("0")){
                    switch (lido = sc.nextLine()){
                        case "a":
                            int i, j, nota;
                            for(i=0; i<5; i++){
                                System.out.printf("Notas do %dº aluno:\n", i+1);
                                for(j=0;j<5; j++){
                                    System.out.printf("Nota da %dº UC:\n", j+1);
                                    nota = sc.nextInt();
                                    ficha_2.setNota(i, j, nota);
                                }
                            }
                            break;

                        case "b":
                            System.out.println("Escolha uma UC:");
                            int uc = sc.nextInt();
                            System.out.printf("Somas das notas da %dº uc: %d\n", uc, ficha_2.somaNotasUC(uc-1));
                            break;

                        case "c":
                            System.out.println("Escolha o aluno:");
                            int aluno = sc.nextInt();
                            System.out.printf("A média das notas do %dº aluno é %f\n", aluno, ficha_2.mediaAluno(aluno-1));
                            break;

                        case "d":
                            System.out.println("Escolha uma uc:");
                            int uc_2 = sc.nextInt();
                            System.out.printf("A média das notas da %dº uc é %f\n", uc_2, ficha_2.mediaAluno(uc_2-1));
                            break;

                        case "e":
                            System.out.println("Notas mais altas de todas as UC's:");
                            int[] notasMaisAltas = ficha_2.notasMaisAltas();
                            System.out.println("1º: " + notasMaisAltas[0] + " 2º: " + notasMaisAltas[1] + " 3º: " + notasMaisAltas[2] + " 4º: " + notasMaisAltas[3] + " 5º: " + notasMaisAltas[4]);
                            break;

                        case "f":
                            System.out.println("Notas mais baixas de todas as UC's:");
                            int[] notasMaisBaixas = ficha_2.notasMaisBaixas();
                            System.out.println("1º: " + notasMaisBaixas[0] + " 2º: " + notasMaisBaixas[1] + " 3º: " + notasMaisBaixas[2] + " 4º: " + notasMaisBaixas[3] + " 5º: " + notasMaisBaixas[4]);
                            break;

                        case "g":
                            System.out.println("Notas acima de um valor:");
                            System.out.println("Escolha o valor");
                            int valor = sc.nextInt();
                            System.out.println("Notas: " + Arrays.toString(ficha_2.acimaDe(valor)));
                            break;

                        case "h":
                            System.out.println("Todas as notas de todos os alunos a todas as uc's");
                            System.out.println(ficha_2.todasAsNotas());
                            break;

                        case "i":
                            System.out.println("--O indice é dado de 0 a 4--");
                            System.out.println("Indice da uc com maior media: " + ficha_2.ucComMaiorMedia());
                            break;

                    }
                    System.out.println("Digite a próxima alínea (terminar -> 0):");
                }
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
                break;

            case 5:
                break;

            case 7:
                Exe7 ficha_7 = new Exe7();
                int i;
                int[] chave = new int[5];
                System.out.println("Chave:");
                for(i=0; i<5; i++){
                    System.out.println("Introduza o próximo número:");
                    chave[i] = sc.nextInt();
                }
                Arrays.sort(chave);

                int[] estrelas = new int[2];
                System.out.println("Estrelas:");
                for(i=0; i<2; i++){
                    System.out.println("Introduza o próximo número:");
                    estrelas[i] = sc.nextInt();
                }
                Arrays.sort(estrelas);

                ficha_7.gera();
                System.out.println("Resultados Coincidentes:");
                StringBuilder s2 = ficha_7.iguais(chave, estrelas);
                System.out.println(s2);

                if(ficha_7.resultado(chave, estrelas)){
                    StringBuilder s = new StringBuilder();

                    for(i=0; i<5; i++){
                        s.append("(");
                        s.append(chave[i]);
                        s.append(") ");
                    }

                    for(i=0; i<2; i++){
                        s.append("*");
                        s.append(estrelas[i]);
                        s.append("* ");
                    }

                    for(i=1; i<51; i++){
                        System.out.print(" ".repeat(i));
                        System.out.println(s);
                    }
                }

                //System.out.println(ficha_7.mostraChave());
                //System.out.println(ficha_7.mostraesltrela());
                break;
        }
    }
}
