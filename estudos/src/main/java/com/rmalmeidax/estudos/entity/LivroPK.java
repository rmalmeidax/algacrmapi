package com.rmalmeidax.estudos.entity;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class LivroPK {
	
	@ManyToOne
	@JoinColumn(name = "autor_id")
	private Autor autor;
	
	@ManyToOne
	@JoinColumn(name = "nome_id")
	private AutorList autorList;

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public AutorList getAutorList() {
		return autorList;
	}

	public void setAutorList(AutorList autorList) {
		this.autorList = autorList;
	}

	@Override
	public int hashCode() {
		return Objects.hash(autor, autorList);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LivroPK other = (LivroPK) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(autorList, other.autorList);
	}
	
	
}

	