/**
 * 
 */
package com.root.model.bean.transaction;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

/**
 * @author Alen Jan 16, 2017 
 * TransPassenger.java
 * 
 */

@Entity
@Table(name="trans_passenger")
public class TransPassenger  implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_passenger")
	private Long idPassenger;
		
	@ManyToOne
	@JoinColumn(name="id_transaction", referencedColumnName = "id_transaction")
	private Transaction transaction;
	
	@Enumerated(EnumType.STRING)
	private TypePassenger typePassenger;
	
	public enum TypePassenger {
	    A, C, I
	}
	
	@Column(name="name_passenger", length=45)
	private String namePassenger;
		
	@Column(name="no_identity", length=1)
	private Integer noIdentity;
	
	@Column(name="photo_identity")
	@Type(type="text")
	private String photoIdentity;
	

	public Long getIdPassenger() {
		return idPassenger;
	}

	public void setIdPassenger(Long idPassenger) {
		this.idPassenger = idPassenger;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public TypePassenger getTypePassenger() {
		return typePassenger;
	}

	public void setTypePassenger(TypePassenger typePassenger) {
		this.typePassenger = typePassenger;
	}

	public String getNamePassenger() {
		return namePassenger;
	}

	public void setNamePassenger(String namePassenger) {
		this.namePassenger = namePassenger;
	}

	public Integer getNoIdentity() {
		return noIdentity;
	}

	public void setNoIdentity(Integer noIdentity) {
		this.noIdentity = noIdentity;
	}

	public String getPhotoIdentity() {
		return photoIdentity;
	}

	public void setPhotoIdentity(String photoIdentity) {
		this.photoIdentity = photoIdentity;
	}	
}
