package crc_with_iterator_scanner;

import java.util.Scanner;

public class Main {
//	private static Barang newBarang;
	public static void main(String[] args) {
		Barang newBarang;
		// TODO Auto-generated method stub
		BarangRepository ListBarang= new BarangRepository();
//		newBarang = new Barang();
//		newBarang.setCode(1);
//		newBarang.setName("Pepsode");
//		newBarang.setPrice(1000);
////		ListBarang.add(newBarang);
		newBarang = new Barang();
		newBarang.setCode(2);
		newBarang.setName("LifeBouy");
		newBarang.setPrice(2000);
		ListBarang.add(newBarang);
		for (Object temp : ListBarang.getList()) {
			System.out.println(((Barang) temp).getCode());
			System.out.println(((Barang) temp).getName());
		}

	}

}
