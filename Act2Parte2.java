package act2parte2;
import java.util.*;

public class Act2Parte2 {
    public static void main(String[] args) {
        double r, l, b, h, bt, ht, x, y, w, u, z;
   
        //Circulo
        System.out.print("Ingrese el valor del radio de la circunferencia: ");
        Scanner entrada = new Scanner(System.in);
        r = entrada.nextDouble();
        Circulo figura1 = new Circulo(r);
        
        //Cuadrado
        System.out.print("Ingrese el valor del lado del cuadrado: ");
        entrada.nextLine();
        l = entrada.nextDouble();
        Cuadrado figura3 = new Cuadrado(l);
        
        //Rectangulo
        System.out.print("Ingrese el valor de la base del rectangulo: ");
        entrada.nextLine();
        b = entrada.nextDouble();
        System.out.print("Ingrese el valor de la altura del rectangulo: ");
        entrada.nextLine();
        h = entrada.nextDouble();
        Rectangulo figura2 = new Rectangulo(b,h);
        
        //Triangulo
        System.out.print("Ingrese el valor de la base del triangulo rectangulo: ");
        entrada.nextLine();
        bt = entrada.nextDouble();
        System.out.print("Ingrese el valor de la altura del triangulo rectangulo: ");
        entrada.nextLine();
        ht = entrada.nextDouble();
        TrianRectangulo figura4 = new TrianRectangulo(bt,ht);
        
        //Rombo
        System.out.print("Ingrese el valor de la diagonal mayor del rombo: ");
        entrada.nextLine();
        x = entrada.nextDouble();
        System.out.print("Ingrese el valor de la diagonal menor del rombo: ");
        entrada.nextLine();
        y = entrada.nextDouble();
        Rombo figura5 = new Rombo(x,y);
        
        //Trapecio
        System.out.print("Ingrese el valor de la base mayor del trapecio: ");
        entrada.nextLine();
        w = entrada.nextDouble();
        System.out.print("Ingrese el valor de la base menor del trapecio: ");
        entrada.nextLine();
        u = entrada.nextDouble();
        System.out.print("Ingrese el valor de la altura del trapecio: ");
        entrada.nextLine();
        z = entrada.nextDouble();
        Trapecio figura6 = new Trapecio(w,u,z);
        
        System.out.println("El area del circulo es = " + figura1.calcularArea());
        System.out.println("El perimetro del circulo es = " + figura1.calcularPerimetro());
        System.out.println();
        
        System.out.println("El area del rectangulo es = " + figura2.calcularArea());
        System.out.println("El perimetro del rectangulo es = " + figura2.calcularPerimetro());
        System.out.println();
        
        System.out.println("El area del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perimetro del cuadrado es = " + figura3.calcularPerimetro());
        System.out.println();
        
        System.out.println("El area del triangulo es = " + figura4.calcularArea());
        System.out.println("El perimetro del triangulo es = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();
        System.out.println();
        
        System.out.println("El area del rombo es = " + figura5.calcularArea());
        System.out.println("El perimetro del rombo es = " + figura5.calcularPerimetro());
        System.out.println();
        
        System.out.println("El area del trapecio es = " + figura6.calcularArea());
        System.out.println("El perimetro del trapecio es = " + figura6.calcularPerimetro());
        System.out.println();
    }
}
