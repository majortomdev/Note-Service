//created by JK 01/10/19
package com.optiim.noteservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.optiim.noteservice.note.Note;

@Repository
public interface NoteDAO extends MongoRepository<Note, Integer> {

}
