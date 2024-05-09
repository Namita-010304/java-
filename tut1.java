// /**  tut1  **/
// public class tut1 
// {
//     public static void main(String[] args) 
//     {
//         System.out.println("hi ");
//     }
// }

// Java Program to Check for Command Line Arguments

/*
typecasting - widening (int to float)  */

// public class tut1 {

// 	public static void main(String[] args) {
// 		int a = 10;
// 		float b = a;
// 		System.out.println("value of int a is " + a + "\n value of float var is " + b);

// 	}
// }

/* type casting   narrowing float to int  */
// public class tut1 {

// 	public static void main(String[] args) {

// 		float b = 10.0f;
// 		int a = (int) b;
// 		System.out.println("value of int a is " + a + "\n value of float var is " + b);

// 	}
// }

/* adding byte and short that on addig get converted into int but this gives compile time error  */

// class tut1 {
// 	public static void main(String[] args) {
// 		byte a = 10;
// 		byte b = 10;
// 		// byte c=a+b;//Compile Time Error: because a+b=20 will be int
// 		byte c = (byte) (a + b);
// 		System.out.println(c);
// 	}
// }

// public class tut1{  
// 	public static void main(String args[]){  
// 	short a=10;  
// 	short b=10;  
// 	a=(short)(a+b);//20 which is int now converted to short  
// 	System.out.println(a);  
// 	}} 
