public class PersisterImpl implements Persister {
        private UsersLinkedList userList;

        public PersisterImpl() {
                userList = new UsersLinkedList();
        }

        public void saveToTxt(String fileName, User user) {
                FileOperationImpl file = new FileOperationImpl(fileName);
                file.save(user);
        }

        public void saveLinkedList(User user) {
                userList.add(user);
                System.out.printf("User %s was saved in list. Updated list:\n", user.getName());
                System.out.println(userList);
        }

        public void reportToPrinter(User user){
                System.out.println("Report to printer: " + user.getName());
        }
}
