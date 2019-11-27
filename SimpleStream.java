import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.stream.*;

public class SimpleStream {

	public static void main(String args[]) throws FileNotFoundException, IOException {
		// in caso di upload esterno 	
		try (FileOutputStream fos = new FileOutputStream("file-esterno.txt");
				DataOutputStream dos = new DataOutputStream(fos);) {
			
		}
		//
		
		List<String> stringList = getStringList();
		Map<String, List<String>> map = stringList.stream()
				.collect(Collectors.groupingBy(snake -> ("" + snake.charAt(0)).toLowerCase()));
		map.entrySet().stream().forEach(System.out::println);
	}

	public static List<String> getStringList() {
		String stringa = "join " + "die";
		String[] stringhe = stringa.split(" ");
		return Arrays.asList(stringhe);
	}
}