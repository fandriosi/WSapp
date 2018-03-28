/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.uitl;

import com.andriosi.fabio.session.CaminhaoFacade;
import com.andriosi.fabio.wsapp.entities.Caminhao;
import java.io.Serializable;

public class CaminhaoController implements Serializable{
    public void create(Caminhao entity){
        new CaminhaoFacade().create(entity);
    }
}
