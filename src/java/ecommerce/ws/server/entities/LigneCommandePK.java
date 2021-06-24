/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.ws.server.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Alexis
 */
@Embeddable
public class LigneCommandePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "commande_id")
    private int commandeId;
    @Basic(optional = false)
    @Column(name = "article_id")
    private int articleId;

    public LigneCommandePK() {
    }

    public LigneCommandePK(int commandeId, int articleId) {
        this.commandeId = commandeId;
        this.articleId = articleId;
    }

    public int getCommandeId() {
        return commandeId;
    }

    public void setCommandeId(int commandeId) {
        this.commandeId = commandeId;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) commandeId;
        hash += (int) articleId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LigneCommandePK)) {
            return false;
        }
        LigneCommandePK other = (LigneCommandePK) object;
        if (this.commandeId != other.commandeId) {
            return false;
        }
        if (this.articleId != other.articleId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ecommerce.ws.server.entities.LigneCommandePK[ commandeId=" + commandeId + ", articleId=" + articleId + " ]";
    }
    
}
