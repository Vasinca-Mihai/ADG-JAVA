package Lecture_6_collections.MyHashTable;

public class MHashTableImplemetation<K, V> implements MyHashTable<K, V>{
    private Object[] table = new Object[]{null};
    private int nrOfElemnts = 0;

    public V get(K key){
        return (V) this.table[key.hashCode()];
    }
    public void put(K key, V value){
        int temp_key = key.hashCode();
        if(temp_key > this.table.length-1){
            Object[] temp_table= new Object[temp_key+1];
            for(int i=0;i<=temp_key && i<table.length;i++){
                temp_table[i]=this.table[i];
            }
            this.table = temp_table;
        }
        table[temp_key] = value;
        nrOfElemnts++;

    }
    public void remove(K key){table[key.hashCode()] = null;}
    public boolean containsKey(K key){return table[key.hashCode()] != null;}
    public int size(){return nrOfElemnts;}
}
