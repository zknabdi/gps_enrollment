/**
 * 
 */
package edu.scsu.eps.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author znabd
 *
 */
@Entity
public class EPSProgram {
	@Id
	@NotEmpty
	@Column(unique=true)
	private String program_code;
	@NotEmpty
	private String program_name;
	private String program_type;
	@ManyToOne
	@JoinColumn(name="STUDENT_NUM")
	private EPSStudent epsStudent;
	/**
	 * @param program_code
	 * @param program_name
	 * @param program_type
	 * @param epsStudent
	 */
	public EPSProgram(String program_code, String program_name, String program_type, EPSStudent epsStudent) {
		this.program_code = program_code;
		this.program_name = program_name;
		this.program_type = program_type;
		this.epsStudent = epsStudent;
	}
	
	
	
	
	/**
	 * @param program_code
	 * @param program_name
	 * @param program_type
	 */
	public EPSProgram(String program_code, String program_name, String program_type) {
		this.program_code = program_code;
		this.program_name = program_name;
		this.program_type = program_type;
	}




	/**
	 * @return the program_code
	 */
	public String getProgram_code() {
		return program_code;
	}
	/**
	 * @param program_code the program_code to set
	 */
	public void setProgram_code(String program_code) {
		this.program_code = program_code;
	}
	/**
	 * @return the program_name
	 */
	public String getProgram_name() {
		return program_name;
	}
	/**
	 * @param program_name the program_name to set
	 */
	public void setProgram_name(String program_name) {
		this.program_name = program_name;
	}
	/**
	 * @return the program_type
	 */
	public String getProgram_type() {
		return program_type;
	}
	/**
	 * @param program_type the program_type to set
	 */
	public void setProgram_type(String program_type) {
		this.program_type = program_type;
	}
	/**
	 * @return the epsStudent
	 */
	public EPSStudent getEpsStudent() {
		return epsStudent;
	}
	/**
	 * @param epsStudent the epsStudent to set
	 */
	public void setEpsStudent(EPSStudent epsStudent) {
		this.epsStudent = epsStudent;
	}
	/**
	 * 
	 */
	public EPSProgram() {
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EPSProgram [program_code=" + program_code + ", program_name=" + program_name + ", program_type="
				+ program_type + ", epsStudent=" + epsStudent + "]";
	}
	
	
	
}
