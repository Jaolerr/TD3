package com.model;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@DiscriminatorValue("1")
public class Paypal extends Paiement {

	private int numeroCompte;
	
	

	public Paypal(int numeroCompte) {
		super();
		this.numeroCompte = numeroCompte;
	}
	

	public Paypal(double montant, LocalDate date, int numeroCompte) {
		super(montant, date);
		this.numeroCompte = numeroCompte;
	}


	public Paypal(int idPaiement, double montant, LocalDate date, int numeroCompte) {
		super(idPaiement, montant, date);
		this.numeroCompte = numeroCompte;
	}

	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
}
