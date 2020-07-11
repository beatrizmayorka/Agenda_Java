package Atividade;

import java.util.Scanner;

public class Agenda {
  
  private Contato[] contatos;
  int contador = 0;
  int tamanho = 0;
  Scanner scan = new Scanner(System.in);

  public Agenda(int tamanho) {
    this.tamanho = tamanho;
    this.contatos = new Contato[this.tamanho];
  }

  public void mostrarMenu() {
    int opcao = 0;

    do {
    	
      System.out.print(" ------------------------ \n");
      System.out.print(" |        Agenda        | \n");
      System.out.print(" ------------------------ \n");
      System.out.print(" | 1 - Cadastrar Contato| \n");
      System.out.print(" | 2 - Buscar Contato   | \n");
      System.out.print(" | 3 - Imprimir Agenda  | \n");
      System.out.print(" | 4 - Sair             | \n");
      System.out.print(" ------------------------ \n");
      System.out.print(" --> Opção: ");

      opcao = scan.nextInt();

      switch (opcao) {
				case 1:
					registrarContato();
					break;
				case 2:
					buscarContato();
					break;
				case 3:
					imprimirContato();
					break;
				default:
					System.out.println("\n ------------------------ ");
					System.out.println(" |   Opcao invalida.    | ");
					System.out.println(" ------------------------ \n");
			}
    } while (opcao != 4);

    scan.close();
  }

  public void registrarContato() {
    System.out.flush();

    if (this.contador < this.tamanho) {
      String nome;
      String telefone;

      System.out.print("-> Insira o nome do contato: ");
      nome = scan.next();

      System.out.print("-> Insira o telefone: ");
      telefone = scan.next();

      this.contatos[contador] = new Contato(nome, telefone);
      this.contador++;
    }
  }

  public void buscarContato() {
    String nome;
    Boolean founded = false;

    System.out.flush();

    System.out.print(" --> Digite o nome do contato: ");
    nome = scan.next();

    System.out.println(" ");
    System.out.print(" Nome\t\t");
    System.out.print(" Telefone\n");
    System.out.println(" ");

    for (int i = 0; i < this.contador; i++) {
      Contato contatoAtual = this.contatos[i];

      if (contatoAtual.getNome().equals(nome)) {
        founded = true;

        System.out.print(contatoAtual.getNome() + "\t\t");
        System.out.print(contatoAtual.getTelefone() + "\n");
      }
    }

    if (!founded) {
      System.out.flush();
      System.out.println(" ");
      System.out.println(" --> O contato nao esta na lista agenda!");
    }

    scan.nextLine();
    scan.nextLine();
  }

  public void imprimirContato() {
    System.out.flush();
    System.out.println(" ------------------------ \n");
    System.out.println(" |   Lista de contatos  | \n");
    System.out.println(" ------------------------ \n");
    System.out.print(" Nome\t\t");
    System.out.print(" Telefone\n");
    System.out.println(" ");

    for (int i = 0; i < this.contador; i++) {
      Contato contatoAtual = this.contatos[i];
      System.out.print(contatoAtual.getNome() + "\t\t");
      System.out.print(contatoAtual.getTelefone() + "\n");
    }

    scan.nextLine();
    scan.nextLine();
  }
}