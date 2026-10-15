package durga.java8feature;

import java.util.function.Consumer;

public class ConsumerChaining {

	public static void main(String[] args) {
		Consumer<Movie>  c1 = movie -> System.out.println("Movie "+movie.name+" is ready to release");
		Consumer<Movie>  c2 = movie -> System.out.println("Movie "+movie.name+" just released and it is "+movie.result);
		Consumer<Movie>  c3 = movie -> System.out.println("Movie "+movie.name+" information is storing in database. \n");
	
		Consumer<Movie>  chainedConsumer =c1.andThen(c2).andThen(c3);
		
		for (Movie  movie : Movie.getMovieList()) {
			chainedConsumer.accept(movie);
		}
	
	}

}
