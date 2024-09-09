package W13;

public class W13_03_Array_CountOddEven {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5 ,8 ,21, 30 , 50};
        int countOdd = 0;
        int countEven = 0;
        for (int i = 0; i < numbers.length; i++) {
             System.out.println(numbers [i] + "  ");
             if (numbers [i] %2 == 0) {
                countEven++;
             }else{
                countOdd++;
             }
             
        }
        System.out.println("\nAmount of all number : "+ numbers.length);
        System.out.println("\nAmount of all number : "+ countOdd );
        System.out.println("\nAmount of all number : "+ countEven );
    }  

}