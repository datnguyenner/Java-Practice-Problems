import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AverageRating {
	

	  public static void main (String[] args)
	  {
		  Product xbox = new Product("James", "xbox", 4.1);
		  Product wii = new Product("Bob", "wii", 4.1);
		  Product laptop = new Product("James", "laptop", 3.1);
		  Product wii2 = new Product("Jon", "wii", 4.3);
		  Product xbox2 = new Product("Joe", "xbox", 3.5);
		  Product xbox3 = new Product("Cam", "xbox", 4.3);
		  Product toy = new Product("Bill", "toy", 2.0);
		  Product xbox4 = new Product("Carr", "xbox", 2.2);
		  Product light = new Product("Smith", "light", 3.7);

		  Product lamp = new Product("Cat", "lamp", 2.9);

		  Product[] products = {xbox,wii,laptop,wii2,xbox2,xbox3,toy,xbox4,light,lamp};
		  
		  Map<String, ArrayList<Double>> ratingMap = new HashMap<>();
		  for(int i = 0; i < products.length;i++){
			  String productName = products[i].getItem();
			  if(ratingMap.containsKey(productName)){
				 ArrayList<Double> ratingArrayList = ratingMap.get(productName);
				 ratingArrayList.add(products[i].getRating());
				 ratingMap.put(productName, ratingArrayList);
			  }else{
				 ArrayList<Double> ratingArrayList = new ArrayList<Double>();
				 ratingArrayList.add(products[i].getRating());
				 ratingMap.put(productName, ratingArrayList);

			  }
		  }
		  
		  TreeMap<Double, String> avgRatingMap = new TreeMap<>();
		  for(Map.Entry<String, ArrayList<Double>> entry : ratingMap.entrySet()){
			  Double averageProductRating = 0.0;
			  for(Double value: entry.getValue()){
				  averageProductRating+=value;
			  }
			  averageProductRating/=entry.getValue().size();
			  avgRatingMap.put(averageProductRating, entry.getKey());			  
		  }

		  
		  System.out.println(ratingMap);
		  System.out.println(avgRatingMap.descendingMap());
		  
		  List<Product> prods = new ArrayList<Product>(Arrays.asList(products));
		  
		  Collections.sort(prods, new Comparator<Product>(){
			  @Override
			  public int compare(Product one, Product two){
				  
				  return (one.getName().compareTo(two.getName()));
				  
			  }
		  });
		  
		  
		  System.out.println("Sort with Name: "+prods);
		  
		  Collections.sort(prods, new Comparator<Product>(){
			  @Override
			  public int compare(Product one, Product two){
				  
				  return (one.getRating() > two.getRating() ? -1: one.getRating() < two.getRating()? 1:0);
				  
			  }
		  });

		  System.out.println("Sort with Rating: "+prods);
		  
		  Collections.sort(prods);
		  System.out.println("Sort with Item using Comparable: "+prods);



	  }	

}
