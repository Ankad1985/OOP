package personal;
import java.util.Scanner;

import personal.controllers.UserController;
import personal.model.FileOperation;
import personal.model.FileOperationImpl;
import personal.model.Repository;
import personal.model.RepositoryFile;
import personal.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        Repository repository;
        FileOperation fileOperation;
        do{
            Scanner in = new Scanner(System.in);
            System.out.println("Выберите режим записи в файл (1 или 2): ");
            int mode = in.nextInt();
            if (mode == 1){
                fileOperation = new FileOperationImpl("users1.txt");
                repository = new RepositoryFile(fileOperation, mode);
                break;
            }
            else if (mode == 2){
                fileOperation = new FileOperationImpl("users2.txt");
                repository = new RepositoryFile(fileOperation, mode);
                break;
            }
            else{
                System.out.println("Некорректный ввод!");
            }
        } while (true);
        
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
