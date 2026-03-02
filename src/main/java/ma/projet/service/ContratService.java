package ma.projet.service;


import ma.projet.classes.Assurance;
import ma.projet.classes.Contrat;
import ma.projet.dao.AbstractFacade;
import ma.projet.util.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;
import java.util.List;

public class ContratService implements AbstractFacade<Contrat> {

    public Contrat create(Contrat o){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(o);
        tx.commit();
        session.close();
        return o;
    }
    public Contrat update(Contrat o){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(o);
        tx.commit();
        session.close();
        return o;
    }
    public boolean delete(Contrat o){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(o);
        tx.commit();
        session.close();
        return true;
    }
    public Contrat findbyid(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Contrat a = session.get(Contrat.class,id);
        session.close();
        return a;
    }
    public List<Contrat> findall(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Contrat> assurances = session
                .createQuery("from Assurance ",Contrat.class)
                .list();
        return assurances;
    }

    //chercher contrat actif

    public Contrat findbydate(Date dateDebut,Date datefin){
        Session session = HibernateUtil.getSessionFactory().openSession();





        session.close();
        return null;
    }
}
