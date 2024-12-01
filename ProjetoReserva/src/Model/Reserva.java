package Model;

import enums.TipoDeQuarto;

public class Reserva implements Reservando {
    private Cliente cliente;
    private TipoDeQuarto tipoQuarto;

    public Reserva(Cliente cliente, TipoDeQuarto tipoQuarto) {
        this.cliente = cliente;
        this.tipoQuarto = tipoQuarto;
    }

    @Override
    public void reservar() {
        System.out.println("Reserva feita por: " + cliente.getNome() + ", Quarto: " + tipoQuarto);
    }

    @Override
    public void cancelarReserva() {
        System.out.println("Reserva cancelada para: " + cliente.getNome());
    }
}
