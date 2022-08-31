import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.FileNotFoundException;
import java.io.File;

public class Test {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner reader = new Scanner(new File("data/testfile.txt"));
		//List<String> uniqueWords = new ArrayList<>();
Set <String> uniqueWords = new HashSet<>();
// array list is a type of a list

		int numWords = 0;
		while (reader.hasNext()) {
			String word = reader.next();

			if (!uniqueWords.contains(word)) {
			numWords++;
			uniqueWords.add(word);
			}
		}
		System.out.println(reader.next());	
	}

}
