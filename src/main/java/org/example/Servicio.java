package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.TypedQuery;
import java.util.List;

public class Servicio {

    public List<Vehiculo> mostrarMatricula(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        TypedQuery <Vehiculo> hqlQuery = session.createQuery("FORM Vehiculo");
        List<Vehiculo> vehiculo = hqlQuery.getResultList();
        session.close();
        return vehiculo;


    }




}
