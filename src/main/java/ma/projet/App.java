package ma.projet;


import ma.projet.classes.Assurance;
import ma.projet.classes.Client;
import ma.projet.service.AssurenceService;
import ma.projet.service.ClientService;
import ma.projet.util.hibernate.HibernateUtil;
import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ClientService auteurService = new ClientService();
                AssurenceService livreService = new AssurenceService();

              //  1. Créer un Client
              Client client = new Client(15552,"souaiki","abderrahmane","626262","abdo.email","EE353");
              ClientService.create(client);
               //  2. Créer un Assurence
               Assurance assurence = new Assurance(132232, " type1",33323,"cov");
               AssurenceService.create(assurence);


           }
}
