public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		PersisterImpl persister = new PersisterImpl();
		persister.saveToTxt("users.txt", user);
		persister.saveLinkedList(user);
		persister.saveLinkedList(new User("Tom"));
		persister.saveToTxt("users.txt", new User("Tom"));
		persister.reportToPrinter(user);

	}
}
