public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		user.report();
		user.save();
		Tester tester = new Tester("Тест1");  // класс притянут для проверки взаимодействия логики с новыми классами
		tester.report();
		tester.save();
	}
}