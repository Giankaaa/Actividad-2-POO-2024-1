package act2parte2;

public class Rectangulo {
    double b; // Base de un rectángulo
    double h; // Altura de un rectángulo

    Rectangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    double calcularArea() {
        return b*h;
    }

    double calcularPerímetro() {
        return (2*b) + (2*h);
    }
}
