package act2parte2;

public class Trapecio {
    double w; // Base mayor del trapecio
    double u; // Base menor del trapecio
    double z; // Altura del trapecio

    Trapecio(double w, double u, double z) {
        this.w = w;
        this.u = u;
        this.z = z;
    }

    double calcularArea() {
        return (w*u/2)+z;
    }

    double calcularPerímetro() {
        return w+u+2*(Math.sqrt(Math.pow((w-u)/2,2)+Math.pow(z,2)));
    }
}
