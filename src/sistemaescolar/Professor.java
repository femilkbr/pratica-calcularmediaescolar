package sistemaescolar;

public class Professor extends Pessoa {

    private int idFuncional;
    private double salariobase;
    private double salarioAtual;
    private int numeroTurmas;

    public int getIdFuncional() {
        return idFuncional;
    }

    public void setIdFuncional(int idFuncional) {
        this.idFuncional = idFuncional;
    }

    public double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(double salariobase) {
        this.salariobase = salariobase;
    }

    public double getSalarioAtual() {
        return salarioAtual;
    }

    public void setSalarioAtual(double salarioAtual) {
        this.salarioAtual = salarioAtual;
    }

    public int getNumeroTurmas() {
        return numeroTurmas;
    }

    public void setNumeroTurmas(int numeroTurmas) {
        this.numeroTurmas = numeroTurmas;
    }

    public double calculoSalario(){
        salarioAtual = salariobase + (0.2*salariobase*numeroTurmas);
        return salarioAtual;
    }
}
