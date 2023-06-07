package com.softtek.demo;

public class IvaGeneral implements IImpuesto{
    @Override
    public double calcularImpuesto(Producto p) {
        //devuelve el precio  + 21%
        return p.precio * 1.21;
    }
}
