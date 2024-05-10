package practiceCollections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //vv============Using Set============vv
        Set<String> fruit = new HashSet<>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Grapes");
        fruit.add("Pineapple");

        System.out.println(fruit.size());
        fruit.remove("Grapes");
        System.out.println(fruit.size());
        System.out.println(fruit.isEmpty());
        System.out.println(fruit.contains("Pineapple"));

        var i = fruit.iterator();
        while(i.hasNext()){
            System.out.println(":" + i.next());
        }
        for(String f : fruit){
            System.out.println("*" + f);
        }
        fruit.forEach(x -> System.out.println("x" + x));
        fruit.forEach(System.out::println);




        System.out.println("===============");
        //vv============Using List============vv
        List<String> moreFruits = new LinkedList<>();
        moreFruits.addAll(fruit);
        System.out.println(moreFruits.size());
        moreFruits.add("Grapes");
        System.out.println(moreFruits.containsAll(fruit));
        System.out.println(moreFruits.size());
        System.out.println(moreFruits.indexOf("Mango"));
//        moreFruits.clear();
        System.out.println(moreFruits.isEmpty());
        moreFruits.listIterator();
        for(String mf : moreFruits){
            System.out.println(mf);
        }

        System.out.println("===============");
        //vv============Using Queue============vv
        Queue<String> bbqLine = new LinkedList<>();
        bbqLine.add("Miles Morales");
        bbqLine.add("Peter Parker");
        bbqLine.add("Peter Griffin");
        bbqLine.add("Stewie Griffin");
        bbqLine.add("Mario");

        System.out.println(bbqLine.element());// retrieves head of queue
        System.out.println(bbqLine.poll());
        System.out.println(bbqLine.peek());
        bbqLine.forEach(x -> System.out.println("Next in queue : " + x));
        bbqLine.forEach(System.out::println);

        System.out.println("===============");
        //vv============Using Map============vv
        Map<String, Character> studentGrades = new TreeMap<>();//orders elements in a natural order by key
        studentGrades.put("Abel",'C');
        studentGrades.put("Devin",'F');
        studentGrades.put("Billy",'A');
        studentGrades.put("Cris",'B');

        System.out.println(studentGrades.keySet());
        System.out.println(studentGrades.entrySet());
        System.out.println(studentGrades.values());

//        for (Map.Entry<String,Character>s : studentGrades.entrySet()){
//            System.out.println(s.getKey() +":" + s.getValue());
//        }
        for (var s : studentGrades.entrySet()){
            System.out.println(s.getKey() +":" + s.getValue());
        }
        studentGrades.forEach((k,v) -> System.out.println("Student: " + k + " Grade:" + v));

    }




}
