package Model;
public class Quarto {
    int individual = 3;
    int duplo = 1;
    int suite = 5;

    public void mostrarQuartos(){
        System.out.println("Individual: " + individual);
        System.out.println("Duplo: " + duplo);
        System.out.println("Suíte: " + suite);
    }

    public void escolhaIndividual(){
        int i = individual - 1;
    }

    public void escolhaDuplo(){
        int d = duplo - 1;
    }

    public void escolhaSuite(){
        int s = suite - 1;
    }


}
