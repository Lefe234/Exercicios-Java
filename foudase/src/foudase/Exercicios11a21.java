package foudase;
import java.util.Scanner;

public class Exercicios11a21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== 1 =====
        System.out.println("Exercício 1:");
        String nomeCompleto = "João da Silva";
        for (String palavra : nomeCompleto.split(" ")) {
            System.out.println(palavra);
        }

        // ===== 2 =====
        System.out.println("\nExercício 2:");
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();
        System.out.println("Antecessor: " + (num - 1));

        // ===== 3 =====
        System.out.println("\nExercício 3:");
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();
        System.out.println("Multiplicação = " + (a * b));

        // ===== 4 =====
        System.out.println("\nExercício 4:");
        System.out.print("Digite o primeiro número: ");
        int x = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int y = sc.nextInt();
        System.out.println("Resto da divisão = " + (x % y));

        // ===== 5 =====
        System.out.println("\nExercício 5:");
        System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();
        double reajustado = salario * 1.07;
        System.out.printf("Salário reajustado: R$ %.2f%n", reajustado);

        // ===== 6 =====
        System.out.println("\nExercício 6:");
        System.out.print("Digite X: ");
        int X = sc.nextInt();
        System.out.print("Digite Y: ");
        int Y = sc.nextInt();
        System.out.println("Antes da troca: X = " + X + ", Y = " + Y);
        int temp = X;
        X = Y;
        Y = temp;
        System.out.println("Depois da troca: X = " + X + ", Y = " + Y);

        // ===== 7 =====
        sc.nextLine(); 
        System.out.println("\nExercício 7:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Endereço: ");
        String endereco = sc.nextLine();
        System.out.print("Telefone: ");
        String telefone = sc.nextLine();
        System.out.println("Nome: " + nome + ", Endereço: " + endereco + ", Telefone: " + telefone);

        // ===== 8 =====
        System.out.println("\nExercício 8:");
        System.out.print("Digite o primeiro valor: ");
        double v1 = sc.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double v2 = sc.nextDouble();
        if (v1 == v2)
            System.out.println("Os valores são iguais.");
        else
            System.out.println("Os valores são diferentes.");

        // ===== 9 =====
        System.out.println("\nExercício 9:");
        System.out.print("Digite o primeiro valor: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double n2 = sc.nextDouble();
        if (n1 > n2)
            System.out.println(n1 + " é maior.");
        else if (n2 > n1)
            System.out.println(n2 + " é maior.");
        else
            System.out.println("Os valores são iguais.");

        // ===== 10 =====
        System.out.println("\nExercício 10:");
        System.out.print("Digite seu sexo (M/F): ");
        char sexo = sc.next().toUpperCase().charAt(0);
        if (sexo == 'M')
            System.out.println("Seja bem-vindo, Senhor!");
        else if (sexo == 'F')
            System.out.println("Seja bem-vinda, Senhora!");
        else
            System.out.println("Sexo inválido!");
        
        // ===== 11 =====
        System.out.println("Exercício 11 - Menu de operações:");
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Escolha uma operação:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");

        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Soma = " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtração = " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplicação = " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0)
                    System.out.println("Divisão = " + (num1 / num2));
                else
                    System.out.println("Erro: divisão por zero!");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        // ===== 12 =====
        System.out.println("\nExercício 12 - While:");
        int i = 1;
        while (i <= 20) {
            System.out.println(i + " - Eu gosto de estudar Algoritmos!");
            i++;
        }

        // ===== 13 =====
        System.out.println("\nExercício 13 - Do...While:");
        int j = 1;
        do {
            System.out.println(j + " - Eu gosto de estudar Algoritmos!");
            j++;
        } while (j <= 20);

        // ===== 14 =====
        System.out.println("\nExercício 14 - For:");
        for (int k = 1; k <= 20; k++) {
            System.out.println(k + " - Eu gosto de estudar Algoritmos!");
        }

        // ===== 15 =====
        System.out.println("\nExercício 15 - Média das turmas:");
        System.out.print("Digite o número de turmas: ");
        int turmas = sc.nextInt();
        double somaMedias = 0;

        for (int t = 1; t <= turmas; t++) {
            System.out.print("Quantidade de alunos da turma " + t + ": ");
            int alunos = sc.nextInt();
            double somaNotas = 0;

            for (int a2 = 1; a <= alunos; a2++) {
                System.out.print("Média do aluno " + a2 + ": ");
                double mediaAluno = sc.nextDouble();
                somaNotas += mediaAluno;
            }

            double mediaTurma = somaNotas / alunos;
            System.out.printf("Média da turma %d: %.2f%n", t, mediaTurma);
            somaMedias += mediaTurma;
        }

        double mediaGeral = somaMedias / turmas;
        System.out.printf("Média geral das turmas: %.2f%n", mediaGeral);

        // ===== 16 =====
        System.out.println("\nExercício 16 - Caixa de supermercado:");
        boolean continuar = true;

        while (continuar) {
            double total = 0;
            while (true) {
                System.out.print("Digite o preço do produto (ou 0 para finalizar): ");
                double preco = sc.nextDouble();
                if (preco == 0)
                    break;
                total += preco;
            }

            System.out.printf("Total da compra: R$ %.2f%n", total);

            System.out.print("Fechar o caixa? (S/N): ");
            char resp = sc.next().toUpperCase().charAt(0);
            if (resp == 'S')
                continuar = false;
        }

        // ===== 17 =====
        System.out.println("\nExercício 17 - Loja de animais:");
        System.out.print("Digite a quantidade total de animais: ");
        int totalAnimais = sc.nextInt();
        int gatos = 0, cachorros = 0;

        for (int n = 1; n <= totalAnimais; n++) {
            System.out.print("O animal " + n + " é gato (G) ou cachorro (C)? ");
            char tipo = sc.next().toUpperCase().charAt(0);
            if (tipo == 'G') gatos++;
            else if (tipo == 'C') cachorros++;
        }

        System.out.println("Total de gatos: " + gatos);
        System.out.println("Total de cachorros: " + cachorros);

        // ===== 18 =====
        System.out.println("\nExercício 18 - Média de alunos:");
        System.out.print("Quantidade de alunos: ");
        int qtdAlunos = sc.nextInt();

        for (int a1 = 1; a1 <= qtdAlunos; a1++) {
            System.out.print("Nota 1 do aluno " + a1 + ": ");
            double n20 = sc.nextDouble();
            System.out.print("Nota 2 do aluno " + a1 + ": ");
            double n21 = sc.nextDouble();

            double media = (n20 + n21) / 2;
            if (media >= 6)
                System.out.printf("Aluno %d aprovado! Média = %.2f%n", a1, media);
            else
                System.out.printf("Aluno %d reprovado! Média = %.2f%n", a1, media);
        }

        // ===== 19 =====
        System.out.println("\nExercício 19 - Cálculo de IMC:");
        System.out.print("Quantidade de pessoas: ");
        int pessoas = sc.nextInt();

        for (int p = 1; p <= pessoas; p++) {
            System.out.print("Peso da pessoa " + p + " (kg): ");
            double peso = sc.nextDouble();
            System.out.print("Altura da pessoa " + p + " (m): ");
            double altura = sc.nextDouble();

            double imc = peso / (altura * altura);
            System.out.printf("IMC da pessoa %d: %.2f - ", p, imc);

            if (imc < 18.5) System.out.println("Abaixo do peso");
            else if (imc < 25) System.out.println("Peso normal");
            else if (imc < 30) System.out.println("Sobrepeso");
            else System.out.println("Obesidade");
        }

        // ===== 20 =====
        System.out.println("\nExercício 20 - Jogo de adivinhação:");
        int respostaCerta = (int) (Math.random() * 10) + 1;
        int tentativa;
        do {
            System.out.print("Adivinhe o número (1 a 10): ");
            tentativa = sc.nextInt();
            if (tentativa != respostaCerta)
                System.out.println("Errado! Tente novamente...");
        } while (tentativa != respostaCerta);
        System.out.println("Acertou!");

        // ===== 21 =====
        System.out.println("\nExercício 21 - Padrão de estrelas:");
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        for (int linha = 1; linha <= n; linha++) {
            for (int estrela = 1; estrela <= linha; estrela++) {
                System.out.print("*");
            }
            System.out.println();
 
        }
        // ===== 22 =====
        System.out.println("\nExercício 22 - Direito a férias:");
        System.out.print("Digite a quantidade de funcionários: ");
        int qtdFuncionarios = sc.nextInt();
        sc.nextLine(); 
        
        int comFerias = 0;
        int semFerias = 0;

        for (int f = 1; f <= qtdFuncionarios; f++) {
            System.out.print("Nome do funcionário " + f + ": ");
            String nome1 = sc.nextLine();
            System.out.print("Tempo de serviço (em meses): ");
            int meses = sc.nextInt();
            sc.nextLine(); 

            if (meses > 12) {
                System.out.println(nome1 + " tem direito a férias.");
                comFerias++;
            } else {
                System.out.println(nome1 + " não tem direito a férias.");
                semFerias++;
            }
        }

        System.out.println("\nResumo final:");
        System.out.println("Funcionários com direito a férias: " + comFerias);
        System.out.println("Funcionários sem direito a férias: " + semFerias);
        sc.close();
    }
}

