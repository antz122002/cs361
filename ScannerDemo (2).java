
/**
 * @author scharffc
 * 
 */
public class ScannerDemo {

	// Oh! This needs to be changed !
	private static String file1 = "C:\\Users\\antho\\OneDrive\\Desktop\\Scanner Passer\\prog1 (2).kay";
	private static int counter = 1;

	public static void main(String args[]) {
		TokenStream ts = new TokenStream(file1);
		System.out.println(file1);
		while (!ts.isEndofFile()) {
			// TODO TO BE COMPLETED
			// tk is not defined on the line below
			Token tk = ts.nextToken();
			System.out.println("Token " + counter++ + " - Type: " + tk.getType() + " - Value: " + tk.getValue());
		}
	}
}
