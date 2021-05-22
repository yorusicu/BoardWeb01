package polymorphism;

public class SamsungTV implements TV{
	
	public SamsungTV() {
		System.out.println("====> SamsungTV 객체 생성");
	}
	
	public void initMethod() {
		System.out.println("객체 초기화 작업 처리...");
	}
	
	public void destoryMethod() {
		System.out.println("객체 삭제 전에 처리할 로직 처리...");
	}
	
	public void powerOn() {
		System.out.println("SamsungTv---전원을 켠다");
	}
	
	public void powerOff() {
		System.out.println("SamsungTv---전원을 끈다");
	}

	@Override
	public void VolumeUp() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv---소리를 올린다.");
	}

	@Override
	public void VolumeDown() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv---소리를 내린다.");
	}
	
}
