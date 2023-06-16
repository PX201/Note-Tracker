package com.note;

public class Note {
	private String noteTitle;
	private String note;

	public Note(String notTitle, String note) {
		this.noteTitle = notTitle;
		this.note = note;
	}

	public String getNoteTitle() {
		return noteTitle;
	}

	public void setNoteTitle(String noteTitle) {
		this.noteTitle = noteTitle;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Note [noteTitle=" + noteTitle + ", note=" + note + "]";
	}

}
