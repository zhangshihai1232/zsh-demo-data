package stream;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/**
 * Created by zsh on 16.11.10.
 */
public class create {
    @Test
    public void create() {
        // 1. Individual values
        Stream stream = Stream.of("a", "b", "c");
        // 2. Arrays
        String[] strArray = new String[]{"a", "b", "c"};
        stream = Stream.of(strArray);
        stream = Arrays.stream(strArray);
        // 3. Collections
        List<String> list = Arrays.asList(strArray);
        stream = list.stream();
    }

    @Test
    public void create_int() {
        IntStream.of(new int[]{1, 2, 3}).forEach(System.out::println);
        IntStream.range(1, 3).forEach(System.out::println);
        IntStream.rangeClosed(1, 3).forEach(System.out::println);
    }

    @Test
    public void stream_change() {
        // 1. Array
        Stream<String> stream = Stream.of("a", "b", "c");
        String[] strArray1 = stream.toArray(String[]::new);
        // 2. Collection
        List<String> list1 = stream.collect(Collectors.toList());
        List<String> list2 = stream.collect(Collectors.toCollection(ArrayList::new));
        Set set1 = stream.collect(Collectors.toSet());
        Stack stack1 = stream.collect(Collectors.toCollection(Stack::new));
        // 3. String
        String str = stream.collect(Collectors.joining()).toString();
    }

    @Test
    public void stream_map_flatMap() {
        ArrayList<String> wordList = Lists.newArrayList("a", "b", "c");
        List<String> output = wordList
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(output);
    }

    @Test
    public void stream_nn() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        List<Integer> squareNums = nums.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squareNums);
    }

    @Test
    public void stream_flat_map() {
        Stream<List<Integer>> inputStream = Stream.of(
                Arrays.asList(1),
                Arrays.asList(2, 3),
                Arrays.asList(4, 5, 6)
        );
        Stream<Integer> outputStream = inputStream.flatMap((childList) -> childList.stream());
    }

    @Test
    public void optional_test() {
        String strA = " abcd ", strB = null;
        print(strA);
        print("");
        print(strB);
        System.out.println(getLength(strA));
        System.out.println(getLength(""));
        System.out.println(getLength(strB));
    }

    public static void print(String text) {
        // Java 8
        Optional.ofNullable(text).ifPresent(System.out::println);
        // Pre-Java 8
        if (text != null) {
            System.out.println(text);
        }
    }

    public static int getLength(String text) {
        // Java 8
        return Optional.ofNullable(text).map(String::length).orElse(-1);
    }

    ;

    @Test
    public void stream_reduce() {
        // 字符串连接，concat = "ABCD"
        String concat = Stream.of("A", "B", "C", "D").reduce("", String::concat);
        // 求最小值，minValue = -3.0
        double minValue = Stream.of(-1.5, 1.0, -3.0, -2.0).reduce(Double.MAX_VALUE, Double::min);
        // 求和，sumValue = 10, 有起始值
        int sumValue = Stream.of(1, 2, 3, 4).reduce(0, Integer::sum);
        // 求和，sumValue = 10, 无起始值
        sumValue = Stream.of(1, 2, 3, 4).reduce(Integer::sum).get();
        // 过滤，字符串连接，concat = "ace"
        concat = Stream.of("a", "B", "c", "D", "e", "F").
                filter(x -> x.compareTo("Z") > 0).
                reduce("", String::concat);
    }

    @Test
    public void testLimitAndSkip() {
        List<Person> persons = new ArrayList();
        for (int i = 1; i <= 10000; i++) {
            Person person = new Person(i, "name" + i);
            persons.add(person);
        }
        List<String> personList2 = persons.stream().
                map(Person::getName).limit(10).skip(3).collect(Collectors.toList());
        System.out.println(personList2);
    }
    private class Person {
        public int no;
        private String name;
        public Person (int no, String name) {
            this.no = no;
            this.name = name;
        }
        public String getName() {
            System.out.println(name);
            return name;
        }
    }

    @Test
    public void sorted_limit_skip() {
        List<Person> persons = new ArrayList();
        for (int i = 1; i <= 5; i++) {
            Person person = new Person(i, "name" + i);
            persons.add(person);
        }
        List<Person> personList2 = persons.stream().sorted((p1, p2) ->
                p1.getName().compareTo(p2.getName())).limit(2).collect(Collectors.toList());
        System.out.println(personList2);
    }

//    @Test
//    public void stream_max() {
//        BufferedReader br = new BufferedReader(new FileReader("c:\\SUService.log"));
//        int longest = br
//                .lines()
//                .mapToInt(String::length)
//                .max()
//                .getAsInt();
//        br.close();
//        System.out.println(longest);
//    }

//    @Test
//    public void stream_find_words() {
//        List<String> words = br
//                .lines()
//                .flatMap(line -> Stream
//                .of(line.split(" ")))
//                .filter(word -> word.length() > 0)
//                .map(String::toLowerCase)
//                .distinct()
//                .sorted()
//                .collect(Collectors.toList());
//        br.close();
//        System.out.println(words);
//    }

//    @Test
//    public void stream_random() {
//        Stream.generate(new PersonSupplier()).
//                limit(10).
//                forEach(p -> System.out.println(p.getName() + ", " + p.getAge()));
//
//    }

//    private class PersonSupplier implements Supplier<Person> {
//        private int index = 0;
//        private Random random = new Random();
//        @Override
//        public Person get() {
//            return new Person(index++, "StormTestUser" + index, random.nextInt(100));
//        }
//    }

//    @Test
//    public void stream_groupby() {
//        Map<Integer, List<Person>> personGroups = Stream.generate(new PersonSupplier()).
//                limit(100).
//                collect(Collectors.groupingBy(Person::getAge));
//        Iterator it = personGroups.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry<Integer, List<Person>> persons = (Map.Entry) it.next();
//            System.out.println("Age " + persons.getKey() + " = " + persons.getValue().size());
//        }
//    }

}
