
package javapoo_aula_04;
public class Caneta {
    private String modelo,cor;
    private float ponta;
    private boolean tampada;
    public Caneta(String m, String c, float p){
        this.tampar();
        this.setCor(c);
        this.setModelo(m);
        this.setPonta(p);
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float ponta){
        this.ponta = ponta;
    }
    public boolean getTampada(){
        return this.tampada;
    }
    public void setTampada(boolean tampada){
        this.tampada = tampada;
    }
    
    public void status(){
        System.out.println("Cor da caneta: "+this.getCor());
        System.out.println("Modelo da caneta: "+this.getModelo());
        System.out.println("Tamanho da ponta: "+this.getPonta());
        if(this.tampada == false){
            System.out.println("Não esta tampada");
        }else {
            System.out.println("Está tampada");
        }
    }
    
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
