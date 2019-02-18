package interfaces;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface BaseRepository extends JpaRepository<Object, Long>{
	
	Optional<Object> findById(Long Id);
	List<Object> findAll();

}
