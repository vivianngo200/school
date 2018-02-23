package com.company;

public class Main {

    public static void main(String[] args) {
	    List lis = new List();
	    lis.add("Hi");
	    lis.add("Bonjour");
	    lis.add("Ni hao");
	    lis.add("Ciao");

	    lis.remove(1);

	    System.out.println(lis);
    }
}
