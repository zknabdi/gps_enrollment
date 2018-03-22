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

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author znabd
 *
 */
@Entity
public class EPSCourse {
	@Id
	@NotEmpty
	@Column(unique=true)
	private String course_id;
	@NotEmpty
	private String course_name;
	private String course_depart;
	private String description; 
	@NotEmpty
	private String semester_offer;
	@ManyToMany(mappedBy="epsCourse")
	private List<EPSStudent> epsStudent;
	
	
	/**
	 * @param course_id
	 * @param course_name
	 * @param course_depart
	 * @param description
	 * @param semester_offer
	 * @param epsStudent
	 */
	public EPSCourse(String course_id, String course_name, String course_depart, String description,
			String semester_offer, List<EPSStudent> epsStudent) {
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_depart = course_depart;
		this.description = description;
		this.semester_offer = semester_offer;
		this.epsStudent = epsStudent;
	}


	/**
	 * @param course_id
	 * @param course_name
	 * @param course_depart
	 * @param description
	 * @param semester_offer
	 */
	public EPSCourse(String course_id, String course_name, String course_depart, String description,
			String semester_offer) {
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_depart = course_depart;
		this.description = description;
		this.semester_offer = semester_offer;
	}


	/**
	 * 
	 */
	public EPSCourse() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the course_id
	 */
	public String getCourse_id() {
		return course_id;
	}


	/**
	 * @param course_id the course_id to set
	 */
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}


	/**
	 * @return the course_name
	 */
	public String getCourse_name() {
		return course_name;
	}


	/**
	 * @param course_name the course_name to set
	 */
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}


	/**
	 * @return the course_depart
	 */
	public String getCourse_depart() {
		return course_depart;
	}


	/**
	 * @param course_depart the course_depart to set
	 */
	public void setCourse_depart(String course_depart) {
		this.course_depart = course_depart;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the semester_offer
	 */
	public String getSemester_offer() {
		return semester_offer;
	}


	/**
	 * @param semester_offer the semester_offer to set
	 */
	public void setSemester_offer(String semester_offer) {
		this.semester_offer = semester_offer;
	}


	/**
	 * @return the epsStudent
	 */
	public List<EPSStudent> getEpsStudent() {
		return epsStudent;
	}


	/**
	 * @param epsStudent the epsStudent to set
	 */
	public void setEpsStudent(List<EPSStudent> epsStudent) {
		this.epsStudent = epsStudent;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EPSCourse [course_id=" + course_id + ", course_name=" + course_name + ", course_depart=" + course_depart
				+ ", description=" + description + ", semester_offer=" + semester_offer + ", epsStudent=" + epsStudent
				+ "]";
	}
	

	
	
}
