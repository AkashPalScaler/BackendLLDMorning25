package org.example.Generics;

public class Pair <V , S>{
//    Integer rating;
    V first;
    S second;

    public Pair(){

    }
    public Pair(V first, S second) {
        this.first = first;
        this.second = second;
    }

    public V getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public void setFirst(V first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }
    //Generic methods
    public static <V, S> void something(V first, S second){ //New set of V,S as static doesn't have access to non-static generic types
        System.out.println("First :" + first +" Second : "+ second);
    }

    public void something1NonStatic(V first, S second){ // Non-static uses same V,S
        System.out.println("First :" + first +" Second : "+ second);
    }

    public <T, R> R somethingNonStatic(T first, R second){ //Non-static can also use new generic types
        System.out.println("First :" + first +" Second : "+ second);
        return second;
    }
}
//Pair<Integer, String>
