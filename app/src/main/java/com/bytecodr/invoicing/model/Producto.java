package com.bytecodr.invoicing.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.itextpdf.text.pdf.qrcode.Mode;

import java.util.List;

/**
 * Created by josedaniel on 25/12/16.
 */

@Table(name = "Productos")
public class Producto extends Model{

    @Column(name = "Codigo")
    public String Codigo;
    @Column(name = "Nombre")
    public String Nombre;

    @Column(name = "Precio")
    public double Precio;

    @Column(name = "iva")
    public double iva;

    @Column(name = "Existencias")
    public int Existencias;

    public List<DetalleDocumento> detalleDocumentos(){

        return  getMany(DetalleDocumento.class, "Producto");
    }


    public Producto(){
        super();
    }

    public Producto(int remoteId, String Nombre, String Codigo, double Precio, double iva, int Existencias)
    {
        super();


        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.Precio = Precio;
        this.iva   = iva;
        this.Existencias = Existencias;


    }





}
