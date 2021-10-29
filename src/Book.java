
public class Book {
	int id1;
	String judul;
	
	public Book(String judul, int id1) {
		this.judul = judul;
		this.id1 = id1;
	}
	
	public void lihat() {
		System.out.println(id1+"."+" "+judul);
	}
	
	public void lihat2() {
		System.out.print(id1+"."+" "+judul+";");
	}
	
}

