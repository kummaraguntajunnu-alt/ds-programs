import java.util.Scanner;
class Main {
    public static void show(){
     System.out.println("It is void return type");
    }
    public static int mul(int a,int b) {
    return a*b;
    }
     public static int mul(int a,int b,int c) {
    return a*b*c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        show();
        System.out.println(mul(a,b));
         System.out.println(mul(a,b,c));
    }
}
