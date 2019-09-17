package uan.edu.co.area;

public class esfera extends figura3d
{
	public esfera(double radio) 
	{
		this.radio = radio;
		
	}
	
	@Override
	public void calcularArea() 
	{
		
		area = 4 * Math.PI * radio * radio;
		
	}
	
	@Override
	public void dibujar() 
	{
		
		
		
	}
	
	@Override
	public void calcularVolumen() 
	{
		
		volumen = 4/3 * Math.PI * (radio * radio * radio);
		
	}
	
	private double radio;

}
