package variable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String str = "Java";
        int num = 100;
        double num2 = 10/3.0;
        System.out.printf("%s 이고 %d 이고 %10.3f \n",str,num,num2);
        System.out.printf("OK \n");
        System.out.printf("%d \n",num); // 2
        System.out.printf("%o \n",num); // 8
        System.out.printf("%x \n",num); // 16
    }
}