import java.io.FileWriter;
import java.io.IOException;

public class FileOperationImpl implements FileOperation{
    private String fileName;

    public FileOperationImpl(String fileName) {
        this.fileName = fileName;
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void save(User user) {
        try (FileWriter writer = new FileWriter(fileName, true) ){
            writer.write(user.getName());
            writer.append('\n');
            writer.flush();
            System.out.printf("User %s was saved in %s\n", user.getName(), fileName);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
