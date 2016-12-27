package com.bytecodr.invoicing.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by josedaniel on 25/12/16.
 */

@Table(name = "Parametros")
public class Parametros extends Model {

    @Column(name = "Tipo")
    public String Tipo;
    @Column(name = "Codigo")
    public String Codigo;
    @Column(name = "Valor")
    public String Valor;


    public Parametros(){
        super();
    }

    public Parametros( String Tipo, String Codigo, String Valor)
    {
        super();


        this.Tipo    = Tipo;
        this.Codigo = Codigo;
        this.Valor = Valor;


    }



}
