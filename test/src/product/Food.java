package product;



public class Food extends Product{
	//food객체가 가지고있는 멤버변수 : 유통기한
	String expireDate;

	//생성자 오버로딩
	public Food(String name, int price, String expireDate) {
		super(name, price);
		this.expireDate = expireDate;
	}
	
	@Override
	public String toString() {
		String format = "%s] %,d원(유통기한 : %s)";
		Object[] args = {this.getName(),this.getPrice(),expireDate};
		return String.format(format, args);
	}
	
	

}
