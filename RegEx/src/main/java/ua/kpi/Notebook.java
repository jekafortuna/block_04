package ua.kpi;

import ua.kpi.entities.Note;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 11. November. 16.
 *
 * @author Evgeniy
 */
public class Notebook {
    List<Note> notes;

    public Notebook() {
        notes = new ArrayList<>();
    }

    public void addNote(Note note){
        notes.add(note);
    }

    public String getNotesList() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < notes.size(); i++) {
            sb.append(i + 1);
            sb.append(". ");
            sb.append(notes.get(i).getSimpleName());
            sb.append("\n");
        }
        return sb.toString();
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Note> notes) {
        this.notes = notes;
    }
}
