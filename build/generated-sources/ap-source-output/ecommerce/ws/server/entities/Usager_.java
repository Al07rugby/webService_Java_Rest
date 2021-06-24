package ecommerce.ws.server.entities;

import ecommerce.ws.server.entities.Commande;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-24T09:22:19")
@StaticMetamodel(Usager.class)
public class Usager_ { 

    public static volatile SingularAttribute<Usager, String> password;
    public static volatile SingularAttribute<Usager, String> roles;
    public static volatile SingularAttribute<Usager, Integer> id;
    public static volatile SingularAttribute<Usager, String> nom;
    public static volatile SingularAttribute<Usager, String> prenom;
    public static volatile SingularAttribute<Usager, String> email;
    public static volatile CollectionAttribute<Usager, Commande> commandeCollection;

}