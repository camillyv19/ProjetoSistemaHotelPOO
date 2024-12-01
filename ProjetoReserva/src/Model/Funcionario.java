package Model;

public class Funcionario implements salario{

    private double horas, salario, total;

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public void calcularSalario() {
        this.total = this.horas * this.salario;
        System.out.println(total);
    }

    @Override
    public void aplicarBonus() {
       this.total = total + 0.15;
        System.out.println(total);
    }
}
