package calculadora_imposto;
public class Pessoa {
    private String nome;
    private double valorSalario;
    private int qtdDependentes;
    private double valorPrevidencia;

    private double[] valorImposto;
    private double[] valorFaixa;

    private double totalFaixa;

    private double totalImposto;

    public double getTotalImposto() {
        return totalImposto;
    }
    public void setTotalImposto(double totalImposto) {
        this.totalImposto = totalImposto;
    }

    public double getTotalFaixa() {
        return totalFaixa;
    }
    public void setTotalFaixa(double totalFaixa) {
        this.totalFaixa = totalFaixa;
    }

    public double[] getValorFaixa() {
        return valorFaixa;
    }
    public void setValorFaixa(double[] valorFaixa) {
        this.valorFaixa = valorFaixa;
    }

    public double[] getValorImposto() {
        return valorImposto;
    }
    public void setValorImposto(double[] valorImposto) {
        this.valorImposto = valorImposto;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorSalario() {
        return valorSalario;
    }
    public void setValorSalario(double valorSalario) {
        this.valorSalario = valorSalario;
    }

    public int getQtdDependentes() {
        return qtdDependentes;
    }
    public void setQtdDependentes(int qtdDependentes) {
        this.qtdDependentes = qtdDependentes;
    }

    public double getValorPrevidencia() {
        return valorPrevidencia;
    }
    public void setValorPrevidencia(double valorPrevidencia) {
        this.valorPrevidencia = valorPrevidencia;
    }

    public void calcular_teste(){
        this.valorSalario= this.valorPrevidencia + this.valorSalario;
    }
}
