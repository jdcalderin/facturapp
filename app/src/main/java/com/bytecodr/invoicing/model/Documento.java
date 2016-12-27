package com.bytecodr.invoicing.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.Date;
import java.util.List;

/**
 * Created by josedaniel on 25/12/16.
 */

@Table(name = "Documentos")
public class Documento extends Model{



    public Documento()
    {
        super();

    }

    public  Documento(int Id, String CodigoDocumento, String TipoDocumento, int Plazo,
                      double Descuento, String UsuarioId, Date Fecha , boolean Anulada,
                      boolean Sincronizado, boolean Impresa, double TotalFactura,
                      String Observacion, Cliente cliente )
    {
        super();


        this.CodigoDocumento = CodigoDocumento;
        this.TipoDocumento = TipoDocumento;
        this.Plazo = Plazo;
        this.Descuento = Descuento;
        this.UsuarioId = UsuarioId;
        this.Fecha = Fecha;
        this.Anulada = Anulada;
        this.Sincronizado = Sincronizado;
        this.Impresa = Impresa;
        this.TotalFactura = TotalFactura;
        this.Observacion = Observacion;
        this.cliente = cliente;

    }


    @Column(name = "CodigoDocumento")
    public String CodigoDocumento;

    @Column(name = "TipoDocumento")
    public String TipoDocumento;

    @Column(name = "Plazo")
    public int Plazo;

    @Column(name = "Descuento")
    public double Descuento;

    @Column(name = "UsuarioId")
    public String UsuarioId;

    @Column(name = "Fecha")
    public Date Fecha;

    @Column(name = "Anulada")
    public boolean Anulada;

    @Column(name = "Sincronizado")
    public boolean Sincronizado;

    @Column(name = "Impresa")
    public boolean Impresa;

    @Column(name = "TotalFactura")
    public double TotalFactura;


    @Column(name = "Observacion")
    public String Observacion;

    @Column(name = "Cliente")
    public  Cliente cliente;


    public List<DetalleDocumento> Detalledocumentos(){

        return  getMany(DetalleDocumento.class, "Documento");
    }


}
