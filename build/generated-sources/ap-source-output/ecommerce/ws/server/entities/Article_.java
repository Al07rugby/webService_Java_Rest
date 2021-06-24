package ecommerce.ws.server.entities;

import ecommerce.ws.server.entities.Categorie;
import ecommerce.ws.server.entities.LigneCommande;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-24T09:22:19")
@StaticMetamodel(Article.class)
public class Article_ { 

    public static volatile SingularAttribute<Article, Categorie> categorieId;
    public static volatile SingularAttribute<Article, String> visuel;
    public static volatile SingularAttribute<Article, Integer> prix;
    public static volatile SingularAttribute<Article, String> libelle;
    public static volatile SingularAttribute<Article, String> texte;
    public static volatile SingularAttribute<Article, Integer> id;
    public static volatile SingularAttribute<Article, LigneCommande> ligneCommande;

}