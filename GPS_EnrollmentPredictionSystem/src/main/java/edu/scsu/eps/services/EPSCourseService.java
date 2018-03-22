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
import edu.scsu.eps.repositories.EPSCourserRepost;

/**
 * @author znabd
 *
 */
@Service
public class EPSCourseService {

	@Autowired
	private EPSCourserRepost epsCourserRepost;

	// Create course registered by student
		public void createCourse(EPSCourse epsCourse) {
		/*epsCourse = new EPSCourse();
		List<EPSCourse> course = new ArrayList<>();
		epsCourse.add(epsCourse);
		epsStudent.setEpsCourse(course);
		epsStudentRepost.save(epsStudent);
		*/	
			
		}
	
	public EPSCourse findCourse(String course_id) {
		return epsCourserRepost.findOne(course_id);
	}
	public boolean isCourseExist(String course_id) {

		EPSCourse course = epsCourserRepost.findOne(course_id);
		if(course!=null)
			return true;
		
		return false;
	}
	

	
}
