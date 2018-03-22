package edu.scsu.eps;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import edu.scsu.eps.entities.EPSCourse;
import edu.scsu.eps.entities.EPSProgram;
import edu.scsu.eps.entities.EPSStudent;
import edu.scsu.eps.services.EPSCourseService;
import edu.scsu.eps.services.EPSProgramService;
import edu.scsu.eps.services.EPSStudentService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GpsEnrollmentPredictionSystemApplicationTests {

	
	
	@Autowired
	private EPSStudentService studentService;
	
	@Autowired
	private EPSCourseService courseService;
	
	@Autowired
	private EPSProgramService programService;
	
	@Before
	public void initDb() {
		{
			// creating a new student for testing purpose
			EPSCourse course = new EPSCourse("CSCI201", "Computer Architecture", "Computer Engienering", "n_a", "Spring_18");
			
			EPSStudent student = new EPSStudent("13454545", "John", "Bodin", "jb@stcloudstate.edu");
	
			studentService.createStudent(student);
		}
		{
			// creating a new student for testing purpose
			EPSProgram program = new EPSProgram("BS105", "BIO MEDICAL", "BS");
			
			EPSStudent student = studentService.findOne("13454545");
			programService.addStudent(program, student);
	
			studentService.createStudent(student);
		}
		
	}//end initDB
	
	@Test
	public void testStudent() {
		// find student assigned to Program
		EPSStudent student = studentService.findOne("13454545");
		assertNotNull(student);
		
		
	}
	
	
	/*@Test
	public void testProgram() {
		// find student assigned to Program
		EPSStudent student = studentService.findOne("13454545");
		List<EPSProgram> program = programService.findStudentProgram(student);
		assertNotNull(student);
		
		
	}
	*/
	

}
