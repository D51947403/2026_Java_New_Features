package durga.java8feature;

import java.util.function.Consumer;

public class ConsumerDemo3 {

	public static void main(String[] args) {

		Consumer<UserDetail> userConsumer = u -> {
			System.out.println("Name : " + u.getName());
			System.out.println("Age : " + u.getAge());
			System.out.println("City : " + u.getCity());
		};

		userConsumer.accept(new UserDetail("Devendra", "Satna", 31));
		userConsumer.accept(new UserDetail("Ranjan", "Satna", 23));
	}
}

class UserDetail {

	String name;
	String city;
	int age;

	public UserDetail(String name, String city, int age) {

		this.name = name;
		this.city = city;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public int getAge() {
		return age;
	}

}