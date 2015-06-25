/* This program removes all occurrences of a specified character from a string
 */

import acm.program.*;

public class DeleteCharacters extends ConsoleProgram {
	public void run() {
		while (true) {
			String str = readLine("Enter a phrase: ");
			String getChar = readLine("Enter a letter you want to remove: ");
			char ch = getChar.charAt(0);
			int indexOfString = str.indexOf(ch);
			println(removeAllOccurrences (str, ch));
			if (indexOfString == -1) {
				println("Error: You did not enter a phrase. Try again!");
			}
		}
	}	
	/* Using Iterative approach
	
	private String removeAllOccurrences(String str, char ch) {
		String result = "";
		for (int i=0; i < str.length(); i++) {
			if (str.charAt(i) != ch) {
				result = result + str.charAt(i);
			}
		}
		return result;
	}
	/* Using "Replace" method in String Class
	
  private  String removechar(String str, char ch) {
	 return str.replace(String.valueOf(ch), "");
	 }
}



import static org.junit.Assert.*;

import org.junit.Test;


public class DeleteAllCharTest {

	@Test
	 public void deleteatStart() {
		assertEquals("b",DeleteAllCharTest.removeAllOccurrences("eebay", 'e'));
		assertEquals("b",DeleteAllCharTest.removechar("ppayal", 'p'));
	}
	
	@Test
	 public void deleteFromMiddle() {
		assertEquals("acd",DeleteAllCharTest.deleteCharIter("abcd", 'b'));
		assertEquals("acd",DeleteAllCharTest.deleteChar("abcd", 'b'));
	}
	
	@Test
	 public void deleteEnd() {
		assertEquals("abc",DeleteAllCharTest.deleteCharIter("ebayyy", 'y'));
		assertEquals("abc",DeleteAllCharTest.deleteChar("oracleeee", 'e'));
		
	}
	
	@Test
	 public void deleteNoExistentChar() {
		assertEquals("abc",DeleteAllCharTest.deleteCharIter("abc", 'd'));
		assertEquals("abc",DeleteAllCharTest.deleteChar("abc", 'd'));
	}
	
	@Test
	 public void deleteAllChars() {
		assertEquals("",DeleteAllCharTest.deleteCharIter("n", 'n'));
		assertEquals("",DeleteAllCharTest.deleteChar("z", 'z'));
		
		assertEquals("",DeleteAllCharTest.deleteCharIter("yyyyyyyyyyyy", 'y'));
	}
	
	@Test
	 public void deleteWithSpaces() {
		assertEquals("this is a test",DeleteAllCharTest.deleteCharIter("thisX isX aX testX", 'X'));
		assertEquals("this is a test",DeleteAllCharTest.deleteChar("thisX isX aX testX", 'X'));
		
	}

}
