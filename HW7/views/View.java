package views;
import java.util.Scanner;

import controllers.Controller;
import model.Note;


public class View {
    private Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void run(){
        Commands com = Commands.NONE;

        while (true) {
            String command = prompt("Введите команду из следующего списка (NONE, READ, CREATE, UPDATE, DELETE, READ_ID, EXIT): ");
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
                        controller.saveNote(setNote(false));
                        break;
                    case READ:
                        System.out.println(controller.readNotes());
                        break;
                    case READ_ID:
                        int id = Integer.parseInt(prompt("Id записки: "));
                        Note note = controller.readNote(id);
                        System.out.println(note);
                        break;
                    case UPDATE: 
                        controller.updateNote(setNote(true));
                        break;
                    case DELETE:
                        int id_d = Integer.parseInt(prompt("Id записки: "));
                        controller.deleteNote(id_d);
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

    private Note setNote(boolean forUpdate) {
        String header = prompt("Заголовок: ");
        String text = prompt("Текст: ");
        if (forUpdate) {
            int id = Integer.parseInt(prompt("Id записки: "));
            return new Note(id, header, text);
        }
        return new Note(header, text);
    }
}
