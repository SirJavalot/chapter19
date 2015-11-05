
import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {

	public static void main(String[] args) {
		Author a = new Author("D", "S");
		Author b = new Author("F","J");
		ArrayList<Author> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		Collections.sort(list);
		for (Author author : list) {
			System.out.println(author);
		}

	}

}


class Author implements Comparable<Author>{
	String firstName;
	String lastName;
	
	
	public Author(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

	@Override
	public String toString() {
		return firstName+" "+lastName;
	}


	@Override
	public int compareTo(Author other) {
		
		int last = this.lastName.compareTo(other.lastName);
		return (last==0)? this.firstName.compareTo(other.firstName) : last;
	}
	
}