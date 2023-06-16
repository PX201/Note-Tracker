package com.note;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class NoteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private NoteService service;
    public NoteController() {
    	service = new NoteService();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String noteTite = request.getParameter("noteTitle");
		service.deleteNote(noteTite);
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("note") != null){
			String noteTitle  = request.getParameter("noteTitle");
			String note = request.getParameter("note");
			
			Note myNote = new Note(noteTitle, note);
			service.addNote(myNote);
		}
		
		List<Note> notes = service.retreiveNotes();
		request.setAttribute("notes", notes);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
		
	
	}

}
