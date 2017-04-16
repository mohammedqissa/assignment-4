package task2;


public class Comedy extends Movie {
	
	
	public Comedy(String movie_name, String starring, int running_time, String country, String language) {
		super(movie_name, starring, running_time, country, language);
		// TODO Auto-generated constructor stub
	}

	//humorous
	

    public String getName(){
    	return "Comedy";
    }

	@Override
	public String toString() {
		return  getName() + " , " + getMovie_name() + " , " + getStarring()
		+ " , " + getRunning_time() + " , " + getCountry() + " , "
		+ getLanguage() ;
	}
	
	public Comedy clone() { 
		// call clone in Object. 
		return new Comedy(movie_name,starring, running_time, country, language);
	}
	

}
