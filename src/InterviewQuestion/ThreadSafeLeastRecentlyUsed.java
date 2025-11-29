package InterviewQuestion;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;


/*
* In java, write a thread-safe LRU (Least Recently Used) cache class with get(key) and put(key,value) methods.
* The cache should have fixed capacity and evict the lease recently used item when full.
* Explain your design decisions briefly in comments.
* */
public class ThreadSafeLeastRecentlyUsed<K,V> {

    private final int capacity;

    private final LinkedHashMap<K,V> map;

    private final ReentrantLock lock = new ReentrantLock();
    public ThreadSafeLeastRecentlyUsed(int capacity) {
        this.capacity = capacity;
        this.map = new LinkedHashMap<K,V>(capacity,0.71f, true){

            public boolean removeEldestEntry(Map.Entry<K,V> eldest){

                return size() > ThreadSafeLeastRecentlyUsed.this.capacity;
            }
        };

    }

    public V get(K key){
        lock.lock();
        try {
            return map.get(key);
        }finally {
            lock.unlock();
        }
    }

    public void put(K key, V value){
        lock.lock();
        try {
            map.put(key,value);
        }finally {
            lock.unlock();
        }
    }

    public int size(){
        lock.lock();

        try{
            return map.size();
        }finally {
            lock.unlock();
        }
    }

}
