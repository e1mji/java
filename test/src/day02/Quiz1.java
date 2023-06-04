//package day02;
//
////고민하다가  실패한 코드 (지우지 말고 다듬어나가자 ! )
///*
// * 문자를 주고받는 객체
//	(A의 휴대폰) (B의 휴대폰) 문자메시지  A폰에서 보내는기능을 호출하면 
//	B폰에서 받는기능을 호출할 수 있어야된다.
// */
//class Message{
//	String text;
//	
//	Message(String text){
//		this.text = text;
//	}
//}
//
//class Hotline{
//	//필드
//	private Message message = null;
//	private String name = null;
//	
//	// 생성자
//	public Hotline(String name) {
//		this.name = name;
//	}
//	public void setMsg(Message message) {
//		this.message = message;
//	}
//	public Message getMessage() {
//		return message;
//	}
//	public String getName() {
//		return name;
//	}
//	
//	//짱구폰에서   철수폰으로  보내는 메서드 
//	void send(Phone other, String text) {
//		other. = msg;
//		msg = null;
//		System.out.printf( "%s님의 문자메세지 : %s",name,msg.text);
//	}
//	
//	//	받는 메서드 			짱구			"철수야 잘지내?"
//	void receive(Phone sender, Msg msg) {
//
//	}
//	
//	public boolean hasMsg() {
//		return msg != null;
//	}
//	
//}
//
//public class Quiz1 {
//	public static void main(String[] args) {
//		Phone p1 = new Phone("신짱구");
//		Phone p2 = new Phone("철수");
//		Msg msg = new Msg();
//		
//	p1.send(p2, msg);
//	System.out.println(p1.getName() + "님이 문자를 보냈습니다:" + p2.hasMsg());
//	}
//
//}
