import java.util.HashSet;
import java.util.Iterator;

class Myclass {
	private int id;
	private String name;
	
	public Myclass() {}
	public Myclass(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void displayInfo() {
		System.out.println("�й� : " + this.id);
		System.out.println("�̸� : " + this.name);
	} 
	
	public static void display(Myclass c) {
		c.displayInfo();
	}
	@Override
	public String toString() {
		return "Myclass [�й�=" + id + ", �̸�=" + name + "]";
	}
	
}
public class Ex10_Set_Object {

	public static void main(String[] args) {
		HashSet<Myclass> hset = new HashSet<Myclass>();
		Myclass mc1 = new Myclass(1,"Abc");
		Myclass mc2 = new Myclass(2,"Def");
		Myclass mc3 = new Myclass(3,"Asdf");
		
		
		hset.add(mc1);
		hset.add(mc2);
		hset.add(mc3);
		for(Myclass m : hset) {
			m.displayInfo();
		}
		Iterator<Myclass> myclass = hset.iterator();
		while (myclass.hasNext());
		System.out.println(myclass.toString());
			
			
		}
	}


