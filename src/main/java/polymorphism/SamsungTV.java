package polymorphism;

public class SamsungTV implements TV, Speaker{
	
	private Speaker speaker;
//	private SonySpeaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("====> SamsungTV(1) 객체 생성");
	}
	
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("====> SamsungTV(2) 객체 생성");
		this.speaker = speaker;
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("====> SamsungTV(2) 객체 생성");
		this.speaker = speaker;
	}
	
	public SamsungTV(SonySpeaker speaker, int price) {
		System.out.println("====> SamsungTV(3) 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}

	public SamsungTV(Speaker speaker, int price) {
		System.out.println("====> SamsungTV(3) 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() 호출");
		this.speaker = speaker;
	}
	
	public void initMethod() {
		System.out.println("객체 초기화 작업 처리...");
	}
	
	public void setPrice(int price) {
		System.out.println("===> setPrice() 호출");
		this.price = price;
	}

	public void destoryMethod() {
		System.out.println("객체 삭제 전에 처리할 로직 처리...");
	}
	
	public void powerOn() {
		System.out.println("SamsungTv---전원을 켠다 (가격: " + price +")");
	}
	
	public void powerOff() {
		System.out.println("SamsungTv---전원을 끈다");
	}

	@Override
	public void volumeUp() {
//		System.out.println("SamsungTv---소리를 올린다.");
//		speaker = new SonySpeaker();
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
//		System.out.println("SamsungTv---소리를 내린다.");
//		speaker = new SonySpeaker();
		speaker.volumeDown();
	}
	
}
