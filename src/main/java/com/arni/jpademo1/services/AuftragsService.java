package com.arni.jpademo1.services;

import com.arni.jpademo1.db.model.Auftrag;
import com.arni.jpademo1.db.repository.AuftragsRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class AuftragsService {

    @Autowired
    AuftragsRepsitory auftragsRepsitory;

    @Transactional
    public Auftrag getAuftragById(Long id) {
        Auftrag a = this.auftragsRepsitory.findById(id).orElseThrow();
        a.getAuftragsPositionen().size(); // load positions
        return a;
    }
}
