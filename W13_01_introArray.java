package W13;

public class W13_01_introArray{

    public static void main(String[] args) {
        String []colors = {"Purple","Cyan","Blue","Green","Yellow","Orange","Red"};
        int [] Bank = {20,50,100,50,1000};
        char [] Alphabets = {'A','B','c','d','e'};
        
        
        System.out.println("The first color is "+ colors[1]);
        System.out.println("The Third is " + Alphabets[2]);

        System.out.println("Colors in array are");
        for (int i=0; i< 7; i++) {
            System.out.print(colors[i]+ " ");
        }
        System.out.println("");
        System.out.println("===================");
        for (int i=6; i> 0; i--) {
            System.out.print(colors[i]+ " ");
        }
        
        System.out.println("");
        System.out.println("===================");
        System.out.println("Bank in the array are : ");
        for (int i=0; i< BackingStoreException.length ; i++ ) {
            System.out.print(banks[i]+ " ");
    }
}