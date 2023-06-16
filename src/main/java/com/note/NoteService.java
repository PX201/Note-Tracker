package com.note;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class NoteService {
	private static final String FILE_PATH = "data.json";

	public void addNote(Note note) {
		if(note.getNoteTitle().isBlank() || note.getNote().isBlank())
			return;
		List<Note> notes = retreiveNotes();
		if(notes == null)
			notes = new ArrayList<>();
		notes.add(note);
		UpdateNotes(notes);
	}

	private void UpdateNotes(List<Note> notes) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH));) {
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			String json = gson.toJson(notes);
			writer.write(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Note> retreiveNotes() {
	    List<Note> notes = new ArrayList<>();
	    try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
	        Gson gson = new Gson();
	        notes = gson.fromJson(reader, new TypeToken<List<Note>>() {}.getType());
	        if (notes == null) {
	            notes = new ArrayList<>();
	        }
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e1) {
	        e1.printStackTrace();
	    }
	    return notes;
	}


	public void deleteNote(String noteTitle) {
		ArrayList<Note> notes = (ArrayList<Note>) retreiveNotes();
		notes.removeIf((note) -> note.getNoteTitle().equals( noteTitle));
		UpdateNotes(notes);
		
	}
}
