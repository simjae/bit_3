import java.util.HashMap;
import java.util.Scanner;

public class Ex13_HashMap {

	public static void main(String[] args) {
	/*
	 일상생활
	 지역번호 , 우편번호, 회원가입(id, pwd)정보
	 */
		HashMap loginmap = new HashMap();
		loginmap.put("kim","kim1004");
		loginmap.put("scott","tiger");
		loginmap.put("lee","kim1004");
		//우리 시스템 회원가입한회원 ID, PWD정보 
		//로그인
		//ID(o) ,pwd(o) >>회원(방가)
		//ID(o) ,pwd(o) >>회원(방가)
		//ID(x) ,pwd(o) 
		//ID(x) ,pwd(x) 
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("id, pwd  입력해주세요");
			String id  = sc.nextLine().trim();
		
			if(!loginmap.containsKey(id) ) {
				System.out.println("회원님 ID가 맞지 않습니다. 다시 입력해주세요" );
				break;
			}else(loginmap.containsKey(pwd)){
				
			}
	
				
				
			}
				//입력한 아이디랑 같다면 
			}
			
	}
	
		
		
		
	


