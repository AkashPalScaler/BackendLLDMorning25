package org.example.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3,9, 7, 6,4, 1,2, 5,4,3);
        List<Integer> filteredNums = numbers.stream()
                .distinct()
                .filter((x) -> {
                    System.out.println("Filtering "+x);
                    return x%2==0;
                })
                .map((elem) -> {
                    System.out.println("Mapping "+elem);
                    return elem * elem;
                })
                .sorted((o1, o2) -> o1-o2)
                .toList(); // Terminal operations

        Optional<Integer> some = numbers.stream()
                .distinct()
                .filter((x) -> {
                    System.out.println("Filtering "+x);
                    return x%2==0;
                })
                .map((elem) -> {
                    System.out.println("Mapping "+elem);
                    return elem * elem;
                })
                .findFirst();

        if(some.isPresent()){
            System.out.println(some.get());
        }

//        numbers.stream()
//                .forEach((x)-> { // Terminal ops
//                    // APi(x); //SendAkafkaMsg(x)
//            System.out.println("Looping element:" + x);
//        });

        // Reduce
        int sum = 0;
        for(Integer num: numbers){
            sum += 0;
        }
        Integer sum2 = numbers.stream().reduce(0, (curr_sum, elem) -> curr_sum + elem);

        int prod = 1;
        for(Integer num: numbers){
            prod *= 0;
        }
        List<Float> floats = List.of(1.0f, 3.4f);
        Float prod2 = floats.stream().
                reduce(1.0f, (curr_prod, elem) -> curr_prod * elem);
                // curr_prod = 1, (1, 2) -> 2 (this value becomes curr_prod)
                // curr_prod = 2, (2,3) -> 6 (this value becomes curr_prod)
                // curr_prod = 6, (6, 4) -> 24 (this value becomes curr_prod)



//        List<Integer> fNums = new ArrayList<>();
//        for(Integer num: numbers){
//            if(num % 2 == 0){
//                fNums.add(num);
//            }
//        }

        System.out.println("Filter numbs " + numbers);
        System.out.println("Filter numbs " + filteredNums);

    }
}
