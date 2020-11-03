package com.csmithswim.generics;

//User class implements Comparable interface
public class User implements Comparable <User> {
    private int points;

    public User(int points){
        this.points=points;
    }

    @Override
    public int compareTo(User o) {
        //this < 0 -> -1
        //this == 0 -> 0
        //this > 0 -> 1

    return points - o.points;
    }
}

