/**
 * 
 */
package edu.scsu.eps.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author znabd
 *
 */
@Entity
public class EPSStudent {

	@Id
	@Column(unique=true)
	private String techID;
	@NotEmpty
	private String firstName;
	@NotEmpty
	private String LastName;
	@Email
	@NotEmpty
	private String email;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="COURSE_STUDENT", joinColumns= {
			@JoinColumn(name="STUDENT_NUM", referencedColumnName="techID")
	},inverseJoinColumns= {
			@JoinColumn(name="COURSE_NUM", referencedColumnName="course_id")
	})
	private List<EPSCourse> epsCourse;
	
	@OneToMany(mappedBy="epsStudent", cascade =CascadeType.ALL)
	private List<EPSProgram> epsProgram;

	/**
	 * @param techID
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param epsCourse
	 * @param epsProgram
	 */
	public EPSStudent(String techID, String firstName, String lastName, String email, List<EPSCourse> epsCourse,
			List<EPSProgram> epsProgram) {
		this.techID = techID;
		this.firstName = firstName;
		LastName = lastName;
		this.email = email;
		this.epsCourse = epsCourse;
		this.epsProgram = epsProgram;
	}

	
	/**
	 * @param techID
	 * @param firstName
	 * @param lastName
	 * @param email
	 */
	public EPSStudent(String techID, String firstName, String lastName, String email) {
		this.techID = techID;
		this.firstName = firstName;
		LastName = lastName;
		this.email = email;
	}




	/**
	 * 
	 */
	public EPSStudent() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the techID
	 */
	public String getTechID() {
		return techID;
	}

	/**
	 * @param techID the techID to set
	 */
	public void setTechID(String techID) {
		this.techID = techID;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the epsCourse
	 */
	public List<EPSCourse> getEpsCourse() {
		return epsCourse;
	}

	/**
	 * @param epsCourse the epsCourse to set
	 */
	public void setEpsCourse(List<EPSCourse> epsCourse) {
		this.epsCourse = epsCourse;
	}

	/**
	 * @return the epsProgram
	 */
	public List<EPSProgram> getEpsProgram() {
		return epsProgram;
	}

	/**
	 * @param epsProgram the epsProgram to set
	 */
	public void setEpsProgram(List<EPSProgram> epsProgram) {
		this.epsProgram = epsProgram;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EPSStudent [techID=" + techID + ", firstName=" + firstName + ", LastName=" + LastName + ", email="
				+ email + ", epsCourse=" + epsCourse + ", epsProgram=" + epsProgram + "]";
	}
	

	

}
