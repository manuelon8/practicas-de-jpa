package qtx.entitys;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Department 
{
    @Id 
    @GeneratedValue( strategy=GenerationType.AUTO )
    private int id;
    private String name;
    
    @OneToMany( targetEntity=Project.class )
    private List projectlist;
    
//    @ManyToMany
//    private Set<Person> persons = new HashSet<Person>();
   
    public Department() {
		super();
		// TODO Auto-generated constructor stub
	}    
    

	public Department(String name) {
		super();
		this.name = name;
	}


	public int getId() 
    {
    return id;
    }
    
    public void setId(int id) 
    {
    this.id = id;
    }
    
    public String getName( )
    {
    return name;
    }
    
    public void setName( String deptName )
    {
    this.name = deptName;
    }

 

	public List getProjectlist() {
		return projectlist;
	}


	public void setProjectlist(List projectlist) {
		this.projectlist = projectlist;
	}
    
    


 

 
    
}