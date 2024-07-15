import java.util.Scanner;
public class W04_02_ifElse_compareNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the Second number: ");
        int num2 = input.nextInt();

        int result = 0;


        if(num1>num2) {
            System.out.println("ค่าที่ 1 มากกว่า ค่าที่ 2 สอง");    
                result = num1-num2;
        } else {
            System.out.println("ค่าที่ 1 น้อยกว่า ค่าที่ 2 สอง");
                result = num1+num2;
        }
        System.out.println("The result is: " + result);
    }
}