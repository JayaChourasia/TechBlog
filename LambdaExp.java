1: Filter Even Numbers
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
List<Integer> res = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
// Output: [2, 4, 6]


2: Convert Strings to Uppercase
List<String> words = Arrays.asList("java", "lambda", "stream");
List<String> res = words.stream().map(str->str.toUpperCase()).collect(Collectors.toList());

// Output: [JAVA, LAMBDA, STREAM]

3: Sort List by String Length
List<String> names = Arrays.asList("John", "Alexander", "Eva");
List<String> res = names.stream().sort((a,b)->Integer.compare(a.Length(),b.Length()));

// Output: [Eva, John, Alexander]

4: Count Strings Starting with a Letter
List<String> items = Arrays.asList("Apple", "Banana", "Avocado", "apricot", "Cherry");
names.stream().filter(str->str.toLowerCase().startsWith("a")).count();
// Output: 3


5: Custom Functional Interface

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}
        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;
        MathOperation mul = (a, b) -> a * b;

        System.out.println("Add: " + add.operate(5, 3));  // Output: 8
        System.out.println("Sub: " + sub.operate(5, 3));  // Output: 2
        System.out.println("Mul: " + mul.operate(5, 3));  // Output: 15
/* Output: MathOperation add = (a, b) -> a + b;
MathOperation sub = (a, b) -> a - b;
MathOperation mul = (a, b) -> a * b;*/


6: Get Maximum Using Stream & Lambda

List<Integer> numbers = Arrays.asList(10, 30, 50, 20, 60, 40);
numbers.stream().max(Integer::compare).orElseThrow();
// Output: 60