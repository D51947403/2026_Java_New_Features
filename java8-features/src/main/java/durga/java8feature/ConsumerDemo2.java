package durga.java8feature;

import java.util.function.Consumer;

public class ConsumerDemo2 {

	public static void main(String[] args) {

		Consumer<Movie> c = m -> {
			System.out.println(m.name+" , "+m.hero+" , "+m.heroin);
			System.out.println("Movie Name "+m.name);
			System.out.println("Movie Hero "+m.name);
			System.out.println("Movie Heroin "+m.name);
			System.out.println("=======");
		};
		
		for (Movie  m:Movie.getMovieList() ) {
			 c.accept(m);
		}

	}

	
}
