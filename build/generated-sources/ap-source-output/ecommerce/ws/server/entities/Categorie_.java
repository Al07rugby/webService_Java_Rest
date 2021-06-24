package ecommerce.ws.server.entities;

import ecommerce.ws.server.entities.Article;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-24T09:22:19")
@StaticMetamodel(Categorie.class)
public class Categorie_ { 

    public static volatile CollectionAttribute<Categorie, Article> articleCollection;
    public static volatile SingularAttribute<Categorie, String> visuel;
    public static volatile SingularAttribute<Categorie, String> libelle;
    public static volatile SingularAttribute<Categorie, String> texte;
    public static volatile SingularAttribute<Categorie, Integer> id;

}