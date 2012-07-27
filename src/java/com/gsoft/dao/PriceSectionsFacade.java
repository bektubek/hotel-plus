/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsoft.dao;

import com.gsoft.model.PriceSections;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author vgladky
 */
@Stateless
public class PriceSectionsFacade extends AbstractFacade<PriceSections> {
    @PersistenceContext(unitName = "HotelPlusPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PriceSectionsFacade() {
        super(PriceSections.class);
    }
    
}
