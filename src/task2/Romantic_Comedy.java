package task2;

public class Romantic_Comedy extends Movie{
	
	
    public Romantic_Comedy(String movie_name, String starring, int running_time, String country, String language) {
		super(movie_name, starring, running_time, country, language);
		// TODO Auto-generated constructor stub
	}

	//comedy and romantic
	
	

    public String getName(){
    	return "Romantic_Comedy";
    }

	@Override
	public String toString() {
		return  getName() + " , " + getMovie_name() + " , " + getStarring()
		+ " , " + getRunning_time() + " , " + getCountry() + " , "
		+ getLanguage() ;
	}
	
	
	public Romantic_Comedy clone() { 
		// call clone in Object. 
		return new Romantic_Comedy(movie_name,starring, running_time, country, language);
	}
	

	
}
