package product;

public class IndusProduct extends Product{
	private String madeIn;

	public IndusProduct(String name, int price, String madeIn) {
		super(name, price);
		this.madeIn = madeIn;
	}
	
	@Override
	public String toString() {
		String format = "%s] %,d원 (made in %s)";
		Object[] args = {this.getName(),this.getPrice(),madeIn};
		return String.format(format, args);
	}
	
	
	

}
