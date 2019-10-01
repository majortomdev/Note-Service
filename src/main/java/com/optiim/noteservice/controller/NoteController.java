//created by JK 01/10/19
package com.optiim.noteservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.optiim.noteservice.note.Note;
import com.optiim.noteservice.service.NoteServe;

@RestController
@RequestMapping("/notes")
public class NoteController {

	@Autowired
	NoteServe serve;
	
//	@PostMapping(value="/create")
//	public String createNote
	
	
//	@RequestMapping(value="/{user}", method = RequestMethod.GET)
//	public Note getNotesByUser(@PathVariable("user"))
	
}
