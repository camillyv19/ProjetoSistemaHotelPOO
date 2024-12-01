//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Model.Cliente;
import Model.Quarto;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha = 0;
        int resposta = 0;


        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        Quarto q = new Quarto();
        Cliente c = new Cliente();

        while (escolha != 5) {
            System.out.println("---------------MENU---------------");
            System.out.println("Digite o número da opção que deseja prosseguir.");
            System.out.println(" 1. Verificar quartos disponíveis \n 2. Realizar reserva \n 3. Verificar reserva \n 4. Acesso funcionário \n 5. Sair");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("----------------QUARTOS DISPONÍVEIS----------------");
                    q.mostrarQuartos();
                    System.out.println("Deseja reservar um quarto? [1. Sim / 2. Não]");
                    resposta = sc.nextInt();


                    if (resposta == 1) {
                        System.out.println("Digite o número do quarto que deseja reservar:");
                        System.out.println("1. Individual \n2. Duplo \n3. Suíte \n4. Voltar");
                        int numeroQuarto = sc.nextInt();

                        if (numeroQuarto == 1) {
                            q.escolhaIndividual();
                            System.out.println("Informe seu nome: ");
                            String nome = sc.next();
                            c.setNome(nome);
                            System.out.println("Informe seu CPF: ");
                            String CPF = sc.next();
                            c.setCPF(CPF);
                            System.out.println("Informe seu e-mail: ");
                            String email = sc.next();
                            c.setEmail(email);
                            System.out.println("Informe seu telefone: ");
                            String telefone = sc.next();
                            c.setTelefone(telefone);

                            String reserva = "Quarto Individual reservado";
                            c.adicionarReserva(reserva);

                            listaClientes.add(c);
                            c.registrar();
                            System.out.println("Reserva realizada com sucesso!");
                            System.out.println("Voltando ao menu principal...");
                            break;

                        } else if (numeroQuarto == 2) {
                            q.escolhaDuplo();
                            System.out.println("Informe seu nome: ");
                            String nome = s.next();
                            c.setNome(nome);
                            System.out.println("Informe seu CPF: ");
                            String CPF = sc.next();
                            c.setCPF(CPF);
                            System.out.println("Informe seu e-mail: ");
                            String email = sc.next();
                            c.setEmail(email);
                            System.out.println("Informe seu telefone: ");
                            String telefone = sc.next();
                            c.setTelefone(telefone);

                            String reserva = "Quarto Duplo reservado";
                            c.adicionarReserva(reserva);

                            listaClientes.add(c);
                            c.registrar();
                            System.out.println("Reserva realizada com sucesso!");
                            System.out.println("Voltando ao menu principal...");
                            break;

                        } else if (numeroQuarto == 3) {
                            q.escolhaSuite();
                            System.out.println("Informe seu nome: ");
                            String nome = s.next();
                            c.setNome(nome);
                            System.out.println("Informe seu CPF: ");
                            String CPF = sc.next();
                            c.setCPF(CPF);
                            System.out.println("Informe seu e-mail: ");
                            String email = sc.next();
                            c.setEmail(email);
                            System.out.println("Informe seu telefone: ");
                            String telefone = sc.next();
                            c.setTelefone(telefone);

                            String reserva = "Suíte reservada";
                            c.adicionarReserva(reserva);

                            listaClientes.add(c);
                            c.registrar();
                            System.out.println("Reserva realizada com sucesso!");
                            System.out.println("Voltando ao menu principal...");
                            break;

                        } else if (numeroQuarto == 4) {
                            break;

                        }
                    } else {
                        System.out.println("Voltando ao menu principal...");
                        break;
                    }
                    break;


                case 2:
                    System.out.println("Digite o número do quarto que deseja reservar:");
                    System.out.println("1. Individual \n2. Duplo \n3. Suíte \n4. Voltar");
                    int numeroQuarto = sc.nextInt();

                    if (numeroQuarto == 1) {
                        q.escolhaIndividual();
                        System.out.println("Informe seu nome: ");
                        String nome = s.next();
                        c.setNome(nome);
                        System.out.println("Informe seu CPF: ");
                        String CPF = sc.next();
                        c.setCPF(CPF);
                        System.out.println("Informe seu e-mail: ");
                        String email = sc.next();
                        c.setEmail(email);
                        System.out.println("Informe seu telefone: ");
                        String telefone = sc.next();
                        c.setTelefone(telefone);

                        String reserva = "Quarto Individual reservado";
                        c.adicionarReserva(reserva);

                        listaClientes.add(c);
                        c.registrar();
                        System.out.println("Reserva realizada com sucesso!");
                        System.out.println("Voltando ao menu principal...");
                        break;

                    } else if (numeroQuarto == 2) {
                        q.escolhaDuplo();
                        System.out.println("Informe seu nome: ");
                        String nome = s.next();
                        c.setNome(nome);
                        System.out.println("Informe seu CPF: ");
                        String CPF = sc.next();
                        c.setCPF(CPF);
                        System.out.println("Informe seu e-mail: ");
                        String email = sc.next();
                        c.setEmail(email);
                        System.out.println("Informe seu telefone: ");
                        String telefone = sc.next();
                        c.setTelefone(telefone);

                        String reserva = "Quarto Duplo reservado";
                        c.adicionarReserva(reserva);

                        listaClientes.add(c);
                        c.registrar();
                        System.out.println("Reserva realizada com sucesso!");
                        System.out.println("Voltando ao menu principal...");
                        break;

                    } else if (numeroQuarto == 3) {
                        q.escolhaSuite();
                        System.out.println("Informe seu nome: ");
                        String nome = s.next();
                        c.setNome(nome);
                        System.out.println("Informe seu CPF: ");
                        String CPF = sc.next();
                        c.setCPF(CPF);
                        System.out.println("Informe seu e-mail: ");
                        String email = sc.next();
                        c.setEmail(email);
                        System.out.println("Informe seu telefone: ");
                        String telefone = sc.next();
                        c.setTelefone(telefone);

                        String reserva = "Suíte reservada";
                        c.adicionarReserva(reserva);

                        listaClientes.add(c);
                        c.registrar();
                        System.out.println("Reserva realizada com sucesso!");
                        System.out.println("Voltando ao menu principal...");
                        break;

                    } else if (numeroQuarto == 4) {
                        break;
                    } else {
                        System.out.println("Voltando ao menu principal...");
                        break;
                    }

                case 3:
                    System.out.println("------------HISTÓRICO DE RESERVAS------------");
                    if (listaClientes.isEmpty()) {
                        System.out.println("Nenhuma reserva foi realizada ainda.");
                    } else {
                        for (int i = 0; i < listaClientes.size(); i++) {
                            Cliente cliente = listaClientes.get(i);
                            cliente.exibirHistoricoReservas();
                            break;
                        }
                    }
                case 4:
            }



        }













    }
}
