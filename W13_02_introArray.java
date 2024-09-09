package W13;

public class W13_02_introArray{

    public static void main(String[] args){
        String[] brandCars = new  String[4];

        brandCars[0] = "Toyota";
        brandCars[1] = "Honda";
        brandCars[2] = "Nissan";
        brandCars[3] = "Mizsu";

        System.out.println("Brand of cars in the array are : ");
            for (int i=0; i< brandCars.length ;i++) {
            System.out.print(brandCars[i]+ " ");

        }
        brandCars[2] = " Nissan" ;
        System.out.println("\nBrand of cars in the array are : ");
            for (int i=0; i< brandCars.length ;i++) {
            System.out.print(brandCars[i]+ " / ");
        }
        brandCars[0] = " Toyota " ;
        System.out.println("\nBrand of cars in the array are : ");
        for (String car  : brandCars ) {
            System.out.print(car + " / ");
        }
    }
}