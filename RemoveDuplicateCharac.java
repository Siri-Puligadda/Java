import java.util.Scanner;

public class RemoveDuplicateCharac {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String str2 = "";
	      char[] carray = str.toCharArray();
	      System.out.println("The string is:" + str);
	      for (int i = 0; i < str.length(); i++) {
	         for (int j = i + 1; j < str.length(); j++) {
	            if (carray[i] == carray[j]) {
	            	String x = Character.toString(carray[i]);
	            	str2 = str.replaceAll(x, "");
	            	x = "";
	            	str = str2.replaceAll("\\s", "");
	               break;
	            }
	         }
	      }
	      char[] arr = str2.toCharArray();
	      for (char e : arr)
	        System.out.print(e + " "); 
	}
}
