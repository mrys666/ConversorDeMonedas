
package Control;

public class Operaciones {
    private double monto;
    private int divisa, divisa2;
    private double resultado;

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getDivisa() {
        return divisa;
    }

    public void setDivisa(int divisa) {
        this.divisa = divisa;
    }

    public int getDivisa2() {
        return divisa2;
    }

    public void setDivisa2(int divisa2) {
        this.divisa2 = divisa2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public Operaciones() {
    }
    
    public double conversor(double monto, double divisa){
        resultado = monto * divisa;
        setResultado(resultado);
        return getResultado();
    }
    
    public double solesSoles(double monto){
        return conversor(1, 1);
    }
    
    public double solesDolares(double monto){
        return conversor(monto, 0.27);
    }
    
    public double solesEuros(double monto){
        return conversor(monto, 0.24);
    }
    
    public double solesLibras(double monto){
        return conversor(monto, 0.21);
    }
    
    public double solesYen(double monto){
        return conversor(monto, 35.93);
    }
    
    public double solesWon(double monto){
        return conversor(monto, 360.12);
    }
    
    public double dolaresSoles(double monto){
        return conversor(monto, 3.73);
    }
    
    public double dolaresDolares(double monto){
        return conversor(monto, 1);
    }
    
    public double dolaresEuro(double monto){
        return conversor(monto, 0.91);
    }
    
    public double dolaresLibra(double monto){
        return conversor(monto, 0.80);
    }
    
    public double dolaresYen(double monto){
        return conversor(monto, 134.05);
    }
    
    public double dolaresWon(double monto){
        return conversor(monto, 1344.03);
    }
    
    public double euroSoles(double monto){
        return conversor(monto, 4.11);
    }
    
    public double euroDolar(double monto){
        return conversor(monto, 1.10);
    }
    
    public double euroEuro(double monto){
        return conversor(monto, 1);
    }
    
    public double euroLibra(double monto){
        return conversor(monto, 0.88);
    }
    
    public double euroYen(double monto){
        return conversor(monto, 147);
    }
    
    public double euroWon(double monto){
        return conversor(monto, 1479.37);
    }
    
    public double libraSoles(double monto){
        return conversor(monto, 4.66);
    }
    
    public double libraDolar(double monto){
        return conversor(monto, 1.25);
    }
    
    public double libraEuro(double monto){
        return conversor(monto, 1.13);
    }
    public double libraLibra(double monto){
        return conversor(monto, 1);
    }
    
    public double libraYen(double monto){
        return conversor(monto, 167.31);
    }
    
    public double libraWon(double monto){
        return conversor(monto, 1676.28);
    }
    
    public double yenSoles(double monto){
        return conversor(monto, 0.028);
    }
    
    public double yenDolares(double monto){
        return conversor(monto, 0.0075);
    }
    
    public double yenEuro(double monto){
        return conversor(monto, 0.0068);
    }
    
    public double yenLibra(double monto){
        return conversor(monto, 0.0060);
    }
    
    public double yenYen(double monto){
        return conversor(monto, 1);
    }
    
    public double yenWon(double monto){
        return conversor(monto, 10.02);
    }
    
    public double wonSoles(double monto){
        return conversor(monto, 0.0028);
    }
    
    public double wonDolar(double monto){
        return conversor(monto, 0.00075);
    } 
    
    public double wonEuro(double monto){
        return conversor(monto, 0.00068);
    }
    
    public double wonLibra(double monto){
        return conversor(monto, 0.0000060);
    }
    
    public double wonYen(double monto){
        return conversor(monto, 0.100);
    }
    
    public double wonWon(double monto){
        return conversor(monto, 1);
    }
}
