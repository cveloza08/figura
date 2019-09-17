package uan.edu.co.area;

public class piramide extends figura3d
{
	public piramide(double arista, double altura) 
	{
		this.arista = arista;
		this.altura = altura;
		
	}
	
	@Override
	public void calcularArea() 
	{
		
		pre = Math.sqrt((arista/2)+altura);
		pos = 4 * arista;
		beg = (pos * pre) /2;
		area = beg + (arista * arista );
		
	}
	
	@Override
	public void dibujar() 
	{
		
		
		
	}
	
	@Override
	public void calcularVolumen() 
	{
		
		volumen = (arista * altura)/3;
		
	}

	private double arista;
	private double altura;
}
