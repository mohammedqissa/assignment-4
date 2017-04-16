
public class Complex implements Cloneable{
	
	
	private int realPart,imagenaryPart;

	public int getRealPart() {
		return realPart;
	}



	public int getImagenaryPart() {
		return imagenaryPart;
	}


	
	
	public Complex(int a,int b){
		
		realPart=a;
		imagenaryPart=b;
		
		
	}
	
	public Complex(int a){
		
		realPart=a;
		imagenaryPart=0;
		
	}
	
	
	
	public Complex(){
		
		realPart=0;
		imagenaryPart=0;
		
		
	}



	@Override
	public String toString() {
		return (imagenaryPart==0)? realPart+"" : realPart+" + "+imagenaryPart+"i";
	}



	@Override
	protected Complex clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return new Complex(realPart,imagenaryPart);
	}
	
	
	

}
