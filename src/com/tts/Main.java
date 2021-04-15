package com.tts;
import java.util.*;

public class Main {

    public static void main(String[] args) {

	// different types of arrays
        String[] fruitsArray = { "orange", "apple", "bananas",
                "watermelon"};
        int[] intArray;
        boolean[] booArray;

        System.out.println("===== Arrays ======");
//        Should print "apple"
         System.out.println(fruitsArray[1]);
//         Should print length of fruits array
        System.out.println(fruitsArray.length);

       System.out.println("====== Collections======");

        List <String> stringList= new ArrayList<>();
        List <String> stringLinkedList = new LinkedList<>();
        List <String> stringVector = new Vector<>();
        List <String> stringStack= new Stack<>();

//        adds elements to the array
        stringList.add("dog");
        stringList.add("house");
        stringList.add("cellphone");
//          allows you to add multiple
//          things at once (not recommended)
//        stringList.addAll("cat", "dog", "house");

//        how to add something at a specific place
        stringList.add(1, "octopus");

//        to get the value at an index of list
        System.out.println(stringList.get(1));

//        to remove all elements from list
//        stringList.clear();

//        to remove an element
//        stringList.remove(1);

        System.out.println("===== String conversion ===" );
//       first string is set up
        String myString = "I really love ice cream";
//        splits string at every whitespace
//        and turns it into regular array
        String[] strArr = myString.split(" ");

//        setting up an arrayList and making the value
//        that of the strArr
        List<String> splitList = new ArrayList<>();
        splitList = Arrays.asList(strArr);

        System.out.println(splitList);

//        Making a new array list and adding items at once
        List<String> carList = Arrays.asList("BMW",
                "Honda", "Audi");

        Object[] carArr = carList.toArray();

        String carString = Arrays.toString(carArr);

        System.out.println(carString.replace
                ("[", "")
                .replace("]", "")
                .replace(",", ""));

        System.out.println("===Hash Maps=====");
//        hash map declaration
        HashMap<String, Integer> personMap = new HashMap<>();

//        hash maps are store with key value pairs
//        each key value pair are separated by equal signs
        personMap.put("Mary", 37);
        personMap.put("Bob", 21);
        personMap.put("Susan", 63);

        System.out.println(personMap);
        System.out.println("This is the value associated" +
                "with Mary: " + personMap.get("Mary"));
//        to print key for each pairs
        System.out.println(personMap.keySet());
//        to print out key value set
        for(String i : personMap.keySet()){
            System.out.println("key: " +
                    i + "\tvalue: " + personMap.get((i)));
        }

//        to remove a person
        personMap.remove("Bob");
        System.out.println("Is Bob in my map?");
              personMap.containsKey("Bob");

              System.out.println("==Loops/ Iterating==");

//              Loops and iteration mean the same thing

//        use for loops to loop thru collections
//        enhanced for loops are strictly for collections
//        String fruit represents any given element in our
//        fruitlist collection
        List<String> fruitList = Arrays.asList("plum",
                "grape", "fiji apple");
        for( String fruit : fruitList){
            System.out.println(" Here is one of my fruits: "
            + fruit);
        }

        fruitList.forEach((fruit) -> System.out.println(fruit));
//      another way to print that statement
//        fruitList.forEach(System.out::println);

        System.out.println("=== Linked List=====");
//        Linked Lists  are not indexed
//        It keeps track of first & last objects added

        LinkedList<String> animalList = new LinkedList<String>();
        animalList.add("frog");
        animalList.add("giraffe");
        animalList.add("Buffalo");
        animalList.add("mongoose");
        System.out.println(animalList);

        animalList.addFirst("Shark");
        System.out.println(animalList);
//        .set replaces a value, below replaces frog with emu
        animalList.set(1, "emu");
        System.out.println(animalList);

        System.out.println("\n=== Queues===");

        Queue<Integer> myQueue = new LinkedList<>();

//        adding elements using for loop (5,6,7,8) to queue
        for(int i=5; i<10; i++){
            myQueue.add(i);
        }
            System.out.println("Elements of queue: "
                    + myQueue);

//        removing head of queue
        int removedHead = myQueue.remove();
        System.out.println("removed element of myQueue: " +
                removedHead);
//        printing queue to check
        System.out.println(myQueue);

//        to view the head of queue we use .peek
        int head = myQueue.peek();
        System.out.println("head of queue is : " +
                head);
//      use .size to view size of the queue
        int size = myQueue.size();
        System.out.println("size of the queue: "
                + size);

        System.out.println("\n=== Stacking===");

//        stacking is opposite of queues "last in, first out
        Stack<Integer> myStack = new Stack<Integer>();
//        use push methods for stacks. push is only for
//        stacks
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
//        pushed 1,2,3 to our stack
        System.out.println(myStack);
//        use pop to remove things from a stack
        myStack.pop();
        System.out.println(myStack);
//        bc stacks are last in first out
//        pop will remove the last item first
//        queues are first in first out
//        stacks are last in first out
//        .peek can also be used with stacks
        int peek = myStack.peek();
        System.out.println(peek);
//        .peek looks at the back end in new stack
//        where as in queue it only looks at the first item
//        queues typically want to get rid of data
//        where as stacks want to add more data
//        .empty method lets us see if the stack has values or not
//        .empty returns booleans
        boolean empty = myStack.empty();
        System.out.println(empty);


        System.out.println("=== End of Notes===");


    }
}
