class ConditionalOperator{
    public static void main(String[] args) {
        System.out.println("This is Condition Operator Question Solution From Ques . 1 to Ques. 19");

        System.out.println();
    // Q1. WAP to check and print the given number is an even number or not.
        System.out.print("Ques 1: ");
        int a = 5592;
        String result1 = (a%2 == 0) ? "The Number is Even" : "The Number is Odd";
        System.out.println(result1);

//    Q. 2 : WAP to check and print the given +ve number is a three digit number or not.
        System.out.print("Ques 2: ");
        int b = 878;
        String result2 = b>=100 && b<=999 ? "The given number is 3 digit Number" : " The given number is not a 3 digit Number";
        System.out.println(result2);

//    Q.3 : WAP to check and print the given number is divisible by both 3 and 5 or only by 3, only by 5 or None.
        System.out.print("Ques 3: ");
        int c  = 786380;
        String result3 = (c%3 == 0 && c%5 == 0) ? "The Given Number is Divisible by both 3 and 5" : (c%3 == 0 ? "The Number is Divisible by Only 3": (c%5==0 ? "The Number is Divisible by Only 5": "The Number is Not Divisible by 3 or 5") );
        System.out.println(result3);
// Q.4 : For given numbers x and y. check whether y is a factor of x or not.
//Input: x=12,
//y=4
//Output: x is a factor of y
//Input: x=28,
//y=5
//Output: x is not a factor of y
        System.out.print("Ques 4: ");

        int n1 = 87238;
        int n2 = 8;
        String result4 = (n1%n2==0)?"x is a factor of y": "x is not factor of y";
        System.out.println(result4);

//Q.5 : WAP to check whether the three sides of a triangle is valid or not.
        System.out.print("Ques 5: ");
        int ang1 = 88;
        int ang2 = 98;
        int ang3 = 10;
        System.out.println((ang1+ang2+ang3 == 180)?"This is a Valid Triangle":"Invalid triangle");
//  Q.6 :For a given year print true if it is a leap year or print false if it is not a leap year.
        System.out.print("Ques 6: ");
        int year = 2026;
        System.out.println(year%4==0?"Leap Year":"Not a Leap Year");
//  Q.7 :WAP to check whether the given character is an upper case alphabet or not.
        System.out.print("Ques 7: ");
        char chUpper = 'A';
        System.out.println( (int)(chUpper) >= 65 && (int)(chUpper) <= 90 ? " The Given Character is Upper Case Character" : "The Given Character is not a Uppercase Character" );
//  Q.8 :WAP to check whether the given character is a lower case alphabet or not.
        System.out.print("Ques 8: ");
        char chLower = 'A';
        System.out.println( (int)(chLower) >= 97 && (int)(chLower) <= 122 ? " The Given Character is LowerCase Character": "The Given Character is not a Lowercase Character" );
//  Q.9 : WAP to check whether the given character is an alphabet or not.
        System.out.print("Ques 9: ");
        char alphabet = 'a';
        System.out.println((((int)alphabet >= 65 && (int)alphabet <= 90) || ((int)(alphabet) >= 97 && (int)(alphabet) <= 122 )) ? "The Given Character is a Alphabet" : "The Given Character is not a Alphabet Character");
//  Q.10 : Given a character, check if it's uppercase, lowercase, digit or special character.
        System.out.print("Ques 10: ");
        char ch = '@';
        int chAscii = (int)(ch);
        String result10 = (chAscii >= 32 && chAscii < 127) ? (((chAscii >= 32 && chAscii<=47) || (chAscii >= 58 && chAscii<=64) || (chAscii >= 91 && chAscii<=96) || (chAscii >= 123 && chAscii<=126)) ? "The Given Character is a Special Character " : ((chAscii>=65 && chAscii <= 90) ? "The Given Character is UpperCase Character " : ((chAscii >= 97 && chAscii <= 122)?"The Given Character is LowerCase Character " : "The Given Character is a Digit" ))): "The Given Character is Not a Number , Not Uppercase Character ,Not Lowercase Character, Not a Special Character";
        System.out.println(result10);
//  Q.11 :WAP to print the bigger of two numbers.
        System.out.print("Ques 11: ");
        int biggerDigit = 2;
        int result11 =  (int)Math.pow(10,biggerDigit) -1;
        System.out.println(result11);

//  Q.12 :WAP to print the smaller of two numbers.
        System.out.print("Ques 12: ");
        int smallerDigit = 2;
        int result12 = (int) Math.pow(10,smallerDigit-1);
        System.out.println(result12);

//  Q.13 :WAP to print the biggest of three numbers.
        System.out.print("Ques 13: ");
        int biggestDigit = 3;
        int result13 =  (int)Math.pow(10,biggestDigit) -1;
        System.out.println(result13);
//  Q.14 :WAP to print the smallest of three numbers.
        System.out.print("Ques 14: ");
        int smallestDigit = 3;
        int result14 = (int) Math.pow(10,smallestDigit-1);
        System.out.println(result14);
//  Q.15 :print second largest of three distinct numbers using ternary operator only.
        System.out.print("Ques 15: ");
        int distinct1 = 988;
        int distinct2 = 8374;
        int distinct3 = 2386;
        int result15 = (distinct1>distinct2 && distinct1 > distinct3)? (distinct2> distinct3 ? distinct2 : distinct3) : (distinct2>distinct1 && distinct2>distinct3 ? (distinct1>distinct3 ? distinct1:distinct3): (distinct3 > distinct1 && distinct3 > distinct2 ? (distinct1>distinct2 ? distinct1 : distinct2): 0));
        System.out.println(result15);


//  Q.16 :Given three numbers, print them in sorted order (ascending)
//int a = 9, b = 2, c = 7;
// Output: 2 7 9
        System.out.print("Ques 16: ");
        int a1 =9,a2 = 2, a3 =7;
        String result16 = (a1<a2 && a1<a3) ? (a2<a3 ? (a1+" " + a2+ " " +a3 ): (a1+" " + a3 + " " +a2 ) ) : ((a2<a1 && a2<a3) ? (a1<a3 ? (a2 + " " + a1 + " "  + a3):(a2 + " " + a3 + " " + a1 )): (a2<a1) ? (a3 + " " + a2 + " " + a1) : (a3 + " " + a1 + " " + a2) );
        System.out.println(result16);

//  Q.17 :WAP to print the biggest of four numbers.
        System.out.print("Ques 17: ");
        int biggestNum = 4;
        int result17 =  (int)Math.pow(10,biggestNum) -1;
        System.out.println(result17);

//  Q.18 :WAP to print the smallest of four numbers
        System.out.print("Ques 18: ");
        int smallestNum = 4;
        int result18 =  (int)Math.pow(10,smallestNum-1) ;
        System.out.println(result18);
//  Q.19 :Test the Rank of a student
//int marks = 72;
//Output: "Distinction" (>=75), "First Class" (>=60), "Second Class" (>=50), “Pass“ (>=35), or “Fail”
        System.out.print("Ques 19: ");
        int marks = 80 ;
        String result19 = marks>=75 && marks <= 100 ? " Distinction" : (marks <75 && marks >= 60  ? " First Class " : (marks <60 && marks >= 50 ? "Second Class " : (marks>= 35 && marks <50 ? "Pass" : " Fail "))) ;
        System.out.println(result19);
        System.out.println();












    }

}