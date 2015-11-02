import java.util.ArrayList;
import java.util.Date;


public class Test {

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<>();
		list.add(5.2);
		list.add(3.3);
		
		ArrayList<Date> dates = new ArrayList<>();
		dates.add(new Date());
		Date date = dates.get(0);
		System.out.println(date);
		
	}

}
