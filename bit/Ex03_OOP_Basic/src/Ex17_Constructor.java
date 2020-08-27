/*
자동차 영업소 입니다.
영업사원은 고객에게 자동차를 팔려고 합니다.
고객은 자동차의 기본 사양을 살 수 도 있고 ....  여러가지 선택 옵션을 선택 할 수 있습니다.
자동차의 기본은
문의 개수 4개 , 자동차의 색상 기본은 red  4개가 기본 입니다
그런데 고객은
문의 개수만 변경 가능하고  자동차의 색상 기본은 red  으로 할 수 있고
문의 개수는 기본으로 하고 자동차의 색상 변경 가능하고
문의 개수와 자동차의 색상 모든 변경 하여 차를 구매할 수 있습니다

자동차 구매
1. 기본 사양  
2. 옵션 : 문 변경 , 자동차의 색상 기본
3. 옵션 : 자동차의 색상 변경 , 문 기본
4. 옵션 : 자동차의 색상 변경 , 휠 변경



*/
class Car5{
	int door;
	String color;
	
	public Car5() {
		 door  = 4;
		 color = "red";
	}
	
	public Car5(int d) {
		 door = d;
		 color = "red";
	}
	
	public Car5(String s) {
		 color=s;
		 door=4;
	}
	
	public Car5(int d , String s) {
		door = d;
		color = s;
	}

	public void carInfo() {
		System.out.println("door : " + door + " , " + "color : " + color);
	}
}

public class Ex17_Constructor {
	public static void main(String[] args) {
		 Car5 c5 = new Car5();
		 c5.carInfo();

		 Car5 c6 = new Car5(10);
		 c6.carInfo();
		 
		 Car5 c7 = new Car5("blue");
		 c7.carInfo();
		 
		 Car5 c8 = new Car5(15,"pink");
		 c8.carInfo();
		 
	}

}






