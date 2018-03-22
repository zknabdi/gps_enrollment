/**
 * 
 */
package edu.scsu.eps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.scsu.eps.entities.EPSCourse;

/**
 * @author Course Repositories
 *
 */
public interface EPSCourserRepost extends JpaRepository<EPSCourse, String>{

}
