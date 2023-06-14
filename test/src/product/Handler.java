package product;

import java.util.Arrays;
import java.util.Comparator;

public class Handler {

	Product[] arr = new Product[10];
	
	
	public Product[] selectAll() {
		
		return arr;
	}


	public int add(Product tmp) {
		int row =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] ==null) {
				arr[i] = tmp;
				row =1;
				break;
			}
		}
		return row;
	}


	public Product[] search(String name) {
		Product[] ret = null;
		
		int count =0;
		for(int i =0; i<arr.length; i++) {
			Product p = arr[i];
			if( p != null && p.getName().contains(name));
				count++;
		}
		ret = new Product[count];
		count =0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] != null && arr[i].getName().contains(name)) {
				ret[count++] = arr[i];
			}
		}
		return ret;
	}


	public int delete(String name) {
		int row =0;
		for(int i =0; i<arr.length; i++) {
			if(arr[i] != null && arr[i].getName().equals(name)) {
				arr[i] = null;
				row += 1;
				
			}
		}
		return row;
	}


	public Product[] sort(int price) {
		
		Comparator<Product> priceComp = new Comparator<Product>() {
			
			@Override
			public int compare(Product a, Product b) {
				if( a != null & b !=null) {
					return b.getPrice()-a.getPrice();
				}
				return 0;	
			}
		};
		Arrays.sort(arr,priceComp);
		return arr;
	}



}
