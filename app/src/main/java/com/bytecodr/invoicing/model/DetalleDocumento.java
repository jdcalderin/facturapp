package com.bytecodr.invoicing.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by josedaniel on 25/12/16.
 */

@Table(name = "DetalleDocumentos")
public class DetalleDocumento extends Model {


    public  DetalleDocumento(int remote_id, int cantidad, double precio, Producto producto, Documento documento)
    {
        super();


        this.Cantidad = cantidad;
        this.Precio = precio;
        this.producto = producto;
        this.documento = documento;


    }

    public  DetalleDocumento()
    {
        super();

    }





    @Column(name = "Cantidad")
    public  int Cantidad;
    @Column(name = "Precio")
    public  double Precio;


    @Column(name = "producto")
    public  Producto producto;
    @Column(name = "factura")
    public  Documento documento;




}
