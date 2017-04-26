package javapoo_aula_03;

public class Caneta {
    public String modelo,cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    public void status(){
        System.out.println("Uma caneta de cor "+this.cor);
        
        if(this.tampada){
            System.out.println("Ela esta tampada");
        }else{
            System.out.println("Ela NÃO esta tampada");
        }
        System.out.println("Tamanho da ponta "+ponta);
    }
    public void rabiscar(String escreva){
        if(this.tampada == true){
            System.out.println("É preciso destampar a caneta antes de rabiscar");
        }else{
            System.out.println(escreva);
        }
    }
    protected void tampar(){
        this.tampada = true;
    }
    protected void destampar(){
        this.tampada = false;
    }
}
