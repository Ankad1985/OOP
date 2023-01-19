package personal.views;

import personal.controllers.UserController;
import personal.model.User;

import java.util.Scanner;

public class ViewUser {

    private UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run(){
        Commands com = Commands.NONE;

        while (true) {
            String command = prompt("Введите команду из следующего списка (READ, CREATE, UPDATE, LIST, DELETE, EXIT): ");
            try{
            com = Commands.valueOf(command);
            }
            catch (Exception e){
                System.out.println("Неопознанная команда!");
            }
            try {
                if (com == Commands.EXIT) return;
                switch (com) {
                    
                    case CREATE:
                        userController.saveUser(setUser(false));
                        break;
                    case READ:
                        String id = prompt("Идентификатор пользователя: ");
                        User user = userController.readUser(id);
                        System.out.println(user);
                        break;
                    case LIST:
                        for (User oneUser: userController.readUserList()) {
                            System.out.println(oneUser);
                            System.out.println();
                        }
                        break;
                    case UPDATE: 
                        userController.updateUser(setUser(true));
                        break;
                    case DELETE:
                        String id_del = prompt("Идентификатор пользователя: ");
                        userController.deleteUser(id_del);
                    break;
                    
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private User setUser(boolean forUpdate) {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        if (forUpdate) {
            String id = prompt("Идентификатор пользователя: ");
            return (new User(id, firstName, lastName, phone));
        }
        return (new User(firstName, lastName, phone));
    }
}
