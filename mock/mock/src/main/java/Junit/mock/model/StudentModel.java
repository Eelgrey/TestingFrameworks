package Junit.mock.model;

import java.io.Serializable;
import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Student_Details")
public class StudentModel implements Serializable{

	private static final long serialVersionUID = 5072406099647907795L;
	
	@Id
	private String id;
	private String name;
	private String course;
	private BigDecimal fees;
	
	
	
	public String getId() {
		return id;
	}



	public StudentModel(String id, String name, String course, BigDecimal fees) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.fees = fees;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCourse() {
		return course;
	}



	public void setCourse(String course) {
		this.course = course;
	}



	public BigDecimal getFees() {
		return fees;
	}



	public void setFees(BigDecimal fees) {
		this.fees = fees;
	}



	public StudentModel() {
		super();
		
	}



	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", name=" + name + ", course=" + course + ", fees=" + fees + "]";
	}
	
	
	
}
