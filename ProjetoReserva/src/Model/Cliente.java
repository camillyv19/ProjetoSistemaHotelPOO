package Model;
import java.util.ArrayList;

public class Cliente extends Pessoa{
    private ArrayList<String> reservas;


    public Cliente() {
        this.reservas = new ArrayList<>();
    }

    @Override
    public void registrar() {
        System.out.println("Cliente registrado: " + getNome());

    }

    @Override
    public void exibirHistoricoReservas() {
        if (reservas.isEmpty()) {
            System.out.println("Nenhuma reserva encontrada.");
        } else {
            System.out.println("Histórico de Reservas de " + getNome() + ":");
            for (int i = 0; i < reservas.size(); i++) {
                System.out.println(reservas.get(i));


            }
        }

    }

    public void adicionarReserva(String reserva) {
        reservas.add(reserva);
    }
}









