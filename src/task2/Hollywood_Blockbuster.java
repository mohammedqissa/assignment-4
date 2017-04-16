package task2;


public class Hollywood_Blockbuster extends Movie{
	
	
	public Hollywood_Blockbuster(String movie_name, String starring, int running_time, String country,
			String language) {
		super(movie_name, starring, running_time, country, language);
		// TODO Auto-generated constructor stub
	}

	//action_romance_comedy
	
    public String getName(){
    	return "Hollywood_Blockbuster";
    }

	@Override
	public String toString() {
		return  getName() + " , " + getMovie_name() + " , " + getStarring()
		+ " , " + getRunning_time() + " , " + getCountry() + " , "
		+ getLanguage() ;
	}
	
	public Hollywood_Blockbuster clone() { 
		// call clone in Object. 
		return new Hollywood_Blockbuster(movie_name,starring, running_time, country, language);
	}
	

}