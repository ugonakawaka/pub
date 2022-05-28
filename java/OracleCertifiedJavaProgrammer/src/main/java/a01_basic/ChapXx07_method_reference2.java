package a01_basic;

import java.util.function.Function;

public class ChapXx07_method_reference2 {
	// having classes Address and Person
	public static class Address {

		private String country;

		public String getCountry() {
			return country;
		}
	}

	public static class Person {

		private Address address;

		public Address getAddress() {
			return address;
		}
	}

	public static void main(String[] args) {
		a();
	}

	public static class PersonBuilder {
		Person person = new Person();

		public PersonBuilder() {

		}

		public PersonBuilder address(String country) {
			this.person.address = new Address();
			this.person.address.country = country;
			return this;
		}

		public Person build() {
			return this.person;
		}
	}

	public static <A, B, C> Function<A, C> compose(Function<A, B> f1, Function<B, C> f2) {
		return f1.andThen(f2);
	}

	static void a() {


		Person person = new PersonBuilder().address("japan").build();

		{
			Function<Person, Address> personToAddress = Person::getAddress;
			Function<Address, String> addressToCountry = Address::getCountry;

			Function<Person, String> toCountry = personToAddress.andThen(addressToCountry);
			String s = toCountry.apply(person);
			System.out.println(s);
		}
		

		// これはできない
		// (Person::getAddress).andThen(Address::getCountry)
		{ // これおもしろいなー
			String s = compose(Person::getAddress, Address::getCountry).apply(person);
			System.out.println(s);
		}
		
	}

}
