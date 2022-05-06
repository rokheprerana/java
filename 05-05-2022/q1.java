
public class q1 {

	public static void main(String[] args) {
            String string = "MOM AND DAD ARE MY BEST FRIENDS";
			String word = "MOM";
			String temp[] = string.split(" ");
			int count = 0;
			for (int i = 0; i < temp.length; i++) {
			if (word.equals(temp[i]))
			count++;
			}
			System.out.println("The string is: " + string);
			System.out.println("The word " + word + " occurs " + count + " times in the above string");
			}
			

	}

