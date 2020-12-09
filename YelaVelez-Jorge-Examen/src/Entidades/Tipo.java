package Entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Tipo
 *
 */
@Entity

public class Tipo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	@OneToMany(cascade = CascadeType.ALL ,mappedBy = "tip_tel_id")
	private List<Telefono> telefonos;
	
	public Tipo() {
		//CONSTRUCTOR OBLIGATORIO;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	@Override
	public String toString() {
		return "Tipo [codigo=" + codigo + ", nombre=" + nombre + ", telefonos=" + telefonos + "]";
	}
   
}
