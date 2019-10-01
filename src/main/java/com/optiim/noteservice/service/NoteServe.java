package com.optiim.noteservice.service;

import java.util.Collection;

import com.optiim.noteservice.note.Note;

public interface NoteServe {
	
	public void createNote();
	
	
	public Collection <Note> findNotesByUser(String user);
	
	
	public void editNote(Note note); // takes in a Note object, then manipulat its content property
	
	
	
	public void addDate(Note note);
	
	
	public void addLOcation(Note note);
	
	
	

}
