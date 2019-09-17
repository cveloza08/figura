package uan.edu.co.area;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        
    	System.out.print("Intoduzca radio circulo");
    	Scanner r = new Scanner (System.in);
    	double radio = r.nextInt();
    	
    	circulo C = new circulo(radio);
    	
    	System.out.print("Intoduzca base triangulo");
    	Scanner b = new Scanner (System.in);
    	double base = b.nextInt();
    	System.out.print("Intoduzca altura triangulo");
    	Scanner a = new Scanner (System.in);
    	double altura = a.nextInt();
    	System.out.print("Intoduzca lado a triangulo");
    	Scanner l1 = new Scanner (System.in);
    	double ladoa = l1.nextInt();
    	System.out.print("Intoduzca lado b triangulo");
    	Scanner l2 = new Scanner (System.in);
    	double ladob = l2.nextInt();
    	System.out.print("Intoduzca lado c triangulo");
    	Scanner l3 = new Scanner (System.in);
    	double ladoc = l3.nextInt();
    	
    	triangulo t = new triangulo(base, altura, ladoa, ladob, ladoc);
    	
    	System.out.print("Intoduzca el lado del cuadrado");
    	Scanner l = new Scanner (System.in);
    	double lado = l.nextInt();
    	
    	cuadrado A = new cuadrado (lado);
    	
    	System.out.print("Intoduzca lado del cubo");
    	Scanner lc = new Scanner (System.in);
    	double ladoCubo = lc.nextInt();
    	
    	cubo U = new cubo (ladoCubo);
    	
    	System.out.print("Intoduzca radio esfera ");
    	Scanner re = new Scanner (System.in);
    	double radioEsfera = re.nextInt();
    	
    	esfera E = new esfera (radioEsfera);
    	
    	System.out.print("Intoduzca arista piramide");
    	Scanner ap = new Scanner (System.in);
    	double aristaP = ap.nextInt();
    	System.out.print("Intoduzca altura piramide");
    	Scanner alp = new Scanner (System.in);
    	double alturaP = alp.nextInt();
    	
    	piramide P = new piramide (aristaP, alturaP);
    	
    	C.calcularArea();
    	C.calcularPerimetro();
    	
    	t.calcularArea();
    	t.calcularPerimetro();
    	
    	A.calcularArea();
    	A.calcularPerimetro();
    	
    	U.calcularArea();
    	U.calcularVolumen();
    	
    	E.calcularArea();
    	E.calcularVolumen();
    	
    	P.calcularArea();
    	P.calcularVolumen();
    	
    	System.out.println("Circulo");
    	System.out.println("area: " + C.getArea());
    	System.out.println("perimetro: " + C.getPerimetro());
    	
    	
    	System.out.println("triangulo");
    	System.out.println("area: " + t.getArea());
    	System.out.println("perimetro: " + t.getPerimetro());
    	
    	
    	System.out.println("Cuadrado");
    	System.out.println("area:  " + A.getArea());
    	System.out.println("perimetro: " + A.getPerimetro());
    	
    	
    	System.out.println("Cubo");
    	System.out.println("area:  " + U.getArea());
    	System.out.println("volumen: " + U.getVolumen());
    	
    	
    	System.out.println("Esfera");
    	System.out.println("area:  " + E.getArea());
    	System.out.println("volumen: " + E.getVolumen());
    	
    	
    	System.out.println("Piramide");
    	System.out.println("area:  " + P.getArea());
    	System.out.println("volumen: " + P.getVolumen());
    	
    	
    	
    }
}
