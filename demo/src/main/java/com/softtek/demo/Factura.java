package com.softtek.demo;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    public IImpuesto impuesto;
    public List<Producto> listaProds;

    public Factura(IImpuesto impuesto) {
        this.impuesto = impuesto;
        this.listaProds = new ArrayList<Producto>();
    }
    public double calcularTotalFactura(){
        double total = 0;
        for (Producto listaProd : listaProds) {
            total += impuesto.calcularImpuesto(listaProd);
        }
        return total;
    }
}
