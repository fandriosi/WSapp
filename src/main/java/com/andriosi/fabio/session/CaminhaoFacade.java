/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.session;

import com.andriosi.fabio.wsapp.entities.Caminhao;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class CaminhaoFacade extends AbstractFacade<Caminhao>{
    @Override
    protected EntityManager getEntityManager() {
        return Persistence.createEntityManagerFactory("APPUPersistence").createEntityManager();
    }

    public CaminhaoFacade() {
        super(Caminhao.class);
    }
   
}
