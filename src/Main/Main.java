package Main;

import Electrodomesticos.Electrodomestico;
import Electrodomesticos.Lavadora;

public class Main {
    public static void main(String[] args) {
        Electrodomestico electro1 = new Electrodomestico("licuadora", "oster", 700);
        System.out.println(electro1);

        electro1.setMarca("Sindelen");
        electro1.setPotencia(17.8);
        System.out.println(electro1);

        System.out.println("\n");

        int horas = 5;
        double consum = electro1.getConsumo(horas);
        double preciokwh = 0.5;
        double costo = electro1.getCostoConsumo(horas, preciokwh);
        System.out.println("ha consumido: " + consum + "Kw en " + horas + " horas");
        System.out.println("Debe pagar = " + costo + "$");
        System.out.println("\n");

        Lavadora lavado = new Lavadora("Mademsa", 1500, 0.5 , false);
        System.out.println(lavado);

        lavado.setAguaCaliente(true);
        System.out.println("consumo de la lavadora en 10 horas " + lavado.getConsumo(10));
        System.out.println("Costo del consumo en 10 horas " + lavado.getCostoConsumo(10, 2));
    }
}
