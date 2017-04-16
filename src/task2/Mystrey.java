package task2;

public class Mystrey extends Movie {
	
	
	
	public Mystrey(String movie_name, String starring, int running_time, String country, String language) {
		super(movie_name, starring, running_time, country, language);
		// TODO Auto-generated constructor stub
	}

	//who done it movie
	

	
	
    public String getName(){
    	return "Mystrey";
    }

	@Override
	public String toString() {
		return  getName() + " , " + getMovie_name() + " , " + getStarring()
		+ " , " + getRunning_time() + " , " + getCountry() + " , "
		+ getLanguage() ;
	}
	
	public Mystrey clone() { 
		// call clone in Object. 
		return new Mystrey(movie_name,starring, running_time, country, language);
	}

}

