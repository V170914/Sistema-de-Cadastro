package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Lista de pessoas
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        int opcao;

        while (true) {

            System.out.println("Menu");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Editar");
            System.out.println("4 - Remover");
            System.out.println("0 - Sair");
            System.out.println("Escolher uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.println("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.println("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Email: ");
                    String email = scanner.nextLine();

                    Pessoa pessoa = new Pessoa(idade, nome, email);
                    pessoas.add(pessoa);

                    System.out.println("Pessoa cadastrada com sucesso!");
                    break;

                case 2:
                    if (pessoas.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada.");
                    } else {
                        for (Pessoa p : pessoas) {
                            System.out.println(
                                    "Nome: " + p.getNome() +
                                            " | Idade: " + p.getIdade() +
                                            "| Email:" + p.getEmail()
                            );
                        }
                    }
                    break;

                case 3:
                    System.out.println("Digite o idade para editar: ");
                    int idadeEditar = scanner.nextInt();
                    scanner.nextLine();

                    Pessoa pessoaEditar = null;

                    for (Pessoa p : pessoas) {
                        if (p.getIdade() == idadeEditar) {
                            pessoaEditar = p;
                            break;
                        }
                    }

                    if (pessoaEditar == null) {
                        System.out.println("Pessoa nao encontrada.");
                    } else {
                        System.out.println("Novo nome: ");
                        String novoNome = scanner.nextLine();

                        System.out.println("Novo email: ");
                        String novoEmail = scanner.nextLine();

                        pessoaEditar.setNome(novoNome);
                        pessoaEditar.setEmail(novoEmail);

                        System.out.println("Pessoa editada com sucesso!");

                    }
                    break;

                case 4:

                    System.out.println("Digite o ID para remover: ");
                    int idadeRemover = scanner.nextInt();

                    Pessoa pessoaRemover = null;

                    for (Pessoa p : pessoas) {
                        if (p.getIdade() == idadeRemover) ;
                        pessoaRemover = p;
                        break;
                    }

        if (pessoaRemover == null) {
            System.out.println("Pessoa nao encontrada.");
        } else {
            pessoas.remove(pessoaRemover);
            System.out.println("Pessoa removido=a com sucesso!");
        }
        break;

        case 0:
        System.out.println("Saindo do sistema...");
        return;

        default:
            System.out.println("Opçao invalida!");
    }
}
}
        }
