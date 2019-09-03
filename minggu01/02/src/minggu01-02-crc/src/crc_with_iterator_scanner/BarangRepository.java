package crc_with_iterator_scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class BarangRepository {
	
	ArrayList<Object> listBarang ;
	Number myNumber ;
	public void add(BarangInterface ObjBarang) {
		
		 listBarang = new ArrayList<Object>(Arrays.asList(ObjBarang));
		 listBarang.add(ObjBarang);
//		Barang lisBarang[]= myBarang ;
		
    }
	public  ArrayList<Object> getList() {
		return listBarang;
		
    }
	
}
