package ma.projet.service;

import ma.projet.classes.Assurance;
import ma.projet.dao.AbstractFacade;
import ma.projet.util.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class AssurenceService implements AbstractFacade<Assurance> {

@Override
    public Assurance create(Assurance o){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(o);
        tx.commit();
        session.close();
        return o;
    }
    @Override
    public Assurance update(Assurance o){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(o);
        tx.commit();
        session.close();
        return o;
    }
    @Override
    public boolean delete(Assurance o){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(o);
        tx.commit();
        session.close();
        return true;
    }
    @Override
    public Assurance findbyid(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Assurance a = session.get(Assurance.class,id);
        session.close();
        return a;
    }
    @Override
    public List<Assurance> findall(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Assurance> assurances = session
                .createQuery("from Assurance ",Assurance.class)
                .list();
        return assurances;
    }

    //chercher assurance par son type
public List<Assurance> findbytype(String type){
Session session = HibernateUtil.getSessionFactory().openSession();
List<Assurance> assurance = session
        .createQuery("from Assurance where type = :t",Assurance.class)
        .setParameter("t",type)
        .list();
session.close();
return assurance;
}
}
