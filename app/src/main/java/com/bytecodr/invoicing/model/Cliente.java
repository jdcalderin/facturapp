package com.bytecodr.invoicing.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.List;

/**
 * Created by josedaniel on 25/12/16.
 */

@Table(name = "Clientes")
public class Cliente extends Model {

    @Column(name = "Nit", unique = true)
    public  String Nit;
    @Column(name = "Nombre")
    public  String Nombre;
    @Column(name = "Email")
    public String Email ;
    @Column(name = "Telefono")
    public  String Telefono;
    @Column(name = "Celular")
    public  String Celular;
    @Column(name = "Direccion")
    public  String Direccion;
    @Column(name = "PlazoDias")
    public  int PlazoDias ;



    public Cliente(){
        super();
    }


    public Cliente(int Id, String Nombre, String Email, String Telefono, String Celular, String Direccion, int PlazoDias)
    {
        super();

        this.Nombre = Nombre;
        this.Email = Email;
        this.Telefono = Telefono;
        this.Celular = Celular;
        this.Direccion = Direccion;
        this.PlazoDias = PlazoDias;

    }

    public List<Documento> documentos(){

        return  getMany(Documento.class, "Cliente");
    }







}
