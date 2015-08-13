import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class expression {
	static String stringToMatch = "your input";
	static Pattern p = Pattern.compile("(\\w)\\1+");
	static Matcher m = p.matcher(stringToMatch);
	public static void main(String [] args){
		if (m.find()){
			System.out.println("The duplicate character that you made me find for you because you are to lazy to find it yourself is '" + m.group(1) + "'.");
		}
		else{
			System.out.println("There are no duplicate characters in the text you gave me.");
		}
	}
}
