package com.aniketjain.notes_light.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.aniketjain.notes_light.dao.NotesDao;
import com.aniketjain.notes_light.model.Notes;

@Database(entities = {Notes.class}, version = 1)
public abstract class NotesDatabase extends RoomDatabase {

    public abstract NotesDao notesDao();

    public static NotesDatabase INSTANCE;

    public static NotesDatabase getDatabaseInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(
                    context.getApplicationContext(),
                    NotesDatabase.class,
                    "Notes_Database"
            ).build();
        }
        return INSTANCE;
    }

}
