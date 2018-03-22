/**
 * 
 */
package edu.scsu.eps.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.scsu.eps.entities.EPSProgram;
import edu.scsu.eps.entities.EPSStudent;
import edu.scsu.eps.repositories.EPSProgramRepost;

/**
 * @author znabd
 *
 */
@Service
public class EPSProgramService {

	@Autowired
	private EPSProgramRepost epsProgramRepost;
	
	public void addStudent(EPSProgram program, EPSStudent epsStudent) {
		program.setEpsStudent(epsStudent);
		epsProgramRepost.save(program);
	}

/*
	public List<EPSProgram>findStudentProgram(EPSStudent epsStudent){
		return epsProgramRepost.findByStudent(epsStudent);
	}*/
	
}
