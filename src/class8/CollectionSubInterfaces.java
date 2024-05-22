package class8;

import java.util.*;

public class CollectionSubInterfaces {
    public static void main(String[] args) {
        //List

        List<Integer> integers=new ArrayList<>();
        integers.add(98);
        integers.add(45);
        integers.add(50);
        for (Integer integer: integers){
            System.out.println(integer);
        }

        integers.add(2,56);
        integers.add(502);
        //System.out.println(integers.add());
        for (Integer integer: integers){
            System.out.println(integer);
        }
        integers.remove(0);

        for (Integer integer: integers){
            System.out.println(integer);
        }

        List<Integer> integerList= Arrays.asList(85,65,32);
        integers.addAll(0,integerList);

        for (Integer integer: integers){
            System.out.println(integer);
        }

        integers.removeAll(integerList);
        for (Integer integer: integers){
            System.out.println(integer);
        }


//Set

        Set<Integer> integerSet=new HashSet<>();
        integerSet.add(98);
        integerSet.add(45);
        integerSet.add(50);

        integerSet.add(50);
        integerSet.add(502);

        for (Integer integer: integerSet){
            System.out.println(integer);
        }
        integerSet.remove(50);

        for (Integer integer: integerSet){
            System.out.println(integer);
        }

        Set<Integer> integerSet1=new HashSet<>();
        integerSet1.add(65);
        integerSet1.add(85);

        integerSet.addAll(integerSet1);


        //Map

        Map<String, Object> objectMap=new HashMap<>();
        objectMap.put("name","hanif");
        objectMap.put("age", 24);
        objectMap.put("color", "white");
        objectMap.put("height", 5.3);

        System.out.println(objectMap.toString());
        System.out.println(objectMap.get("height"));
    }
}
