package ma.projet.util.hibernate;

import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .buildSessionFactory();

    public static SessionFactory getFactory(){
        return factory;
    }

    public static SessionBuilder<SessionBuilder> getSessionFactory() {
        return null;
    }
}
