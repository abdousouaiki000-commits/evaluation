package ma.projet.tests.tst;

import ma.projet.classes.Assurance;
import ma.projet.service.AssurenceService;

public class findbytype {
    //  4. Tester findbytype
    Assurance a = AssurenceService.findbytype("type1");
               System.out.println("Assurence trouvé : " + a.get());

}
