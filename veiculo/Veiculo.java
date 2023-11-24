package org.example.veiculo;

import org.example.carga.Carga;
import org.example.motor.Motor;
import org.example.passeio.Passeio;

public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private float velocMax;
    private int qtdRodas;
    private Motor motor;
    private Passeio passeio;
    private Carga carga;

    public Veiculo() {
        this.placa = "";
        this.marca = "";
        this.modelo = "";
        this.cor = "";
        this.velocMax = 0;
        this.qtdRodas = 0;
        this.motor = null;
        this.passeio = null;
        this.carga = null;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getVelocMax() {
        return velocMax;
    }

    public void setVelocMax(float velocMax) {
        this.velocMax = velocMax;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setQtdPassageiros(Passeio passageiro) {this.passeio = passageiro;}
    public void setCargaMax(Carga carga) {this.carga=carga;}
    public void setTara(Carga carga) {this.carga = carga;}

    public String passageiro(){
        return "Quantidade de Passageiros: " +passeio.getQtdPassageiros()+
                "\n";
    }
    public String carga(){
        return "Carga Maxima: "+carga.getCargaMax()+
                "\nTara Maxima: "+carga.getTara()+
                "\n";
    }
    @Override
    public String toString() {
        return "VEICULO" +
                "\nPlaca: " + placa +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nCor: " + cor +
                "\nVelocMax: " + velocMax +
                "\nQuant. de Rodas: " + qtdRodas +
                "\nQuant. de Pistões: " + motor.getQtdPist() +
                "\nPotência: " + motor.getPotencia();
    }



}
