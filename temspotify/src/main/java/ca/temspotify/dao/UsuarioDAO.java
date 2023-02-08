package ca.temspotify.dao;

import java.util.ArrayList;
import java.util.List;

import ca.temspotify.model.Musica;
import ca.temspotify.model.PlayList;
import ca.temspotify.model.Usuario;

public class UsuarioDAO implements GenericDAO {

	@Override
	public void create(Object obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Object> read(Object obj) {
		// Playlist
		List<PlayList> playLists = new ArrayList<>();
		PlayList playList1 = new PlayList(1, "Gospel");

		// Música
		List<Musica> musicas = new ArrayList<>();
		Musica musica1 = new Musica(1, "Deus é Deus", "Delino Marcal", "Deus é Deus", "Gospel",
				"https://www.youtube.com/watch?v=ybyIkyD4N_0");

		musicas.add(musica1);

		playLists.add(playList1);

		// Usuário
		Usuario user = new Usuario(1, "Jean Jean", "jean@jean.ca", "1234");
		user.setPlayLists(playLists);

		List<Object> usuarios = new ArrayList<>();
		usuarios.add(user);

		return usuarios;
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub

	}
}