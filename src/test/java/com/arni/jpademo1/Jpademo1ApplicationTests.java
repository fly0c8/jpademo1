package com.arni.jpademo1;

import com.arni.jpademo1.db.model.Auftrag;
import com.arni.jpademo1.db.model.AuftragsPos;
import com.arni.jpademo1.db.repository.AuftragsRepsitory;
import com.arni.jpademo1.services.AuftragsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.Set;

@SpringBootTest
class Jpademo1ApplicationTests {

    @Autowired
    AuftragsRepsitory auftragsRepsitory;

    @Autowired
    AuftragsService auftragsService;

    @Test
    void contextLoads() {
    }
    @Test()
    void datatest() {
        try {
            Auftrag found = auftragsService.getAuftragById(85L);
            found.getAuftragsPositionen().forEach(ap -> System.out.println(ap.getAuftragsPosition()));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Done.");
    }
}
