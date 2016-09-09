import java.util.ArrayList;
import java.util.Collections;

public class Product implements Comparable<Product> {
	
	private String name;
	private String item;
	private double rating;
	
	public Product(String name, String item, Double rating){
		this.name = name;
		this.item = item;
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString(){
		return this.name + " " +this.item+" "+this.rating;
	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.item.compareTo(o.item);
	}
	
	public ArrayList<Integer> sort(ArrayList<Integer> num) {
		Collections.sort(num, Collections.reverseOrder());
		return num;
	}

}
