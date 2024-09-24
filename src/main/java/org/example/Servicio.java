package org.example;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class Servicio {

    public List<String> mostrarMatricula(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "SELECT v.matricula FROM Vehiculo v";
        Query<String> query = session.createQuery(hql, String.class);
        List<String> matriculas = query.getResultList();
        session.close();
        return matriculas;

    }

    public List<Object[]> mostrarMatriculaYmarca(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "SELECT v.matricula, v.marca FROM Vehiculo v ORDER BY v.asientos";
        Query<Object[]> query = session.createQuery(hql, Object[].class);
        List<Object[]> results = query.getResultList();
        return results;

    }

    public List<String> masDosAsientosYruedas(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "SELECT v.matricula FROM Vehiculo v WHERE v.asientos > 2 AND v.ruedas > 2";
        Query<String> query = session.createQuery(hql, String.class);
        List<String> matriculas = query.getResultList();


        return matriculas;

    }

    public List<String> case4() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "SELECT v.matricula FROM Vehiculo v where v.asientos >2 OR v.ruedas >2";
        Query<String> query = session.createQuery(hql, String.class);
        return query.getResultList();

    }

    public List<String> case5(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "SELECT v.matricula FROM Vehiculo v WHERE LENGTH(v.matricula)<6";
        Query<String> query = session.createQuery(hql, String.class);

        List<String> matriculas = (List<String>) query.getResultList();
        return matriculas;


    }

    public  List<Object[]> case6(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "SELECT v.matricula, s.perdida FROM Vehiculo v JOIN Siniestro s ON v.id = s.vehiculo.id WHERE s.perdida > 1000";
        Query<Object[]> query = session.createQuery(hql, Object[].class);
        List<Object[]> results = query.getResultList();


        return results;
    }









}
