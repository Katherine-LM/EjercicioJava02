package Electrodomesticos;

public class Lavadora extends Electrodomestico{

    private double precio;
    private boolean aguaCaliente;

    public Lavadora(String marca, double potencia) {
        super("Lavadora", marca, potencia);
        precio = 0;
        aguaCaliente = false;
    }
    public Lavadora(String marca, double precio, double potencia, boolean aguaCaliente) {
        super("Lavadora", marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Lavadora{" +
                "marca=" + getMarca() + ", potencia= " + getPotencia() +
                ", precio=" + precio +
                ", aguaCaliente=" + aguaCaliente +
                '}';
    }

    public double getConsumo(int horas) {
        if(aguaCaliente) {
            return (getPotencia() + getPotencia() * 0.20) * horas;
        }
        else {
            return  getPotencia() * horas;
        }
    }
}
