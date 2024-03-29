package com.aniketjain.notes_light.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.aniketjain.notes_light.dao.NotesDao;
import com.aniketjain.notes_light.database.NotesDatabase;
import com.aniketjain.notes_light.model.Notes;

import java.util.List;

public class NotesRepository {

    public NotesDao notesDao;
    public LiveData<List<Notes>> getAllNotes;

    // Constructor
    public NotesRepository(Application application) {
        NotesDatabase database = NotesDatabase.getDatabaseInstance(application);
        notesDao = database.notesDao();
        getAllNotes = notesDao.getAllNotes();
    }

    public void insertNotes(Notes notes) {
        notesDao.insertNotes(notes);
    }

    public void deleteNotes(int id) {
        notesDao.deleteNotes(id);
    }

    public void updateNotes(Notes notes) {
        notesDao.updateNotes(notes);
    }

}
