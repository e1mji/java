package day02;

/*
 * 문자를 주고받는 객체
	(A의 휴대폰) (B의 휴대폰) 문자메시지  A폰에서 보내는기능을 호출하면 
	B폰에서 받는기능을 호출할 수 있어야된다.
 */
class Phone{
	// 폰이 가지고있는속성 (멤버변수)
	// 전화번호 , 문자가 전송됐나요?
	private String phoneNumber;
	private boolean isMessageReceived;
	
	//생성자 오버로딩
	public Phone(String phoneNumber){
		this.phoneNumber = phoneNumber; //매개변수로 휴대폰 넘버만 초기화
 		this.isMessageReceived = false; // 문자를 안보냈기때문에 false
	}
	
	
	//문자를 보내는 메서드 , 휴대폰 p1 or p2 , 문자메세지(문자열)
	public void send(Phone recip, String message) {
		
		//메세지 객체 생성 (  발신자 (p1=sender), 수신자p2 ,메세지내용(문자열) )
		Msg msg = new Msg(this, recip, message);
		//이 메세지 객체를 수신자에게 전달.
		recip.recieve(msg);
	}
	
	
	// 문자를 받는 메서드 (메시지 출력)
	// 누구로부터 문자가 왔습니다. 문자를 받았습니까? 
	public void recieve(Msg msg) {
		System.out.println("문자를 받았습니다 from "
					+ msg.getSender().getPhoneNumber() + " : " 
					+ msg.getContent());
		this.isMessageReceived = true;
	}
	
	//접근제한자로 막혀있기때문에 getter
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	//문자를 받았는지 확인하는 메서드
	public boolean isMessageRecieved() {
		return isMessageReceived;
	}
	
	
	
}

//문자 메시지 전송 
//휴대폰은 전송만 하기위함이고 메세지가 필요한것을 가지고있는다.
class Msg{
	
	//메세지가 가지고 있는 속성 즉 , 멤버변수 : 보내는사람,받는사람, 내용 
	private Phone sender;
	private Phone recip;
	private String content;
	
	
	//생성자 오버로딩 
	public Msg(Phone sender, Phone recip, String content) {
		this.sender = sender;
		this.recip = recip;
		this.content = content;
	}
	
	
	//다른 클래스에서 쓸수있게 getter 사용 
	public Phone getSender() {
		return sender;
	}
	
	public Phone getRecip() {
		return recip;
	}
	
	public String getContent() {
		return content;
	}
	
}

public class Quiz3 {
	public static void main(String[] args) {
	//p1과 p2의 객체 생성 
	//p1  짱구의 휴대폰
	//p2.철수의 휴대폰
	Phone p1 = new Phone("010-1234-5678");
	Phone p2 = new Phone("010-2416-1534");
	
	//문자 메시지 전송
	p1.send(p2, "철수야 놀자");
	System.out.println("received by"+p1.getPhoneNumber()+p1.isMessageRecieved());
	System.out.println();
	
	p2.send(p1, "그래 놀이터로 나와~");
	System.out.println("received by"+p2.getPhoneNumber()+p2.isMessageRecieved());
	//철수가 받았는지 확인


	
	
	}

}
