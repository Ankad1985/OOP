package model;

import java.util.ArrayList;
import java.util.List;


public class RepositoryFile implements Repository{
    private NoteMapper mapper;
    private FileOperation fileOperation;

    public RepositoryFile(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
        this.mapper = new NoteMapper();
    }
    @Override
    public LinkedList<Note> getAllNotes() {
        List<String> lines = fileOperation.readAllLines();
        LinkedList<Note> notes = new LinkedList<>();
        for (String line : lines) {
            notes.add(mapper.map(line));
        }
        return notes;
    }

    @Override
    public int CreateNote(Note note) {

        LinkedList<Note> notes = getAllNotes();
        int max = 0;
        for (Note item : notes) {
            int id = item.getId();
            if (max < id){
                max = id;
            }
        }
        int newId = max + 1;
        note.setId(newId);
        notes.add(note);
        saveNotes(notes);
        return newId;
    }
    private void saveNotes(LinkedList<Note> notes) {
        List<String> lines = new ArrayList<>();
        for (Note item: notes) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
    }

    @Override
    public Note readNote(int userId) throws Exception {
        LinkedList<Note> notes = getAllNotes();
        return findNoteById(notes, userId);
    }

    private Note findNoteById(LinkedList<Note>notes, int userId) throws Exception {
        for (Note note : notes) {
            if (note.getId() == userId) {
                return note;
            }
        }
        throw new Exception("Note not found");
    }

    @Override
    public Note updateNote(Note note) throws Exception {
        LinkedList<Note> notes = getAllNotes();
        Note foundNote = findNoteById(notes, note.getId());
        foundNote.setHeader(note.getHeader());
        foundNote.setText(note.getText());
        saveNotes(notes);
        return foundNote;
    }
    @Override
    public void deleteNote(int id) throws Exception {
        LinkedList<Note> notes = getAllNotes();
        Note foundUser = findNoteById(notes, id);
        notes.remove(foundUser);
        int newId = 1;
        for (Note note : notes) {
            note.setId(newId++);
        }
        saveNotes(notes);
    }
}
