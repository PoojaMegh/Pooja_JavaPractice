package pooja.technocredits;

public class StringEx2 {

	public static void main(String[] args) {
		String str = "Hi hello Techno credits Techno APR23 Java Techno Selenium";
		//str = str.replaceFirst("Techno", "India");
		//str.replaceAll("Techno", "");
		//str.replace("A", "").replace("B", "");
		//System.out.println(str);
		
		str = str.toUpperCase();
		System.out.println(str);
		str = str.toLowerCase();
		System.out.println(str);
		
		str = "TechnoCredits";
		// T -> 1
		// t -> 1
		// C -> 2
		str = str.toUpperCase();
		System.out.println(str);
		str.equalsIgnoreCase(str);
		
		int index = str.lastIndexOf('a');
		System.out.println(index);
	}
}
