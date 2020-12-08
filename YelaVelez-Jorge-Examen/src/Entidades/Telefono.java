package Entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Telefono
 *
 */
@Entity

public class Telefono implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String numero;
	private String tipo;
	private String operadora;
	@ManyToOne
	@JoinColumn
	private Usuario usu_tel_id;

	public Telefono() {
		super();
	}
   
}
