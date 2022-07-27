package org;

public class overloading{
    public static int add(int i, int j){
        return (i+j);
    }
    public static int add(int i, int j, int k){
        return(i+j+k);
    }
    public static void main(String[] args) {
        System.out.println(add(5,10));
        System.out.println(add(5,6,7));
    }
}
