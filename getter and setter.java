package spring;

public class Book {
	int id;
	String author;
	String name;
	int price;
	
	public void setId(int id) {
	
	this.id=id;
	}
	public void setauthor(String author) {
		
		this.author=author;
		}

	public void setname(String name) {
		
		this.name=name;
		}

	public void setprice(int price) {
		
		this.price=price;
		}
	public int getId() {
		
		 return this.id;
		}
		public String getauthor() {
			
			return this.author;
			}

		public String getname() {
			
			return this.name;
			}

		public int getprice() {
			
			return this.price;
			}

}

package spring;

public class BookClient {

	public static void main(String[] args) {
		Book b=new Book();
		b.setId(101);
		b.setname("loveBirds");
		b.setauthor("ram");
		b.setprice(20000);
		System.out.println(b.getId()+","+b.getauthor()+","+b.getname()+","+b.getprice());
		
	}

}
