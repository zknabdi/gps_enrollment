/**
 * 
 */
package edu.scsu.eps.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.scsu.eps.entities.EPSProgram;
import edu.scsu.eps.entities.EPSStudent;

/**
 * @author znabd
 * @About Program Repository
 *
 */
public interface EPSProgramRepost extends JpaRepository<EPSProgram, String>{

	//List<EPSProgram> findByStudent(EPSStudent epsStudent);



	
	 

}
