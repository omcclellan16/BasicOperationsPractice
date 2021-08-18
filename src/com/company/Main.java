package com.company;

public class Main {

    public static void main(String[] args) {
	int x = 5;
	int y = 7;
	int z = 56;
	int sum = x + y + z;

        System.out.println(sum);
        // you get 68

        int prod = x * y * z;
        System.out.println(prod);
        // you get 1960

        // can do the same with division and subtraction

    // order of operations (PEMDAS)
    int ans = x * y - z;
        System.out.println(ans);
        //ans is -21

    int new_ans = (x * (y - z));
        System.out.println(new_ans);
        //ans is -245

    // division is a little different...
        int u = z / y;
        System.out.println(u);
        // okay makes, sense, now try this...
        int w = z / x;
        System.out.println(w);
        // answer is 11... where did the decimal points go??? 56 / 5 = 11.2... because this is an integer, the system
        // gives us only whole numbers, and removes the decimals... because we are using an int... TRY THIS!
        double n = z / x;
        System.out.println(n);
        //answer is 11.0... this is because the data types we are dividing are both integers try THIS!
        double a = 56;
        double b = 5;
        double c = a / b;
        System.out.println(c);
        // now we get 11.2 - our floating point number :) this will also work if just one of the values that we are
        //dividing is a double - we will still get a floating point number!


        // EXPONENTS
        double d = Math.pow(x,y);
        System.out.println(d);
        // x is the base, y is the exponent


        //Remainders
        int q = 56 % 5;
        System.out.println(q);
        // answer is 1; the remainder when you divide 56 by 5; the % sign is the "modulus"






    }
}
