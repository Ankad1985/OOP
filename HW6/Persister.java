public interface Persister{
	public void saveToTxt(String fileName, User user);
	public void saveLinkedList(User user);
	public void reportToPrinter(User user);
}
