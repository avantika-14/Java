package generic;

import java.util.Arrays;
import java.util.List;

//T should be number or its subclasses
public class Wildcard<T extends Number> {
    private Object[] data;
    private static int DEFAULT_CAPACITY = 10;
    private int size = 0;

    public Wildcard() {
        data = new Object[DEFAULT_CAPACITY];
    }

    //to double check
//    public void getList(List<Number> list){
        // do something
        // can only pass Number type
//    }

    public void getList(List<? extends Number> list){
        // do something
        //can pass subclasses of Number
    }

    public void add(T num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize(){
        Object[] temp = new Object[data.length * 2];
        for(int i = 0; i < size; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull(){
        return size == data.length - 1;
    }

    public T remove(){
        T removed = (T)data[--size];
        return removed;
    }

    public int size(){
        return size;
    }

    public T get(int index){
        return (T)data[index];
    }

    public void set(int index, T value){
        data[index] = value;
    }

    public String toString(){
        return "generic.CustomArrayList{" +
                "data" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Wildcard<Integer> list = new Wildcard<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
    }
}
