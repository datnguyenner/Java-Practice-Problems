import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.junit.Test;
public class test {
	
	Product prod = new Product("James","xbox",1.2);
	ArrayList<Integer> num = new ArrayList<>();

	
	@Test
	public void testSort1(){
		num.add(5);
		num.add(-2);
		num.add(1203);
		num = prod.sort(num);
		assertThat(num.size(), is(3));
		assertThat(num.get(0), is(1203));
		assertThat(num.get(2), is(-2));
		
	}
	
	@Test
	public void testSort2(){
		num.add(0);
		num.add(-2);
		num.add(1203);
		num.add(12);
		num.add(122);

		num = prod.sort(num);
		assertThat(num.size(), is(5));
		assertThat(num.get(0), is(1203));
		assertThat(num.get(4), is(-2));
		assertThat(num.get(1), is(122));

		
	}

}
