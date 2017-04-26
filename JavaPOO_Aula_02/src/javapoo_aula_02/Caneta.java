package javapoo_aula_02;

public class Caneta {
    String modelo,cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Uma caneta de cor "+this.cor);
        
        if(this.tampada){
            System.out.println("Ela esta tampada");
        }else{
            System.out.println("Ela NÃO esta tampada");
        }
        System.out.println("Tamanho da ponta "+ponta);
    }
    void rabiscar(String escreva){
        if(this.tampada == true){
            System.out.println("É preciso destampar a caneta antes de rabiscar");
        }else{
            System.out.println(escreva);
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
