
package controllers;
import model.LinkedList;
import model.Note;
import model.Repository;

public class Controller {
    private final Repository repository;
    public Controller(Repository repository) {
        this.repository = repository;
    }
    public void saveNote(Note note) throws Exception {
        validate(note);
        repository.CreateNote(note);
    }

    public Note readNote(int noteId) throws Exception{
        return repository.readNote(noteId);
    }
    public LinkedList<Note> readNotes(){
        return repository.getAllNotes();
    }
    public Note updateNote(Note note) throws Exception {
        validate(note);
        return repository.updateNote(note);
    }
    public void deleteNote(int id) throws Exception{
        repository.deleteNote(id);
    }

    private void validate(Note note) throws Exception {
        if(note.getHeader().isEmpty())
        {
            throw new Exception("No header!");
        }
        if(note.getText().isEmpty())
        {
            throw new Exception("No text!");
        }
    }

}
