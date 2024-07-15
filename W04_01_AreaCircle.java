import java.util.Scanner;    // นำเข้าคลาส scaner จาก java.util
public class W04_01_AreaCircle{
    
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in); //สร้างอ๊อบเจ็กของคลาส  Scaner
        System.out.println("ป้อนค่ารัศมีของวงกลม: "); // แสดงข้อความที่ให้ผู้ใช้ป้อนค่ารัศมี
        double radius = sc.nextDouble(); //รับรัศมีจากผู้ใช้และเก็บในตัวแปร

        // double radius; //ประกาศตัวแปรเก็บค่ารัศมี
        // radius = 23;

        double area;       //ประกาศตัวแปรเก็บค่าพื้นที่
        double PI = 3.14159; // ประกาศค่าคงที่ PI

        area = PI*radius*radius; //คำนวนพื้นที่ของวงกลม
        System.out.println("พื้นที่ของวงกลมที่มีรัศมีเท่ากับ"+radius+" คือ "+area);
    }
}