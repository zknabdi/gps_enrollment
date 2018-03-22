/**
 * 
 */
package edu.scsu.eps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.scsu.eps.entities.EPSStudent;

/**
 * @author znabd
 * @About Student Repository 
 *
 */
public interface EPSStudentRepost extends JpaRepository<EPSStudent, String>{


}
