import java.util.HashMap;
class Student{
int kor;
int math;
int eng;
String name;




public Student(int kor, int math, int eng, String name) {
	super();
	this.kor = kor;
	this.math = math;
	this.eng = eng;
	this.name = name;
}




public  class Ex14_HashMap {
/*HashMap<K, V>
		hashMap<String, String>
		hashMap<Integer, String>
		hashMap<String, Student>
			>> Put< "kim",new Student>
*/
	public static void main(String[] args) {
	HashMap<String,Student> sts = new HashMap<String, Student>();
	sts.put("kim", new Student(100,99,98,"È«±æµ¿"));
	sts.put("kim", new Student(100,99,98,"È«±æµ¿"));
	
	
//tip
	//Map¾È¿¡ key, value >> key + "=" + value>> 
	sts.entrySet();
	Iterable it = set
	
		
	}

}
}
