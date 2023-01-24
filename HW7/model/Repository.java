package model;
public interface Repository {
    int CreateNote(Note note);
    LinkedList<Note> getAllNotes();
    Note updateNote(Note note) throws Exception;
    Note readNote(int noteId) throws Exception;
    void deleteNote(int id) throws Exception;
}
