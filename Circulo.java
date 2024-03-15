package act2parte2;

public class Circulo {
    double r; // Radio del circulo
    Circulo(double r) {
        this.r = r;
    }
    double calcularArea() {
        return Math.PI*Math.pow(r,2);
    }

    double calcularPerímetro() {
        return 2*Math.PI*r;
    }
}
