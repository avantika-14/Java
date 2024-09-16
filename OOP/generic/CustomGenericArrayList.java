package generic;

import java.util.Arrays;

public class CustomGenericArrayList<T> {
    private Object[] data;
    private static int DEFAULT_CAPACITY = 10;
    private int size = 0;

    public CustomGenericArrayList() {
        data = new Object[DEFAULT_CAPACITY];
    }

    //public generic.CustomGenericArrayList() {
    //    this.data = new T[DEFAULT_CAPACITY];
    // } -- not allowed

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
        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
    }
}
