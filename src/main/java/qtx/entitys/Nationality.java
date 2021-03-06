package qtx.entitys;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Nationality {

	   @Id 
	   @GeneratedValue( strategy=GenerationType.AUTO )
	   private long id;
	   private String name;
	   
	   
	public Nationality(String name) {
		super();
		this.name = name;
	}


	public Nationality() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Nationatily [id=" + id + ", name=" + name + "]";
	}
	   
	   
	
}
