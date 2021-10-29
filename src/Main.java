import java.util.ArrayList;
import java.util.Scanner;
//Nama: Jason Laurentinus
//Nim: 2301874866
//Jurusan: Mobile Application and Technology

public class Main {
	ArrayList<Book> buku = new ArrayList<>();
	ArrayList<Member> member = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	public Main() {
		int input = 0;
		do {
			System.out.println("XYZ Library");
			System.out.println("==================\n");
			
			System.out.println("Members");
			System.out.println("=======");
			if(member.isEmpty()) {
				System.out.println("Empty");
			}else {
				for(int a=0; a<member.size(); a++) {
					member.get(a).view();
					member.get(a).view2();
				}
			}System.out.print("\n");
			
			System.out.println("Books");
			System.out.println("=====");
			if(buku.isEmpty()) {
				System.out.println("Empty");
			}else {
				for(int a=0; a<buku.size(); a++) {
					buku.get(a).lihat();
				}
			}System.out.print("\n");
			
			System.out.println("1. Add Book");
			System.out.println("2. Add Member");
			System.out.println("3. Borrow Book");
			System.out.println("4. Return Book");
			System.out.println("5. Exit");
			
			System.out.print("Input: ");
			input = sc.nextInt();sc.nextLine();
			
			if(input == 1) {
				int id1;
				String judul;
				do {
				System.out.print("Title [1-100]: ");
				judul = sc.nextLine();
				}while(judul.length() > 100);
				id1 = buku.size()+1;
				Book bku = new Book(judul, id1);
				buku.add(bku);
				System.out.println("Book added");sc.nextLine();
			}
			
			else if(input == 2) {
				String status, nama;
				int quota, id;
				do {
				System.out.print("Status [VIP/Regular]: ");
				status = sc.nextLine();
				}while(!status.endsWith("VIP") && !status.endsWith("Regular"));
				do {
				System.out.print("Name [1-100]: ");
				nama = sc.nextLine();
				}while(nama.length() > 100);
				if(status.endsWith("VIP")) {
					do {
					System.out.print("Quota [1-20]: ");
					quota = sc.nextInt();sc.nextLine();
					}while(quota > 20);
					id = member.size()+1;
					Member member1 = new VIP(nama, status, id, quota);
					member.add(member1);
				}else {
					id = member.size()+1;
					Member member1 = new Member(nama, status, id);
					member.add(member1);
				}
				System.out.println("Member added");sc.nextLine();
			}
			
			else if(input == 3) {
				int id1, id2;
				do {
					System.out.print("Member ID: ");
					id1 = sc.nextInt();sc.nextLine();
				}while(member.size()  < id1);
				do {
					System.out.print("Book ID: ");
					id2 = sc.nextInt();sc.nextLine();
				}while(buku.size() < id2);
				member.get(id1-1).borrow(buku.get(id2-1));sc.nextLine();
			}
			
			else if(input == 4) {
				int id1, id2;
				do {
					System.out.print("Member ID: ");
					id1 = sc.nextInt();sc.nextLine();
				}while(member.size() < id1);
				do {
					System.out.print("Book ID: ");
					id2 = sc.nextInt();sc.nextLine();
				}while(buku.size() < id2);
				member.get(id1-1).retur(buku.get(id2-1));sc.nextLine();
			}
			
		}while(input != 5);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
