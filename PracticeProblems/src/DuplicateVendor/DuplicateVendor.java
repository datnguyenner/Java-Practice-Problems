package DuplicateVendor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateVendor {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		String numberOfInputs = scan.nextLine();
//		Map<String, ArrayList<String>> vendorItemMap = new HashMap<>();
//		Map<String, Integer> itemCount = new HashMap<>();
//
//		for(int i = 0; i < Integer.parseInt(numberOfInputs); i++){
//			String vendorItem = scan.nextLine();
//			String[] keyValue = vendorItem.split(",");
//			if(itemCount.containsKey(keyValue[1])){
//				itemCount.put(keyValue[1], itemCount.get(keyValue[1])+1);
//			}else{
//				itemCount.put(keyValue[1], 1);
//			}
//			
//			if(vendorItemMap.containsKey(keyValue[0])){
//				ArrayList<String> items = vendorItemMap.get(keyValue[0]);
//				items.add(keyValue[1]);
//				vendorItemMap.put(keyValue[0], items);
//			}else{
//				ArrayList<String> items = new ArrayList<>();
//				items.add(keyValue[1]);
//				vendorItemMap.put(keyValue[0], items);
//			}
//		}
//		
//		System.out.println(vendorItemMap);
//		System.out.println(itemCount);
		
		String[] itemVendor = {"Vendor1,ItemA","Vendor1,ItemB","Vendor1,ItemC","Vendor1,ItemD","Vendor2,ItemA","Vendor2,ItemE","Vendor3,ItemA","Vendor3,ItemD"};
        System.out.println(Arrays.toString(findVendorsWithMaxDuplicates(itemVendor)));

	}
	
	static String[] findVendorsWithMaxDuplicates(String[] itemVendor){
		Map<String, ArrayList<String>> vendorItemMap = new HashMap<>();
		Set<String> vendorWithDup = new HashSet<>();
		Set<String> allItems= new HashSet<>();


		if(itemVendor.length>0){
			for(int i = 0; i < itemVendor.length; i++){
				String vendorItem = itemVendor[i];
				String[] keyValue = vendorItem.split(",");
				if(!allItems.add(keyValue[1])){
					vendorWithDup.add(keyValue[1]);
				}			
				if(vendorItemMap.containsKey(keyValue[0])){
					ArrayList<String> items = vendorItemMap.get(keyValue[0]);
					items.add(keyValue[1]);
					vendorItemMap.put(keyValue[0], items);
				}else{
					ArrayList<String> items = new ArrayList<>();
					items.add(keyValue[1]);
					vendorItemMap.put(keyValue[0], items);
				}
			}
			if(vendorWithDup.size()==0){
				return new String[0];					
			}
			
			Map<String, Integer> vendorWithDubMap = new HashMap<>();
			int max = 0;
			for(Entry<String, ArrayList<String>> entry: vendorItemMap.entrySet()){
				int count = 0;
				for(String item: entry.getValue()){
					if(vendorWithDup.contains(item)){
						count++;
					}
				}
				vendorWithDubMap.put(entry.getKey(), count);
				if(count>max){
					max = count;
				}
			}			
			ArrayList<String> vendorWithMostDup = new ArrayList<>();			
			for(Entry<String, Integer> entry: vendorWithDubMap.entrySet()){
				if(entry.getValue()==max){
					vendorWithMostDup.add(entry.getKey());
				}
			}		
			return vendorWithMostDup.toArray(new String[vendorWithMostDup.size()]);					
		}else{
			return new String[0];					
		}
		
	}
}
