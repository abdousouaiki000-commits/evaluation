package ma.projet.tests.tst;

import ma.projet.classes.Assurance;
import ma.projet.classes.Client;
import ma.projet.service.AssurenceService;
import ma.projet.service.ClientService;

public class findbycin {
    //  3. Tester findbycin
    Client c = ClientService.findbycin("EE353");
               System.out.println("client trouvé : " + c.getNom());

    }
