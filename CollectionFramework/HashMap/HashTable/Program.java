package CollectionFramework.HashMap.HashTable;

import java.util.LinkedList;

class HashTable<K,V>{
    private class Entry {
        K key;
        V value;

        Entry(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    //array of linked list
    private final LinkedList<Entry>[] array;
    private int size;

    public HashTable(int capacity){
        array = new LinkedList[capacity];
        size = 0;
    }

    //hash function to compute index or the hash table implementation
    private int hash(K key){
        int hashCode = key.hashCode();
     //   System.out.println(hashCode);
        return Math.abs(key.hashCode() % array.length); //mapping to the index
    }

    //inserting key and value pair
    public void put (K key, V value){
        int index = hash(key);
        if(array[index] == null){
            array[index] = new LinkedList<>();
        }

        //checking if the key already exists to update value
        for(Entry entry : array[index]){
            if(entry.key.equals(key)){
                entry.value = value;
                return;
            }
        }

        array[index].add(new Entry(key, value));
        size++;
    }

    //retrieve value by key
    public V get(K key){
        int index = hash(key);
        if(array[index] != null){
            for(Entry entry : array[index]){
                if(entry.key.equals(key)){
                    return entry.value;
                }
            }
        }
        return null;
    }

    //size of hash table
    public int size() {
        return size;
    }
}
public class Program {
    public static void main(String[] args) {
        HashTable<String, String> hashTable = new HashTable<>(10);
        hashTable.put("h1", "abc");
        hashTable.put("aa", "qs");
        hashTable.put("p1","p1"); //two different keys: p1 and p2 but same hash-code: 3521
        hashTable.put("p2", "p1");

        System.out.println("Value for key 'h1': " + hashTable.get("h1")); // Should print "abc"
        System.out.println("Value for key 'aa': " + hashTable.get("aa")); // Should print "qs"
        System.out.println("Value for key 'p1': " + hashTable.get("p1")); // Should print "pl"

        //hashcode
        System.out.println(hashTable.get("h1").hashCode());
        System.out.println(hashTable.get("aa").hashCode());
        System.out.println(hashTable.get("p1").hashCode());
        System.out.println(hashTable.get("p2").hashCode());


    }
}
