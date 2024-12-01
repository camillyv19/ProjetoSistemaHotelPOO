package Model;
import java.util.ArrayList;
import java.util.Date;

public class Hotel {
    private String nome;
    private String endereco;
    private ArrayList<Quarto> quartos;
    private ArrayList<Reserva> reservas;

    public Hotel(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.quartos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    // Métodos principais:
    public void verificarDisponibilidade(Date dataCheckIn, Date dataCheckOut) {
        // Verifica os quartos disponíveis para as datas informadas
    }

    public void fazerReserva(Cliente cliente, Quarto quarto, Date dataCheckIn, Date dataCheckOut) {
        // Realiza a reserva, se o quarto estiver disponível
    }

    public void realizarCheckIn(Reserva reserva) {
        // Marca a reserva como confirmada e altera o status do quarto
    }

    public void realizarCheckOut(Reserva reserva) {
        // Marca o check-out do cliente e libera o quarto
    }

    public void cancelarReserva(Reserva reserva) {
        // Cancela a reserva
    }

    public void gerarRelatorio() {
        // Gera um relatório de ocupação, cancelamentos, etc.
    }
}

