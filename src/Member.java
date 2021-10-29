import java.util.Vector;

public class Member {
	String nama;
	String status;
	int id;
	int id1;
	String judul;
	Vector<Book> pinjam = new Vector<>();
	
	public Member(String nama, String status, int id) {
		this.nama = nama;
		this.status = status;
		this.id = id;
	}
	
	
	public void borrow(Book book) {
		for(int a=0; a<pinjam.size(); a++) {
			if(book.id1 == pinjam.get(a).id1) {
				System.out.println("Book has already borrowed.");
				return;
			}
		}	
		if(pinjam.size() > 2) {
			System.out.println("Maximum borrowing exceeded.");
		}
		else {
			Book book1 = new Book(book.judul, book.id1);
			pinjam.add(book1);
			System.out.println("Borrowing success.");	
			}
	}
	
	public void retur(Book book) {	
	for(int a = 0; a<pinjam.size(); a++) {
		if(book.id1 == pinjam.get(a).id1) {
			pinjam.remove(a);
			System.out.println("Book returned");
			return;
				}
			}
			System.out.println("Book has not been borrowed");
			return;
	}
	
	
	public void view() {
		System.out.print(id+"."+" "+nama +" "+"-- Borrowed books: ");
	}
	
	public void view2() {
		if(pinjam.isEmpty()) {
			System.out.println();
		}else {
			for(int i=0; i<pinjam.size(); i++) {
				pinjam.get(i).lihat2();
			}
			System.out.println();
		}
	}
	
	}

