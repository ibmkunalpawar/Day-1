import java.util.List;
import java.util.LinkedList;
public class LinkedListDemo {
public static void main(String[] args) {
	List<String> names = new LinkedList<String>();
	for (int i = 0; i < 50; i++) {
		names.add("Ram" +i);
	}
	/*names.sort(new Comparator<String>() {
		@Override
		public int compare(String o1,String o2) {
			int value2 = Integer.valueOf(i)
		}*/
	
	System.out.println(names);
}
}