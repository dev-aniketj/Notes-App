package com.aniketjain.notes_light.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.aniketjain.notes_light.model.Notes;
import com.aniketjain.notes_light.repository.NotesRepository;

import java.util.List;

public class NotesViewModel extends AndroidViewModel {

    public NotesRepository repository;
    public LiveData<List<Notes>> getAllNotes;

    public NotesViewModel(@NonNull Application application) {
        super(application);

        repository = new NotesRepository(application);
        getAllNotes = repository.getAllNotes;


    }

    void insertNote(Notes notes) {
        repository.insertNotes(notes);
    }

    void deleteNote(int id) {
        repository.deleteNotes(id);
    }

    void updateNote(Notes notes) {
        repository.updateNotes(notes);
    }
}
