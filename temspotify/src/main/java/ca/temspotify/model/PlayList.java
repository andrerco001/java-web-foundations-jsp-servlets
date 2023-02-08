package ca.temspotify.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class PlayList implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String titulo;
	private List<Musica> musicas;

	public PlayList() {
		super();
	}

	public PlayList(int id, String titulo) {
		super();
		this.id = id;
		this.titulo = titulo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayList other = (PlayList) obj;
		return id == other.id && Objects.equals(titulo, other.titulo);
	}
}