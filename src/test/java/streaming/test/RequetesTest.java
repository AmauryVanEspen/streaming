/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author admin
 */
public class RequetesTest {

//    @Test
//    public void test1() {
//        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//
////      Vérifier le titre du film d'id 4
//        Query q = em.createQuery("SELECT f FROM Film f WHERE f.id=4");
//        Film f = (Film) q.getSingleResult();
//
//        Assert.assertEquals("Fargo", f.getTitre());
//
//    }
//    public void test2() {
//        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//
////      Vérifier le nombre de films Année de prod mini de nos films
//        Query q = em.createQuery("SELECT f FROM Film f WHERE f.id=4");
//        Film f = (Film) q.getSingleResult();
//
//        Assert.assertEquals("Fargo", f.getTitre());
//
//    }
    @Test
    public void test7() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

//      Nombre de liens du film 'Big Lebowski'
        long l = (long) em.createQuery("SELECT COUNT(l) FROM Film f JOIN f.liens l WHERE f.titre LIKE '%Big Lebowski%'").getSingleResult();
        Assert.assertEquals(1L, l);
    }

//
    @Test
    public void test8() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

//      Nombre de films réalisés par Polanski
        long r = (long) em.createQuery("SELECT COUNT(r) FROM Film f JOIN f.realisateurs r WHERE r.nom LIKE '%Polanski%'").getSingleResult();
        Assert.assertEquals(2L, r);
    }
//
//        

    @Test
    public void test9() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

//      Nombre de films interprétés par Polanski
        long a = (long) em.createQuery("SELECT COUNT(a) FROM Film f JOIN f.acteurs a WHERE a.nom LIKE '%Polanski%'").getSingleResult();
        Assert.assertEquals(1L, a);
    }
//
//         

    @Test
    public void test10() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

//      Nombre de films à la fois interprétés et réalisés par polanski
        long a = (long) em.createQuery("SELECT COUNT(a) FROM Film f JOIN f.acteurs a WHERE a.nom LIKE '%Polanski%' INTERSECT SELECT COUNT(a) FROM Film f JOIN f.acteurs a WHERE a.nom LIKE '%Polanski%'").getSingleResult();
        Assert.assertEquals(1L, a);
        System.out.println("streaming.test.RequetesTest.test10()");
    }

//        Le titre du film d'horreur anglais réalisé par roman polanski
//
//        Le nomnbre de films réalisés par joel coen
//
//        Le nombre de films réalisés par les 2 frères coen
//
//        Le nombre de films des frères coen interprétés par Steve Buscemi Le nombre de films policiers des frères Coen interprétés par Steve Buscemi Le nombre de saisons de la série Dexter Le nombre d'épisodes de la saison 8 de la série Dexter
//
//        Le nombre total d'épisodes de la série Dexter
//
//        Le nombre total de liens pour nos films policiers américains Le nombre totals de liens pour nos films d'horreur interprétés par Polanski
//
//        Tous les films d'horreur, sauf ceux interprétés par Polanski ( utiliser UNION ou MINUS ou INTERSECT )
//
//        Parmi tous les films, uniquement ceux interprétés par Polanski  ( utiliser UNION ou MINUS ou INTERSECT )
//
//        Tous les films interprétés par Polanski et aussi tous les films d'horreur ( utiliser UNION ou MINUS ou INTERSECT )
}
