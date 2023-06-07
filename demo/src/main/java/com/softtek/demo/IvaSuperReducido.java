package com.softtek.demo;

public class IvaSuperReducido implements IImpuesto{
    @Override
    public double calcularImpuesto(Producto p) {
        // 4 % de iva reducido
        return p.precio*1.04;
    }
}
