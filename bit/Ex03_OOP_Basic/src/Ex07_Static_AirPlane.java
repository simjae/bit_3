import kr.or.bit.AirPlane;

public class Ex07_Static_AirPlane {

	public static void main(String[] args) {
		// AirPlane air  = new AirPlane();
				
		AirPlane air = new AirPlane(707, "�����װ�");
		air.airPlaneTotalCount();
		
		AirPlane air2 = new AirPlane(808, "�ƽþƳ�");
		air2.airPlaneTotalCount();
		
		AirPlane air3 = new AirPlane(909, "�λ��װ�");
		air3.airPlaneTotalCount();
		
		
	}

}
