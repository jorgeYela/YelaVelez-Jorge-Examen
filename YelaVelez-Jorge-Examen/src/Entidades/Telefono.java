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
	@OneToOne
	@JoinColumn
	private Usuario usu_tel_id;
	@OneToOne
	@JoinColumn
	private Operadora ope_tel_id;
	@OneToOne
	@JoinColumn
	private Tipo tip_tel_id;

	public Telefono() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Usuario getUsu_tel_id() {
		return usu_tel_id;
	}

	public void setUsu_tel_id(Usuario usu_tel_id) {
		this.usu_tel_id = usu_tel_id;
	}

	public Operadora getOpe_tel_id() {
		return ope_tel_id;
	}

	public void setOpe_tel_id(Operadora ope_tel_id) {
		this.ope_tel_id = ope_tel_id;
	}

	public Tipo getTip_tel_id() {
		return tip_tel_id;
	}

	public void setTip_tel_id(Tipo tip_tel_id) {
		this.tip_tel_id = tip_tel_id;
	}

	@Override
	public String toString() {
		return "Telefono [codigo=" + codigo + ", numero=" + numero + ", usu_tel_id=" + usu_tel_id + ", ope_tel_id="
				+ ope_tel_id + ", tip_tel_id=" + tip_tel_id + "]";
	}
   
}
