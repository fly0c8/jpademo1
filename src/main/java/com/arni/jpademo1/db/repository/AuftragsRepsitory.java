package com.arni.jpademo1.db.repository;

import com.arni.jpademo1.db.model.Auftrag;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface AuftragsRepsitory extends CrudRepository<Auftrag, Long> {
}
