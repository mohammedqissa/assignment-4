package task2;

public class Romance extends Movie  {
	
	
    public Romance(String movie_name, String starring, int running_time, String country, String language) {
		super(movie_name, starring, running_time, country, language);
		// TODO Auto-generated constructor stub
	}

	//romantic interest
    public String getName(){
    	return "Romance";
    }

	@Override
	public String toString() {
		return  getName() + " , " + getMovie_name() + " , " + getStarring()
		+ " , " + getRunning_time() + " , " + getCountry() + " , "
		+ getLanguage() ;
	}

	
	public Romance clone() { 
		// call clone in Object. 
		return new Romance(movie_name,starring, running_time, country, language);
	}
	

}

