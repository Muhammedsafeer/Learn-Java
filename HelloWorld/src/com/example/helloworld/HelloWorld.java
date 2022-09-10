package com.example.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("String, int");
        int number = 15;
        String string = "Jhon";
        System.out.println(number);
        System.out.println(string);
        System.out.println(" ");


        int x = 5;
        int y = 10;
        int z = 20;
        System.out.println(x + y * z);
        System.out.println(" ");


        int myNum = 5;               // Integer (Whole Number)
        float myFloatNum;            // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String


        /*Data Type		Size 		Description
        byte        	1 byte	    Stores whole numbers from -128 to 127
        short	        2 bytes	    Stores whole numbers from -32,768 to 32,767
        int	            4 bytes	    Stores whole numbers from -2,147,483,648 to                                                   2,147,483,647
        long	        8 bytes	    Stores whole numbers from -9,223,372,036,854,775,808 to                                       9,223,372,036,854,775,807
        float	        4 bytes	    Stores fractional numbers. Sufficient for storing 6 to                                     7 decimal digits
        double	        8 bytes	    Stores fractional numbers. Sufficient for storing 15                                       decimal digits
        boolean	        1 bit	    Stores true or false values
        char	        2 bytes	    Stores a single character/letter or ASCII values*/
        System.out.println(" ");

        //w3schools.com/java/java_data_types_boolean.asp
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false
        System.out.println(" ");


        //w3schools.com/java/java_data_types_characters.asp
        char myGrade = 'b';
        System.out.println(myGrade);
        System.out.println(" ");


        //www.w3schools.com/java/java_operators.asp
        int num1 = 50;
        int num2 = 100;
        int num3 = 250;
        int sum1 = num1 + num2;     //150 (50 + 100)
        int sum2 = sum1 + num3;     //400 (150 + 200)
        int sum3 = sum2 + sum2;     //800 (400 + 400)
        System.out.println("sum3 = " + sum3);
        System.out.println("sum1 = " + sum1 + " (" + num1 + " + " + num2 + ") ");
        System.out.println("sum2 = " + sum2 + " [sum1 + " + num3 + " ( "+ sum1 + " + " + num3 + ") ]");
        System.out.println("sum3 = " + sum3 + " {sum2 + sum2 [sum1 + " + num3 + " + sum1 + " + num3 + " (" + num1 + " + " + num2 + " + " + num3 + " + " + num1 + " + " + num2 + " + " + num3 + ") ] }");
    }
}
