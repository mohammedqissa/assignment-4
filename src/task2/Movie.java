package task2;

public class Movie implements Cloneable , Comparable<Movie> {

	protected String movie_name;
	protected String starring;
	protected int running_time;
    protected String country;
    protected String language;
    
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getStarring() {
		return starring;
	}
	public void setStarring(String starring) {
		this.starring = starring;
	}
	public int getRunning_time() {
		return running_time;
	}
	public void setRunning_time(int running_time) {
		this.running_time = running_time;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	

	public Movie(String movie_name, String starring, int running_time, String country, String language) {
		this.movie_name = movie_name;
		this.starring = starring;
		this.running_time = running_time;
		this.country = country;
		this.language = language;
	}

    public String getName(){
    	return "Movie";
    }

	@Override
	public String toString() {
		return  getName() + " , " + getMovie_name() + " , " + getStarring()
		+ " , " + getRunning_time() + " , " + getCountry() + " , "
		+ getLanguage() ;
	}
	
	
	
	
	@Override
	public int compareTo(Movie a) {
		// TODO Auto-generated method stub
		return this.running_time-a.running_time;
	}
	
	public Movie clone() { 
		return new Movie(movie_name,starring, running_time, country, language);
	}
    
	
	
}