package ecommerce.ws.server.entities;

import ecommerce.ws.server.entities.Article;
import ecommerce.ws.server.entities.Commande;
import ecommerce.ws.server.entities.LigneCommandePK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-24T09:22:19")
@StaticMetamodel(LigneCommande.class)
public class LigneCommande_ { 

    public static volatile SingularAttribute<LigneCommande, Double> prix;
    public static volatile SingularAttribute<LigneCommande, LigneCommandePK> ligneCommandePK;
    public static volatile SingularAttribute<LigneCommande, Commande> commande;
    public static volatile SingularAttribute<LigneCommande, Article> article;
    public static volatile SingularAttribute<LigneCommande, Integer> quantite;

}