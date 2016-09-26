/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import junit.framework.Assert;
import org.junit.Test;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
public class RequetesTest {

    @Test
    public void test1() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

//        Vérifier le titre du film d'id 4
        Query q = em.createQuery("SELECT f FROM Film f WHERE f.id=4");
        Film f = (Film) q.getSingleResult();

//        Vérifier le nombre de films Année de prod mini de nos films
        Assert.assertEquals("Fargo", f.getTitre());

//
//        Nombre de liens du film 'Big Lebowski'
        q = em.createQuery("SELECT Film FROM Lien WHERE f.id=3");
//
//        Nombre de films réalisés par Polanski
//
//        Nombre de films interprétés par Polanski
//
//        Nombre de films à la fois interprétés et réalisés par polanski Le titre du film d'horreur anglais réalisé par roman polanski
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

}
