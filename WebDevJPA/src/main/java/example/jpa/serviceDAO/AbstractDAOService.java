package example.jpa.serviceDAO;

import java.util.List;

import example.jpa.model.AbstractEntity;


public interface AbstractDAOService<T extends AbstractEntity> {
	
	T saveOrUpdate(T item);
	T getById(Long id);
	List<T> getAll();
	void delete(T item);
}
