import java.util.Scanner;
public class Recursion2 {

// Print String 
static void Print(int x,int y){
    if(x>y){
        return;
    }
    System.out.println("User");
    x++;
    Print(x,y);
}

// Print 1 to n numbers
static void Print1(int i,int n){
    if(i>n){
        return;
    }
    System.out.println(i);
    i++;
    Print1(i,n);
}

//Print n to 1 numbers
static void Print2(int x){
      if(x<=0){
        return;
      }
      System.out.println(x);
      x--;
      Print2(x);
}

// Print 1 to n numbers by using one parameter
static void Print3(int i){
    if(i<1){
        return;
    }
    Print3(i-1);
    System.out.println(i);
}

// Print n to 1 numbers by using two parameter
static void Print4(int i,int n){
    if(i>n){
        return;
    }
    Print4(i+1, n);
    System.out.println(i);
}
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int i= sc.nextInt();
       int n= sc.nextInt();
       Print(i,n);
       sc.close();
   } 
}
