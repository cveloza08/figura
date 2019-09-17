package uan.edu.co.area;

public class circulo extends figua2d
{
	public circulo(double radio)
	{
		
		this.radio = radio;
		
	}
	
	@Override
	public void calcularArea() 
	{
		
    	area = Math.PI * (radio * radio);
    	
	}
    
    @Override
    public void dibujar() 
    {
    	
    	
    }
    
    @Override
    public void calcularPerimetro() 
    {
    	
    	perimetro = 2 * Math.PI * radio;
    	
    }
    
    private double radio;

}
