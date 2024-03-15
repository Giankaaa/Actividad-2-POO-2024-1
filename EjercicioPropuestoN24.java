package ejerciciopn24;
import java.util.*;

public class EjercicioPN24 {

    public static void main(String[] args){ 
        double pesoA,pesoB,pesoC;
    
        System.out.print("Ingrese el peso de la esfera A: ");
        Scanner entrada=new Scanner(System.in);
        pesoA=entrada.nextDouble();//peso esfera A
        System.out.print("Ingrese el peso de la esfera B: ");
        entrada.nextLine();
        pesoB=entrada.nextDouble();//peso esfera B
        System.out.print("Ingrese el peso de la esfera C: ");
        entrada.nextLine();
        pesoC=entrada.nextDouble();//peso esfera C
        entrada.close();
        
        
        if((pesoA>pesoB)&&(pesoA>pesoC)){
            System.out.println("La esfera de mayor peso es la A");
        } 
        else if(pesoB>pesoC){
            System.out.println("La esfera de mayor peso es la B"); 
        } 
        else if(pesoC>pesoB){
            System.out.println("La esfera de mayor peso es la C");
        } 
        else{ 
            System.out.println("Las esferas son del mismo peso");
        } 
    }
    
}
