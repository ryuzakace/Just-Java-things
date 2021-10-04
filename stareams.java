import java.util.stream.*;
  
class stareams {
    public static void main(String[] args)
    {
        Stream<String> stream = Stream.of("I","can't","believe","it's","not","a","stream!");
  
        // Printing stream items on seperate lines
        stream.forEach(s -> System.out.println(s));
    }
}
