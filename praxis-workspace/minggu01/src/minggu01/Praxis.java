package minggu01;

import java.util.Scanner;

public class Praxis {
	
	public static void main(String args[]) {
		  String nama,belakang;
		  Number num;

        Scanner input = new Scanner(System.in);

        System.out.print("massukkan nama Depan :");
        nama = input.nextLine();
        belakang = "- Muhammad";
        System.out.println(nama+" "+belakang);

        for (int i=0; i < 3; i++)
        {
        	num=i+1;
            System.out.println(num+". Knock");
        }
        System.out.println("Penny! done");
	      
	      
	   }
}
