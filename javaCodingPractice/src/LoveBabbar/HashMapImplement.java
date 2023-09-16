package LoveBabbar;

import java.util.LinkedList;

public class HashMapImplement {
    public static class HashMap<K,V>{
        private class Node {
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n; // No. of elements in the hashmap
        private int N; // No. of buckets
        private LinkedList<Node> buckets[]; // Therefore, N = buckets.length
//        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        public void put(K key, V value){
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLL(key, bucketIndex);

            // Operations based on whether the key is already present or not in the HashMap
            if(dataIndex == -1){
                Node node = new Node(key, value);
                buckets[bucketIndex].add(node);
                n++;
            } else {
                Node data = buckets[bucketIndex].get(dataIndex);
                data.value = value;
            }

            double lambda  = (double) n/N;
            double K = 2.0; // Some random threshold, say
            if(lambda > K){
                //Re-hashing
                this.N = this.N*2;

            }
        }

        private int searchInLL(K key, int bucketIndex) {
            LinkedList<Node> ll = buckets[bucketIndex];

            for (int i = 0; i < ll.size(); i++) {
                if(ll.get(i).key == key){
                   return i;
                }
            }
            return -1;
        }

        private int hashFunction(K key) {
            int bucketIndex = key.hashCode();
            return Math.abs(bucketIndex) % N; // This will ensure that the bucketIndex is always in 0 - N-1 range.
        }

    }
}
