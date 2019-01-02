package qtx.entitys;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="persona")
public class Person {
	
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  int idPersona;
	@Column(nullable=false, length=60)
	private String nombre;
	@Column
	private String clave;
	@Column(name="dni", unique=true, length=12)
	private int dni; 
	@Column 
	@Temporal(TemporalType.DATE)
	private Date fechanacimiento;
	@Embedded
	private NombreCompleto nombreCompleto;
	
	@OneToOne
	private Address direccion;
	@ManyToOne
	private Nationality nationality;
	
//	 @ManyToMany
//	 private Set<Department> departments = new HashSet<Department>();
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Person(String nombre, String clave, int dni, Date fechanacimiento, NombreCompleto nombreCompleto,
			Address direccion, Nationality nationality) {
		super();
		this.nombre = nombre;
		this.clave = clave;
		this.dni = dni;
		this.fechanacimiento = fechanacimiento;
		this.nombreCompleto = nombreCompleto;
		this.direccion = direccion;
		this.nationality = nationality;
		 
	}	


	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Date getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public NombreCompleto getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(NombreCompleto nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public Address getDireccion() {
		return direccion;
	}

	public void setDireccion(Address direccion) {
		this.direccion = direccion;
	}

	public Nationality getNationality() {
		return nationality;
	}

	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}

	 
	 

}
