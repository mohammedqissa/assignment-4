package task2;

public class Rescue extends Movie{
	
	
	public Rescue(String movie_name, String starring, int running_time, String country, String language) {
		super(movie_name, starring, running_time, country, language);
		// TODO Auto-generated constructor stub
	}

	//action_romance
	

    public String getName(){
    	return "Rescue";
    }

	@Override
	public String toString() {
		return  getName() + " , " + getMovie_name() + " , " + getStarring()
		+ " , " + getRunning_time() + " , " + getCountry() + " , "
		+ getLanguage() ;
	}
	
	public Rescue clone() { 
		// call clone in Object. 
		return new Rescue(movie_name,starring, running_time, country, language);
	}

}
