package Electrodomesticos;

public class Electrodomestico {
    private String tipo;
    private String marca;
    private double potencia;

    public Electrodomestico(java.lang.String tipo, java.lang.String marca, double potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    //método set

    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(java.lang.String marca) {
        this.marca = marca;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    //métodos get

    public java.lang.String getTipo() {
        return tipo;
    }

    public java.lang.String getMarca() {
        return marca;
    }

    public double getPotencia() {
        return potencia;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Electrodomestico{" +
                "tipo= " + tipo +
                ", marca= " + marca +
                ", potencia= " + potencia + "w." +
                '}';
    }
    public double getConsumo(int horas) {
        return potencia * horas;
    }

    public double getCostoConsumo(int horas, double costoHora) {
        return getConsumo(horas) * costoHora;
    }

}
