package ma.projet.service;

import com.google.protobuf.Service;
import ma.projet.classes.Assurance;
import ma.projet.classes.Client;
import ma.projet.dao.AbstractFacade;
import ma.projet.util.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;


public class ClientService implements AbstractFacade<Client> {

    public  Client create(Client o){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(o);
        tx.commit();
        session.close();
        return o;
    }
    public Client update(Client o){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(o);
        tx.commit();
        session.close();
        return o;
    }
    public boolean delete(Client o){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(o);
        tx.commit();
        session.close();
        return true;
    }
    public Client findbyid(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Client c = session.get(Client.class,id);
        session.close();
        return c;
    }
    public List<Client> findall(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Client> clients = session
                .createQuery("from Client ",Client.class)
                .list();
        return clients;
    }
    //chercher client pas cin

    public Client findbytype(String cin){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Client client = session
                .createQuery("from Client where cin = :c",Client.class)
                .setParameter("c",cin)
                .uniqueResult();
        session.close();
        return client;
    }
}
