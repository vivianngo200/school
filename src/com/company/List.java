package com.company;

public class List {
    private Object [] arr;
    private int numElements;

    public List(){
        arr = new Object[10];
    }
    public void add(Object a){
        if(isFull()){
            throw new IndexOutOfBoundsException();
        }
        else {
            for (int i = 0; i < 10; i++) {
                if (arr[i] == null) {
                    arr[i] = a;
                    numElements++;
                }
            }
        }
    }

    public void remove(int index){
        arr[index] = null;

        for(int i = index; i < 9; i++){
            arr[i] = arr[i+1];
            arr[i + 1] = null;
            numElements--;
        }
    }

    public void addAt(Object a, int b){
        if(arr[b] == null && b <= 9){
            arr[b] = a;
            numElements++;
        }
        else{
            if(arr[9] == null){
                for(int i = 8; i >= b; i--){
                    arr[i+1] = arr[i];
                    arr[i] = null;
                }
                arr[b] = a;
                numElements++;
            }
        }
    }

    public Object getInt(Object a){
        //returns the index where the object is
        int place = -1;

        for(int i = 0; i < 10; i++){
            if(arr[i] == a){
                place = i;
            }
        }
        return place;
    }

    public int getNumElements(){
        return numElements;
    }
    public void removeAll(){
        arr = new Object[10];
    }
    public boolean isEmpty(){
        Boolean empty = true;
        for(int i = 0; i < 10; i++ ){
            if(arr[i] != null){
                empty = false;
            }
        }

        return empty;
    }

    public boolean isFull(){
        Boolean full = true;
        for(int i = 0; i< 10; i++){
            if(arr[i] == null){
                full = false;
            }
        }
        return full;
    }

    public Object getItem(int index){
        return arr[index];
    }


}
