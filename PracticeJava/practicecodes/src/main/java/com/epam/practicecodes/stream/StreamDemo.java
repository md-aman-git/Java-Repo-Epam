package com.epam.practicecodes.stream;


import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class RandomGenerator {

	static MyRandom random() {
		String otp = new DecimalFormat("000000").format(new Random().nextInt(999999));
		return new MyRandom(new Random().nextInt(), otp);
	}
}

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User> users = new ArrayList<>();
		User u1 = new User("Md Aman", 23, LocalDate.of(1998, 02, 25));
		User u2 = new User("Shubhi Johari", 23, LocalDate.of(1998, 02, 24));
		User u3 = new User("Shubhangi Jain", 23, LocalDate.of(1998, 02, 23));
		User u4 = new User("Rahul Patil", 23, LocalDate.of(1998, 02, 22));
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		
		//map is used to convert any type of stream into any type using Function which also accepts any type and 
		//returns to any type
		List<String> names = users.stream().map(function -> function.getName()).collect(Collectors.toList());
		System.out.println(names);
		boolean allMatch = users.stream().allMatch(predicate -> predicate.getDob().getDayOfMonth() == 25);
		System.out.println("Date is equal to 25 for each user : " + allMatch);
		boolean anyMatch = users.stream().anyMatch(predicate -> predicate.getDob().getDayOfMonth() == 25);
		System.out.println("Date is equal to 25 for at least one user : " + anyMatch);
		long countUser = users.stream().count();
		System.out.println("Count of users : " + countUser);
		
		Stream<User> seqEmpty = Stream.empty();
		System.out.println("Empty stream : " + seqEmpty.isParallel() + " and count of objects : " + seqEmpty.count());
//		seqEmpty.distinct();//throws exception because stream is already used when we called count();
		
		Optional<User> anyUser = users.parallelStream().findAny();
		System.out.println("AnyUser isPresent " + anyUser.isPresent());
		System.out.println("Get Value of Optional User : " + 
				anyUser.get().getName() + " - " + anyUser.get().getAge() + " - " +  anyUser.get().getDob());//since parallel stream so it will  
		//be giving us any element as any element from the stream
		Optional<User> anySeqUser = users.stream().findAny();
		System.out.println("AnyUser isPresent " + anySeqUser.isPresent());
		System.out.println("Get Value of Optional User : " + 
				anySeqUser.get().getName() + " - " + anySeqUser.get().getAge() + " - " +  anySeqUser.get().getDob());//since sequential so it will always 
		//be giving us first element as any element from the stream
		Optional<User> firstUser = users.stream().findFirst();
		System.out.println("AnyUser isPresent " + firstUser.isPresent());
		System.out.println("Get Value of Optional User : " + 
				firstUser.get().getName() + " - " + firstUser.get().getAge() + " - " +  firstUser.get().getDob());
		
		//distinct
		List<Integer> values = Arrays.asList(1, 2, 3, 9, 4, 7, 4, 7, 1, 5);
		List<Integer> distinctValues = values.stream().distinct().toList();
		System.out.println("Values without distinct method : " + values);
		System.out.println("Values after distinct method : " + distinctValues);
		
		List<Integer> sortedList = distinctValues.stream().sorted().toList();//natural order
		System.out.println("Sorted list natural order : " + sortedList);
		List<Integer> sortedListComparator = distinctValues.stream().sorted((a, b) -> b - a).toList();//using comparator for sorting
		System.out.println("Sorted list Desc : " + sortedListComparator);
		
		List<Integer> forOrder = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		System.out.println("Output using forEach() and parallelStream :");
		forOrder.parallelStream().forEach(val -> System.out.print(val + " "));
		System.out.println("\nOutput using forEachOrdered() and parallelStream : ");
		forOrder.parallelStream().forEachOrdered(val -> System.out.print(val + " "));
		
		//infinite stream using iterate
		Stream<Integer> integers = Stream.iterate(0, i -> i + 2);
		System.out.println("\nIterating integers : ");
		List<Integer> collect = integers.limit(10).collect(Collectors.toList());
		collect.forEach(value -> System.out.print(value + " "));
		
		//infinite stream using generate
		Supplier<MyRandom> randomGenerator = RandomGenerator::random;
		Stream<MyRandom> infiniteStreamOfRandomOtp = Stream.generate(randomGenerator);
		List<MyRandom> myRandomListOtp = infiniteStreamOfRandomOtp.limit(4).collect(Collectors.toList());
		System.out.println("\n MyRandom Otp List : ");
		myRandomListOtp.forEach(value -> System.out.print(value.toString() + " "));
		
		//UnaryOperator is specialization of Function, since in case of Function it takes T and return R
		//but in case of UnaryOperator it takes V and returns V as well.
		UnaryOperator<Integer> uOpSquare = x -> x * x;
		System.out.println("\nSquare : " + uOpSquare.apply(5));
		
		//flatMap flattens the stream of Collection into stream of objects e.g, {{1, 2, 3}, {4, 1, 2}} -> flattened -> {1, 2, 3, 4, 1, 2}
		List<List<Integer>> listOfListOfIntegers = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 1, 2));
		System.out.println("ListOfListOfIntegers : " + listOfListOfIntegers);
		List<Integer> listOfIntegers = listOfListOfIntegers.stream()
				.flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println("ListOfIntegers : " + listOfIntegers);

		String [][] stringArr = {{"a", "b", "c"}, {"d", "a"}};
		List<String> strings = Arrays.stream(stringArr).flatMap(x -> Arrays.stream(x)).toList();
		System.out.println("StringArr flatMap : " + strings);
		//peek method exists mainly to support debugging, where you want to see the elements as they flow past a certain point in a pipeline
		Stream.of("one", "two", "three", "four")
        .filter(e -> e.length() > 3)
        .peek(e -> System.out.println("Filtered value: " + e))
        .map(String::toUpperCase)
        .peek(e -> System.out.println("Mapped value: " + e))
        .collect(Collectors.toList());
		//reduce method is used to reduce the elements from a collection based on identity, accumulator and combiner
		List<Integer> list = Arrays.asList(3, 2, 5, 4, 9);
//		int sum = list.stream().reduce(0, (a, b) -> a + b);
		int sum = list.stream().reduce(0, Integer::sum);
		System.out.println("Sum : " + sum);
		//Custom class reducing
		User user1 = new User("A", 1, LocalDate.now());
		User user2 = new User("B", 21, LocalDate.now());
		User user3 = new User("C", 13, LocalDate.now());
		List<User> usersReduce = Arrays.asList(user1, user2, user3);
		int sumOfAge = usersReduce.stream().reduce(0, (b, c) -> b + c.getAge(), Integer::sum);
		System.out.println("Sum of Ages : " + sumOfAge);
		
		//groupingBy
		List<Integer> groupIntegers = Arrays.asList(1, 4, 2, 6, 7, 2, 3, 4);
		Map<Integer, Long> filter = groupIntegers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(filter);
		Map<Integer, Integer> filter2 = groupIntegers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(v -> v)));
		System.out.println(filter2);
		
	}

}
