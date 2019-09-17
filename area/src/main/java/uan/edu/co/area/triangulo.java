package uan.edu.co.area;

public class triangulo extends figua2d
{
	public triangulo(double base, double altura, double a, double b, double c) 
	{
		this.base = base;
		this.altura = altura;
		this.a = a;
		this.b = b;
		this.c = c;
		
		
	}
	
	@Override
	public void calcularArea() 
	{
		
    	area = (base * altura) / 2;
	}
    
    @Override
    public void dibujar() 
    {
    	
    	
    }
    
    @Override
    public void calcularPerimetro() 
    {
    	
    	perimetro = a + b + c;
    	
    }
    
    private double base;
    private double altura;
    private double a;
    private double b;
    private double c;

}
