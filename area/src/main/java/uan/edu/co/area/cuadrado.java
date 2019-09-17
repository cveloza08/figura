package uan.edu.co.area;

public class cuadrado extends figua2d
{
	public cuadrado(double lado)
	{
		this.lado = lado;

	}
	
	@Override
	public void calcularArea() 
	{
		
    	area = lado * lado;
	}
    
    @Override
    public void dibujar() 
    {
    	
    	
    }
    
    @Override
    public void calcularPerimetro() 
    {
    	
    	perimetro = 4 * lado;
    	
    }
    
    private double lado;

}
