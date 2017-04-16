package task2;


public class Action extends Movie {
	
	
    public Action(String movie_name, String starring, int running_time, String country, String language) {
		super(movie_name, starring, running_time, country, language);
		// TODO Auto-generated constructor stub
	}

	//explosions
    
    public String getName(){
    	return "Action";
    }

	@Override
	public String toString() {
		return  getName() + " , " + getMovie_name() + " , " + getStarring()
		+ " , " + getRunning_time() + " , " + getCountry() + " , "
		+ getLanguage() ;
	}
	
	public Action clone() { 
		// call clone in Object. 
		return new Action(movie_name,starring, running_time, country, language);
	}

}
