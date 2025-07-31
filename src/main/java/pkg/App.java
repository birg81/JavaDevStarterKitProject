package pkg;
public class App {
	public static void main(String[] args) {
		var name = "Biagio";
		var s = """
			I'm %s
		""".formatted(name).strip();
		System.out.println(s);
	}
}