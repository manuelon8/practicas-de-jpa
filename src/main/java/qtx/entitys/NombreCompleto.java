package qtx.entitys;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class NombreCompleto {
	
	@Column(length=20)
	private String primernombre;
	@Column(length=20)
	private String segundonombre;
	@Column(length=20)
	private String primerapellido;
	@Column(length=20)
	private String segundoapellido;
	
	
	
	public NombreCompleto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NombreCompleto(String primernombre, String segundonombre, String primerapellido, String segundoapellido) {
		super();
		this.primernombre = primernombre;
		this.segundonombre = segundonombre;
		this.primerapellido = primerapellido;
		this.segundoapellido = segundoapellido;
	}
	public String getPrimernombre() {
		return primernombre;
	}
	public void setPrimernombre(String primernombre) {
		this.primernombre = primernombre;
	}
	public String getSegundonombre() {
		return segundonombre;
	}
	public void setSegundonombre(String segundonombre) {
		this.segundonombre = segundonombre;
	}
	public String getPrimerapellido() {
		return primerapellido;
	}
	public void setPrimerapellido(String primerapellido) {
		this.primerapellido = primerapellido;
	}
	public String getSegundoapellido() {
		return segundoapellido;
	}
	public void setSegundoapellido(String segundoapellido) {
		this.segundoapellido = segundoapellido;
	}
	
	
}
