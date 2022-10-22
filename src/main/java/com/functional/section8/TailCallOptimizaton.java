package com.functional.section8;

public class TailCallOptimizaton {

    public static void main(String[] args) {

    }

    public static long reFact(int n){
        if (n<= 1)
            return 1;
        else
            return n * reFact(n-1);
    }

    public static long tailRefact (int n, int a){
        if( n<=1)
            return a;
        else
        return tailRefact(n-1,n*a);
    }
}
