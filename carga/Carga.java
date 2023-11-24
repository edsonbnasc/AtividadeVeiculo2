package org.example.carga;

import org.example.veiculo.Veiculo;

public class Carga extends Veiculo {
    private int cargaMax;
    private int tara;

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    public Carga() {

    }

}
