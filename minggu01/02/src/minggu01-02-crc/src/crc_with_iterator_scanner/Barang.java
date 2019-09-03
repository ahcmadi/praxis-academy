package crc_with_iterator_scanner;

public class Barang  implements BarangInterface{
	private int kodeBarang;
	private String namaBarang;
	private float harga;
	public void setCode(int kodeBarang) {
		this.kodeBarang = kodeBarang;
	}
	public int getCode() {
		return this.kodeBarang;
	}
	public  void setName(String namaBarang) {
		this.namaBarang = namaBarang;
	}
	public String getName() {
		return this.namaBarang;
	}
	public void setPrice(float harga) {
		this.harga = harga;
	}
	public float getHarga() {
		return this.harga;
	}
	public void setBarang(int kodeBarang, String namaBarang, float harga) {
		
	}
}
