package act2parte2;

public class TrianRectangulo {
    double b; // Base de un triángulo rectángulo
    double h; // Altura de un triángulo rectángulo

    TrianRectangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    double calcularArea() {
        return (b*h/2);
    }

    double calcularPerimetro() {
        return (b+h+calcularHipotenusa()); /* Invoca almétodo calcular hipotenusa */
    }

    double calcularHipotenusa() {
        return Math.pow(b*b+h*h, 0.5);
    }

    void determinarTipoTriangulo() {
        if ((b == h) && (b == calcularHipotenusa()) && (h == calcularHipotenusa())){
            System.out.println("Es un triangulo equilátero"); /* Todos sus lados son iguales */
        }
        else if ((b != h) && (b != calcularHipotenusa()) && (h != calcularHipotenusa())){
            System.out.println("Es un triangulo escaleno"); /* Todos suslados son diferentes */
        }
        else{
            System.out.println("Es un triangulo isosceles"); /* De otra manera, es isósceles */
        }    
    }
}
