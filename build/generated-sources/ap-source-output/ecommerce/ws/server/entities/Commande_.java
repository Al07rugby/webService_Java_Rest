package ecommerce.ws.server.entities;

import ecommerce.ws.server.entities.LigneCommande;
import ecommerce.ws.server.entities.Usager;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-24T09:22:19")
@StaticMetamodel(Commande.class)
public class Commande_ { 

    public static volatile SingularAttribute<Commande, Integer> id;
    public static volatile SingularAttribute<Commande, Date> dateCommande;
    public static volatile SingularAttribute<Commande, Usager> usagerId;
    public static volatile SingularAttribute<Commande, LigneCommande> ligneCommande;
    public static volatile SingularAttribute<Commande, String> statut;

}