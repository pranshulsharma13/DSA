//public class Pattern {
//	public static void main(String[] args) {
//		for(int i=0;i<=4;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print("* ");
//			}
//			System.out.println(" ");
//		}
//	}
//
//}
//// Output
//* * * * *
//* * * * *
//* * * * *
//* * * * *
//* * * * *


//public class Pattern{
//	public static void main(String[] args) {
//		int n=4;
//		int m=5;
//		for (int i=1;i<=n;i++) {
//			for(int j=1;j<=m;j++) {
//				if( i==1 || j==1 || i==n || j==m) {
//					System.out.print("* ");
//
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println(" ");
//		}
//	}
//
//}
//// OUTPUT
//* * * * *
//*       *
//*       *
//* * * * *


//public class Pattern{
//	public static void main(String[] args) {
//		int n = 5;
//		for(int i = 1;i<=n;i++) {
//			for(int j = 1;j<=i;j++) {
//				System.out.print("* ");
//			}
//
//			System.out.println(" ");
//		}
//	}
//}
//// OUTPUT
//*
//* *
//* * *
//* * * *
//* * * * *


//public class Pattern{
//    public static void main(String[] args) {
//        int m = 4;
//        for(int i = m;i>=1;i--) {
//            for(int j = 1;j<=i;j++) {
//                System.out.print("* ");
//            }
//
//            System.out.println(" ");
//        }
//    }
//
//}
////output
////* * * *
////* * *
////* *
////*


//public class Pattern {
//    public static void main(String[] args){
//        int n = 4;
//        for(int i=1 ; i<=n ; i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j = 1;  j <= i ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//}
////OUTPUT
////   *
////  **
//// ***
////****

//public class Pattern{
//    public static void main(String[] args){
//        int n=5;
//        for(int i=0 ; i<=n ; i++){
//            for(int j=1 ; j<=i ; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println(" ");
//        }
//    }
//}
//
////Output
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5


//public class Pattern{
//    public static void main(String[] args){
//        int n=5;
//        for(int i = n; i>=1 ; i--){
//            for(int j = 1 ; j<=i ; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println(" ");
//        }
//    }
//}
//ANOTHER METHOD------------
//public class Pattern{
//    public static void main(String[] args){
//        int n = 5;
//        for(int i =1; i<=n ;i++){
//            for(int j = 1 ; j <= n-i+1 ; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println(" ");
//        }
//    }
//}
////OUTPUT
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1


//public class Pattern{
//    public static void main(String[] args){
//        int n=5;
//        int num = 1;
//        for(int i=0 ; i<=n ; i++){
//            for(int j=1 ; j<=i ; j++){
//                System.out.print(num + " ");
//                num++;
//            }
//            System.out.println(" ");
//        }
//    }
//}
//OUTPUT
//1
//2  3
//4  5  6
//7  8  9  10
//11 12 13 14 15
//
//public class Pattern{
//    public static void main(String[] args){
//        int n=5;
//        int num = 1;
//        for(int i=0 ; i<=n ; i++){
//            for(int j=1 ; j<=i ; j++){
//                int sum = i+j;
//                if(sum%2 != 0){
//                    System.out.print(0);
//                }else{
//                    System.out.print(1);
//                }
//            }
//            System.out.println(" ");
//        }
//    }
//}
////OUTPUT
//1
//01
//101
//0101
//10101


/
//public class Pattern{
//    public static void main(String[] args){
//        int n =5;
//        //upper half
//        for(int i = 0;i<=n;i++){
//            //1st part
//            for(int j = 1; j<=i ;j++) {
//                System.out.print("*");
//            }
//            //spaces
//            int spaces = 2*(n-i);
//            for(int a=1;a<=spaces; a++){
//                System.out.print(" ");
//            }
//
//            //2nd part
//            for(int b=1; b<=i ;b++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        //lower half
//        for(int i = n ;i>=1 ;i--){
//            //1st part
//            for(int j = 1; j<=i ;j++) {
//                System.out.print("*");
//            }
//            //spaces
//            int spaces = 2*(n-i);
//            for(int a=1;a<=spaces; a++){
//                System.out.print(" ");
//            }
//
//            //2nd part
//            for(int b=1; b<=i ;b++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//

//output
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *


//    public static void main(String[] args){
//        int n = 5;
//        for(int i = 1;i<=n;i++){
//            //spaces
//            for(int j = 1; j<=n-i ; j++){
//                System.out.print(" ");
//            }
//            //stars
//            for(int j=1;j<=n;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//output
//                  *****
//                *****
//              *****
//            *****
//          *****

//    public static void main(String[] args){
//        int n = 5;
//        for(int i = 1; i<=n;i++){
//            for(int j = 1;j<=n-i;j++){
//                System.out.print(" ");
//
//            }
//            for(int j = i ; j >=1 ;j--){
//                System.out.print(j);
//            }
//            for(int j = 2; j<=i; j++){
//                System.out.print(j);
//            }
//
//
//
//            System.out.println();
//        }
//
//    }
    //output
//    1
//   212
//  32123
// 4321234
//543212345


    public static void main(String[] args){
        int n = 5;
        for(int i = 1; i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");

            }
            for(int j = i ; j >=1 ;j--){
                System.out.print("*");
            }
            for(int j = 2; j<=i; j++){
                System.out.print("*");
            }



            System.out.println();
        }

        for(int i = n; i>=1;i--){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");

            }
            for(int j = i ; j >=1 ;j--){
                System.out.print("*");
            }
            for(int j = 2; j<=i; j++){
                System.out.print("*");
            }



            System.out.println();
        }

    }
    //output
//    *
//   ***
//  *****
// *******
//*********
//*********
// *******
//  *****
//   ***
//    *

}
