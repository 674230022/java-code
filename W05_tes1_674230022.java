import java.util.Scanner;
public class W05_tes1_674230022{
    public static void main(String[] args) {
         
        System.out.println("My Name : Pooriphat polsri ");
        System.out.println("รหัสนักศึกษา : 674230022 ");
        Scanner scan = new Scanner(System.in);
        System.out.print(" กว้าง : ");
        float Width = scan.nextFloat();
        System.out.print(" ยาว : ");
        float Long = scan.nextFloat();  
        System.out.printf(" พื้นที่ของสี่เหลี่ยมผืนผ้าคือ %.2f ", Width * Long);

    }
}