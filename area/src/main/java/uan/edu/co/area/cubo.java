package uan.edu.co.area;

public class cubo extends figura3d
{
	public cubo(double lado) 
	{
		this.lado = lado;
		
	}
	
	
	@Override
	public void calcularArea() 
	{
		area = lado * lado * 6;
		
	}
	
	@Override
	public void dibujar() 
	{
		
		
		
	}
	
	@Override
	public void calcularVolumen() 
	{
		
		volumen = area * area * area;
		
	}
	
	private double lado;

}
