package durga.java8feature;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	String name ;
	String hero ;
	String heroin;
	String result;
	
	 Movie(String name, String hero, String heroin ,String result) {
		super();
		this.name = name;
		this.hero = hero;
		this.heroin = heroin;
		this.result = result;
	}
	
	 Movie(String name, String result) {
			this.name = name;
			this.result = result;
		}
	 
	 
	 public static List<Movie> getMovieList (){
			ArrayList<Movie> movieList= new ArrayList<Movie>();
			    movieList.add(new Movie("Bahubali" ,"Prabhas" ,"Anuska" ,"Super Hit"));
			    movieList.add(new Movie("Mission Mangalam" ,"Akashay" ,"Vidyabalan" ,"Flop"));
			    movieList.add(new Movie("Three Idiot" ,"Amir Khan" ,"Kareena Kapoor" ,"Hit"));
			    movieList.add(new Movie("Bajirao Mastani" ,"Ranveer Singh" ,"Deepika" ,"Hit"));
			    movieList.add(new Movie("Tanha Ji" ,"Ajay Dewgan" ,"Kajol","Hit"));
			    
			    return movieList;
		}
	 
	 
}
