package reduce.stream.api.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class reduceExample {

	public static void main(String[] args) {

		// actual we use reduce method of stream object for aggrigate function purpose

		List<Integer> list = Arrays.asList(2, 3, 4, 5, 6);

		// sum of all elements
		Integer result = list.stream().reduce(0, (sum, i) -> sum + i);
		System.out.println(result);

		// even number sum OR odd number sum

		Integer result1 = list.stream().filter(i -> i % 2 == 0).reduce(0, (sum, i) -> sum + i);
		System.out.println(result1);

		// product of all elements

		Integer result2 = list.stream().reduce(1, (sum, i) -> sum * i);
		System.out.println(result2);

		// without init value

		Optional<Integer> result5 = list.stream().reduce((sum, i) -> sum + i);
		System.out.println(result5.get());

		// max & min

		List<Integer> list1 = Arrays.asList(2, 3, 4, 34, -23, 5, 6);

		// min
		Optional<Integer> min = list1.stream().min((e1, e2) -> e1.compareTo(e2));
		System.out.println(min.get());

		// max
		// min
		Optional<Integer> max = list1.stream().max((e1, e2) -> e1.compareTo(e2));
		System.out.println(max.get());

		Optional<Integer> min1 = list1.stream().reduce((e1, e2) -> {
			if (e1 < e2) {
				return e1;
			} else {
				return e2;
			}
		});
		// OR
		// Optional<Integer> min1= list1.stream().reduce((e1,e2)-> e1<e2?e1:e2 );
		System.out.println(min1.get());

		// assignment
		List<Integer> list2 = Arrays.asList(2, 3, 7, 4, 9);
		// do sum of odd number (double it)

		Optional<Integer> re = list2.stream().filter(i -> i % 2 == 1).map(i -> i * 2).reduce((sum, i2) -> sum + i2);
		System.out.println(re.get());

		// OR

		Integer re1 = list2.stream().filter(i -> i % 2 == 1).reduce(0, (sum, i2) -> sum + (i2 * 2));
		System.out.println(re1);
	}
}

   

