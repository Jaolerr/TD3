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
@DiscriminatorValue("0")
public class Paiement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int idPaiement;
	protected double montant;
	protected LocalDate date;
	
	
	public Paiement() {
		super();
	}


	public Paiement(int idPaiement, double montant, LocalDate date) {
		super();
		this.idPaiement = idPaiement;
		this.montant = montant;
		this.date = date;
	}


	public int getIdPaiement() {
		return idPaiement;
	}


	public void setIdPaiement(int idPaiement) {
		this.idPaiement = idPaiement;
	}


	public double getMontant() {
		return montant;
	}


	public void setMontant(double montant) {
		this.montant = montant;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


}
