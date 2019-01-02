package qtx.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="direccion")
public class Address {
	
	@Id 
    @GeneratedValue( strategy=GenerationType.AUTO )
	private int id;
	@Column(length=100, nullable=false)
	private String calle;
	@Column(length=10, nullable=false)
	private String numero;
	@Column(length=50, nullable=false)
	private String ciudad;
	
//	 @OneToOne(fetch=FetchType.LAZY, mappedBy="direccion")
//	 private Person owner;
	
	
	public Address(String calle, String numero, String ciudad) {
		super();
		 
		this.calle = calle;
		this.numero = numero;
		this.ciudad = ciudad;
	}
	

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getIdPersona() {
		return id;
	}


	public void setIdPersona(int idPersona) {
		this.id = idPersona;
	}


	public String getCalle() {
		return calle;
	}


	public void setCalle(String calle) {
		this.calle = calle;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	@Override
	public String toString() {
		return "Direccion [idPersona=" + id + ", calle=" + calle + ", numero=" + numero + ", ciudad=" + ciudad
				+ "]";
	}
	
	
	

}
