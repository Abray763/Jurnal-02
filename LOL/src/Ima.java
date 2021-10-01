import java.util.Scanner;
public class Ima {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama :");
        String a = sc.nextLine();
        System.out.print("Kelas :");
        int b = sc.nextInt();
        System.out.print("Nim :");
        long c = sc.nextLong();
     
        System.out.println("Nama\t : "+ a);
        System.out.println("Kelas\t :  "+ b);
        System.out.println("Nim\t : "+ c);
    }
}


