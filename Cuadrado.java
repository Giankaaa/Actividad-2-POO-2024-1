package act2parte2;

public class Cuadrado {
    double l; // Lado del cuadrado

    Cuadrado(double l) {
        this.l = l;
    }

    double calcularArea() {
        return l*l;
    }

    double calcularPerimetro() {
        return (4*l);
    }
}
