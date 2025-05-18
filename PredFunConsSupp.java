import java.util.function.*;
import java.util.Date;
class Main {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x->x%2==0;
        System.out.println("Predicate Program");
        System.out.println("number is even :"+predicate.test(5));
        
        Function<String,String> function1 = str->str.toUpperCase();
        System.out.println("Function Program");
        System.out.println("String in uppercase :"+function1.apply("jaya"));
        
        Consumer<Integer> consumer = s->System.out.println("Consumer Program: Square it :"+s*2);
        consumer.accept(5);
        
        Supplier<Date> supplier = ()->new Date();
        System.out.println("Supplier Program");
        System.out.println("Date is :"+supplier.get());
    }
}