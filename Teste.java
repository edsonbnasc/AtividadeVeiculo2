package org.example;

import org.example.carga.Carga;
import org.example.motor.Motor;
import org.example.passeio.Passeio;
import org.example.veiculo.Veiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        ArrayList<Veiculo> listaDeVeiculos = new ArrayList<Veiculo>(5);
        ArrayList<Veiculo> listaDeVeiculosC = new ArrayList<>(5);
        boolean etapaConcluida = false;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("[1]criar veiculo Passeio\n[2]criar lista de veiculo carga\n[3]Imprimir lista de veiculos\n[4]Sair\n");
            int opcao = scan.nextInt();
            scan.nextLine();
            switch (opcao){
                case 1:
                     if(listaDeVeiculos.size() < 1){
                        System.out.println("digite a placa do veiculo:");
                        String placa = scan.nextLine();
                        System.out.println("digite a marca veiculo:");
                        String marca = scan.nextLine();
                        System.out.println("digite o modelo do veiculo:");
                        String modelo = scan.nextLine();
                        System.out.println("digite a cor do veiculo:");
                        String cor = scan.nextLine();
                        System.out.println("digite a velocidade maxima do veiculo:");
                        float velocMax = scan.nextFloat();
                        float x = velocMax*1000;//converte velocidade para m/h
                        System.out.println("digite a quantidade de rodas do veiculo:");
                        int qtdRodas = scan.nextInt();
                        System.out.println("digite a quantidade de pistao do veiculo:");
                        int qtdPist = scan.nextInt();
                        System.out.println("digite a potencia do veiculo:");
                        int potencia = scan.nextInt();
                        System.out.println("digite a quantidade de passageiros do veiculo:");
                        int qtdPassageiros = scan.nextInt();
                        Veiculo veiculo = new Veiculo();
                        veiculo.setPlaca(placa);
                        veiculo.setMarca(marca);
                        veiculo.setModelo(modelo);
                        veiculo.setCor(cor);
                        veiculo.setVelocMax(x);
                        veiculo.setQtdRodas(qtdRodas);
                        Motor motor = new Motor();
                        motor.setQtdPist(qtdPist);
                        motor.setPotencia(potencia);
                        veiculo.setMotor(motor);
                        Passeio passageiro = new Passeio();
                        passageiro.setQtdPassageiros(qtdPassageiros);
                        veiculo.setQtdPassageiros(passageiro);
                        listaDeVeiculos.add(veiculo);
                    }
                    else {
                         System.out.println("a lista de veiculo passeio está cheia\n\n");
                    }
                    break;

                case 2:
                    if(listaDeVeiculosC.size() < 1){
                        System.out.println("digite a placa do veiculo:");
                        String placa = scan.nextLine();
                        System.out.println("digite a marca veiculo:");
                        String marca = scan.nextLine();
                        System.out.println("digite o modelo do veiculo:");
                        String modelo = scan.nextLine();
                        System.out.println("digite a cor do veiculo:");
                        String cor = scan.nextLine();
                        System.out.println("digite a velocidade maxima do veiculo:");
                        float velocMax = scan.nextFloat();
                        float x = velocMax*100000;//converte para cm/h
                        System.out.println("digite a quantidade de rodas do veiculo:");
                        int qtdRodas = scan.nextInt();
                        System.out.println("digite a quantidade de pistao do veiculo:");
                        int qtdPist = scan.nextInt();
                        System.out.println("digite a potencia do veiculo:");
                        int potencia = scan.nextInt();
                        System.out.println("digite a quantidade de carga maxima do veiculo:");
                        int qtdCargaMax = scan.nextInt();
                        System.out.println("digite a quantidade da tara maxima do veiculo:");
                        int tara = scan.nextInt();
                        Veiculo veiculo = new Veiculo();
                        veiculo.setPlaca(placa);
                        veiculo.setMarca(marca);
                        veiculo.setModelo(modelo);
                        veiculo.setCor(cor);
                        veiculo.setVelocMax(x);
                        veiculo.setQtdRodas(qtdRodas);
                        Motor motor = new Motor();
                        motor.setQtdPist(qtdPist);
                        motor.setPotencia(potencia);
                        veiculo.setMotor(motor);
                        Carga carga = new Carga();
                        carga.setCargaMax(qtdCargaMax);
                        veiculo.setCargaMax(carga);
                        carga.setTara(tara);
                        veiculo.setTara(carga);
                        listaDeVeiculosC.add(veiculo);
                    }
                    else {
                        System.out.println("a lista de veiculo carga está cheia\n\n");
                    }
                    break;
                case 3:
                    if(listaDeVeiculos.isEmpty() && listaDeVeiculosC.isEmpty()){
                        System.out.println("Lista de veiculos VAZIA\n\n\n");
                    }
                    for(Veiculo v : listaDeVeiculos){
                        System.out.println(v.toString());
                        System.out.println(v.passageiro());
                    }
                    for(Veiculo v : listaDeVeiculosC){
                        System.out.println(v.toString());
                        System.out.println(v.carga());
                    }
                    break;
                case 4:
                    etapaConcluida=true;
                    break;
            }
        }while(!etapaConcluida);
    }
}