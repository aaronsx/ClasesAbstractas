package EjercicioAbstractas;

public class Cuadrado extends Figura {
	 
	private int base; 

	    public int getBase() {
			return base;
		}

		public void setBase(int base) {
			this.base = base;
		}

		

		public Cuadrado(String tipo, int base) {
	         super(tipo); 
	         this.setBase(base);
	    } 
	
	@Override
	public double area() {
		 return (double) this.base *this.base; 
		
	}

}
