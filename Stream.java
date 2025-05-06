//1.filter out greater than 5

    List<Integer> emp = Arrays.asList(2,5,7,9,18);
    List<Integer> res = emp.stream().filter(n->n>5).collect(Collectors.toList());

    //res={7,9,18}

//2.transform the ele in uppercase
    List<String> ele = Arrays.asList("Apple","banana","cherry");
    List<String> res = ele.stream().map(String::toUpperCase).collect(Collectors.toList());

    //res=("APPLE","BANANA","CHERRY")

//3.list of lists of strings,flatten the list into single list.

    List<List<String>> lists= Arrays.asList(
                                    Arrays.asList("A","B"),Arrays.asList("C","D"));
    List<String> res= lists.stream().flatMap(Collections::stream).collect(Collectors.toList());
    //res=("A","B","C","D")

// Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
		List<Integer> l = Arrays.asList(23,55,44,22);
        int evenSum = l.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
        int oddSum = l.stream().filter(n->n%2!=0).mapToInt(Integer::intValue).sum();

4. Write a Java program to remove all duplicate elements from a list using streams.
		 List<Integer> l = Arrays.asList(23,23,44,22);
         List<Integer> res= l.stream().distinct().collect(Collectors.toList());
       
5. Write a Java program to count the number of strings in a list that start with a specific letter using streams.
	List<String> names = Arrays.asList("Apple", "Avocado", "Banana", "Apricot", "Blueberry", "almond");
    String target = "A";
    int count = names.stream().filter(name->name.toLowerCase().startsWith(target.toLowerCase())).count();

6. Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
	List<String> names = Arrays.asList("Apple", "Avocado", "Banana", "Apricot", "Blueberry", "almond");
    List<String> ascOrder = names.stream().sorted().collect(Collectors.toList());
    List<String> ascOrder = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

7. Write a Java program to find the maximum and minimum values in a list of integers using streams.
	List<Integer> l = Arrays.asList(23,23,44,22);
    int max = l.stream().mapToInt(Integer::intValue).max().orElseThrow(NoSuchElementException::new);
    int min = l.stream().mapToInt(Integer::intValue).min().orElseThrow(NoSuchElementException::new);

8. Write a Java program to find the second smallest and largest elements in a list of integers using streams.
		List<Integer> l = Arrays.asList(23,26,44,22);
        Optional<Integer> max = l.stream().distinct().sorted().limit(2).skip(1).findFirst();
        Optional<Integer> min = l.stream().distinct().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst();

7. Find duplicate elements in a list using streams.

		List<String> l = Arrays.asList("apple", "banana", "apple", "orange", "banana", "kiwi");
        Set<String> set= new HashSet<>();
        List<String> res = l.stream().filter(name->!s.add(name)).collect(Collectors.toList());
        
8.Count occurrences of each element in a list.

		List<String> l = Arrays.asList("apple", "banana", "apple", "orange", "banana", "kiwi");
        Map<String,Integer> map = l.stream().collect(Collectors.groupingBy(Functions.identity(),Collectors.counting()));

9.Convert a list of strings to a single comma-separated string.