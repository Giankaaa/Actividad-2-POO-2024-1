package act2parte2;

public class Rombo {
    double x; // Diagonal mayor del rombo
    double y; // Diagonal menor del rombo

    Rombo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double calcularArea() {
        return x*y/2;
    }

    double calcularPerimetro() {
        return 4*(Math.pow((x*x)+(y*y),0.5)/2);
    }
}
