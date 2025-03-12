import java.util.*;
// public class Day3{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter your choice: ");
//         int month=sc.nextInt();
//         switch(month){
//             case 1:
//                 System.out.println("January");
//                 break;
//             case 2:
//                 System.out.println("Febuary");
//                 break;
//             case 3:
//                 System.out.println("March");
//                 break;
//             case 4:
//                 System.out.println("April");
//                 break;
//             case 5:
//                 System.out.println("May");
//                 break;
//             case 6:
//                 System.out.println("June");
//                 break;
//             case 7:
//                 System.out.println("July");
//                 break;
//             case 8:
//                 System.out.println("August");
//                 break;
//             case 9:
//                 System.out.println("september");
//                 break;
//             case 10:
//                 System.out.println("oct");
//                 break;
//             case 11:
//                 System.out.println("november");
//                 break;
//             case 12:
//                 System.out.println("December");
//                 break;
//             default:
//                 System.out.println("Invalid option");
//         }
//     }
// }

// public class Day3{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);        
//         System.out.println(" 1.Balance \n 2.Deposit \n 3.Withdraw");
//         System.out.println("Enter your choice:");
//         int option=sc.nextInt();
//         int balance=10000;
//         switch(option){
//             case 1:
//                 System.out.println("Balance is : "+balance);
//                 break;
//             case 2:
//                 System.out.println("Enter Depositing Money: ");
//                 int deposit=sc.nextInt();
//                 int total_amount=balance+deposit;
//                 System.out.println("Balance After Depositing: "+total_amount);
//                 break;
//             case 3:
//                 System.out.println("Enter Withdrawal Money: ");
//                 int withdraw=sc.nextInt();
//                 if (withdraw>balance){
//                     System.out.println("Insufficient Balance.");
//                 }else{
//                 int balance_amount=balance-withdraw;
//                 System.out.println("Balance After Withdraw: "+balance_amount);
//                 }
//                 break;
//             default:
//                 System.out.println("Invalid option.");
//         }
//     }
// }



//* for loop  */
// public class Day3{
//     public static void main(String[] args) {
//         for(int i=1;i<=100;i++){
//             System.out.println(i);
//         }
//     }
// }


//rock,paper,scissors

// public class Day3{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("0. rock\n1.paper\n2.scissor");
//         System.out.println("Enter user1 choice: ");
//         int user1=sc.nextInt();
//         System.out.println("Enter user2 choice: ");
//         int user2=sc.nextInt();
//         if((user1==0 && user2==2) || (user1==1 && user2==0) || (user1==2 && user2==1)){
//             System.out.println("Player1 is winner.");
//         }
//         else if((user1==2 && user2==0) || (user1==0 && user2==1) || (user1==1 && user2==2)){
//             System.out.println("Player2 is winner.");
//         }
//         else if(user1==user2){
//             System.out.println("Match Draw");
//         }else{
//             System.out.println("Invalid user inputs.");
//         }
//     }
// }

// public class Day3{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         for (int i=1;i<=3;i++){
//         System.out.println("0. rock\n1.paper\n2.scissor");
//         System.out.println("Enter user choice: ");
//         int user=sc.nextInt();
//         Random r=new Random();
//         int computer=r.nextInt(3);
//         System.out.println("Show computer choice: "+computer);
//         if((user==0 && computer==2) || (user==1 && computer==0) || (user==2 && computer==1)){
//             System.out.println("You won the match...");
//         }
//         else if((user==2 && computer==0) || (user==0 && computer==1) || (user==1 && computer==2)){
//             System.out.println("Computer won the match...");
//         }
//         else if(user==computer){
//             System.out.println("Match Draw");
//         }else{
//             System.out.println("Invalid user inputs.");
//         }
//         }
//     }
// }


// public class Day3{
//     public static void main(String[] args) {
//         for (int i=1;i<=100;i++){
//             if(i%3==0 && i%5==0){
//                 System.out.println(i);
//             }
//         }
//     }
// }


// public class Day3{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for (int i=1;i<=20;i++){
//             if(n%i==0){
//                 System.out.println(i);
//             }
//         }
//     }
// }


// public class Day3{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//         for (int i=1;i<=n;i++){
//             if(n%i==0 && m%i==0){
//                 System.out.println(i);
//             }
//         }
//     }
// }

//using while loop

// public class Day3{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         while(num>=1){
//             System.out.println(num);
//             num-=1;
//         }
//     }
// }


// public class Day3{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         while(num<=100){
//             System.out.println(num);
//             num+=1;
//         }
//     }
// }


// public class Day3{
//     public static void main(String[] args) {
//         //Scanner sc=new Scanner(System.in);
//         int num1=10;
//         int num2=100;
//         while(num1<=num2){
//             if((num1%3==0) && (num1%5==0)){
//                 System.out.println(num1);
            
//              }
//              num1+=1;
//         }
//     }
// }


//write a java program by using do-while to find sum of even numbers from range 10-20
// public class Day3{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int start=sc.nextInt();
//         int sum=0;
//         int end=sc.nextInt();
//         do{
//             if(start%2==0){
//                 sum+=start;
//             }
//             start+=1;
//         }while(start<=end);
//         System.out.println(sum);
//     }
// }


//perfect program

// public class Day3{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int num=sc.nextInt();
//         int i=1;
//         int sum_factors=0;
//         do{
//             if(num%i==0){
//                 sum_factors+=i;
//             }
//             i+=1;
//         }while(i<num);
//         if(sum_factors==num){
//             System.out.println("Perfect Number.");
//         }else{
//             System.out.println("Not Perfect Number.");
//         }
//     }
// }


//fibonocii range upto n numbers using do-while

// public class Day3{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int i=0;
//         int a=0;
//         int b=1;
//         int n =sc.nextInt();
//         do{
//             // System.out.println(a);
//             int c=a+b;
//             System.out.println(a);
//              a=b;
//              b=c;
//         i+=1;
//         }while(i<n);
//     }
// }


public class Day3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        do{
            int r=num%10;
            rev=(rev*10)+r;
            num=num/10;
        }while(num>0);
        System.out.println(rev);
    }
}