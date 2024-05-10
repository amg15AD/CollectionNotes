A collection is an object that holds references to other objects. These ae data structures and the objects within the collection are AKA elements.

set- unordered UNIQUE elements Implements - hashMaps, treeSet, linkedList,

List - ordered elements can be accessed by position implements - arrayList, linkedList, stack, vector

Queue - ordered elements for processing in FIFO  implements - linkedList, priorityQueue

Map - unordered UNIQUE KEY-value pairs  implement - hashMap, treeMap, linkedHashMap

Loop through set, list, queue 

 var i = Collection.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        for(Data type v : Collection){
            System.out.println(v);
        }
        Collection.forEach(x -> System.out.println(x));
        Collection.forEach(System.out::println);

Loop through Maps

 for (Map.Entry<Key, Value> s : Collection.entrySet()){
            System.out.println(s.getKey() +":" + s.getValue());
        }
        for (var s : Collection.entrySet()){
            System.out.println(s.getKey() +":" + s.getValue());
        }        
        Collection.forEach((k,v) -> System.out.println(" ": + k + " " + v));
    }
