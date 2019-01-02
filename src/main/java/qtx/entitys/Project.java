package qtx.entitys;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
    @Id 
    @GeneratedValue( strategy=GenerationType.AUTO )
    private int id;    
    private String name;
   

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}	 

	public Project(String name) {
		super();
		this.name = name;
	}





	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

 
	
	

}
