package Atividadecarro;


public class Carro {
    private String cor,modelo;
    private double velocidadeAtual,velocidadeMaxima;
    private boolean ligado;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    public boolean ligado(){
        return this.isLigado();
    }
    
    public void acelera(){
        if(this.ligado()){
            this.setVelocidadeAtual(getVelocidadeAtual() + 5);
        }else{
            System.out.println("O carro não está ligado");
        }
    }
    
    int pegaMarcha(){
        if(this.getVelocidadeAtual() < 0){
            return -1;
        }else if(getVelocidadeAtual() < 20){
            return 1;
        }else if(getVelocidadeAtual() < 40){
            return 2;
        }else if(getVelocidadeAtual() < 60){
            return 3;
        }else if(getVelocidadeAtual() < 80){
            return 4;
        }else if(getVelocidadeAtual() < 100){
            return 5;
        }
        return 6;
    }
}
