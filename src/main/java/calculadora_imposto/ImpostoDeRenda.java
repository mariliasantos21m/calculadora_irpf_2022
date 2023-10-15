package calculadora_imposto;
import java.util.Arrays;

public class ImpostoDeRenda {
    public double[] valorImposto;
    public double[] valorFaixa;
    private double imposto;
    public void setTabelaImposto(double salario){

        if (salario <= 1903.0) {
            this.valorImposto=new double[]{0,0,0,0,0};
            this.valorFaixa=new double[]{salario,0,0,0,0};
        } else if (salario <= 2826.65) {
            this.imposto = (salario-1903.98)*0.075;
            this.valorImposto=new double[]{0,imposto,0,0,0};
            this.valorFaixa=new double[]{1903.98,valorImposto[1]*0.075,0,0,0};

        } else if (salario <= 3751.05) {
            this.imposto = (salario-2826.65)*0.15;
            this.valorImposto=new double[]{0,69.2003,imposto,0,0};
            this.valorFaixa=new double[]{1903.98,922.67,salario-2826.65,0,0};

        } else if (salario <= 4665) {
            this.imposto =  (salario-3751.05)*0.225;
            this.valorImposto=new double[]{0,69.2003,138.66,imposto,0};
            this.valorFaixa=new double[]{1903.98,922.67,924.4,salario-3751.05,0};

        } else {
            imposto = 0.275 * (salario - 4664.68);
            this.valorImposto=new double[]{0,69.2003,138.66,205.5667,imposto};
            this.valorFaixa=new double[]{1903.98,922.67,924.4,913.63,salario-4665.68};
        }

    }

    public double[] arrayImposto(){
        return this.valorImposto;
    }
    public double[] arrayFaixa(){
        return this.valorFaixa;
    }

    public double sumArrayImposto() {
        return Arrays.stream(this.valorImposto).sum();
    }
    public double sumArrayFaixa() {
        return Arrays.stream(this.valorFaixa).sum();
    }

}
