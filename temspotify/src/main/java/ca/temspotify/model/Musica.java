package ca.temspotify.model;

import java.io.Serializable;
import java.util.Objects;

public class Musica implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String titulo;
	private String artista;
	private String album;
	private String estilo;
	private String linkMp3;

	public Musica() {
		super();
	}

	public Musica(int id, String titulo, String artista, String album, String estilo, String linkMp3) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.artista = artista;
		this.album = album;
		this.estilo = estilo;
		this.linkMp3 = linkMp3;
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

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getLinkMp3() {
		return linkMp3;
	}

	public void setLinkMp3(String linkMp3) {
		this.linkMp3 = linkMp3;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Musica other = (Musica) obj;
		return id == other.id;
	}
}