/**
 * 
 */
package edu.scsu.eps.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.scsu.eps.entities.EPSCourse;
import edu.scsu.eps.entities.EPSStudent;
import edu.scsu.eps.repositories.EPSStudentRepost;

/**
 * @author znabd
 *
 */
@Service
public class EPSStudentService {

	@Autowired
	private EPSStudentRepost epsStudentRepost;
	
	
	// count the number of course registered by student
	public void createStudent(EPSStudent epsStudent) {
		EPSCourse epsCourse = new EPSCourse();
		List<EPSCourse> course = new ArrayList<>();
		course.add(epsCourse);
		epsStudent.setEpsCourse(course);
		epsStudentRepost.save(epsStudent);
		
		
	}
	
	
	public EPSStudent findOne(String techID) {
		
		return epsStudentRepost.findOne(techID);
	}

}
