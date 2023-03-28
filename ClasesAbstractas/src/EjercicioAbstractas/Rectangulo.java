package EjercicioAbstractas;

public class Rectangulo extends Figura {
	 
	private int base,lado; 

	    public int getBase()
	    {
			return base;
		}

		public void setBase(int base)
		{
			this.base = base;
		}
		public int getLado() 
		{
			return lado;
		}

		public void setLado(int lado) 
		{
			this.lado = lado;
		}
		

		public Rectangulo(String tipo, int base, int lado) {
	         super(tipo); 
	         this.setBase(base);
	         this.setLado(lado);
	    } 
	
	@Override
	public double area() {
		 return (double) this.base *this.lado; 
		
	}

}
