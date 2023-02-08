package ca.temspotify.dao;

import java.util.List;

public interface GenericDAO {
	void create(Object obj);

	List<Object> read(Object obj);

	void update(Object obj);

	void delete(Object obj);
}