package polymorphism;

public class AppleSpeaker implements Speaker{
	
	public AppleSpeaker() {
		// TODO Auto-generated constructor stub
		System.out.println("===> AppleSpeaker 객체 생성");
	}

	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker---소리를 올린다.");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker---소리를 내린다.");
		
	}
	
}
