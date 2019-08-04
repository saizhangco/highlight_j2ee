package demo.property;

public class MySystemProperty {

	public static void main(String[] args) {
		String value = System.getProperty("demo.property.name");
		System.out.println(value);
	}
}
