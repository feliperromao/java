package javapoo_aula_05;

import javax.xml.transform.OutputKeys;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }
    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int n){
        this.numConta = n;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getDono(){
        return this.dono;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean s){
        this.status = s;
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if("CP".equals(t)) {
            this.setSaldo(150);
        }
    }
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("A conta não pode ser encerrada, favor sacar valores");
        }else if (this.getSaldo() < 0) {
            System.out.println("A conta não pode ser encerrada, favor quitar débito");
        }else{
            this.setStatus(false);
            System.out.println("Conta encerrada com sucesso");
        }
    }
    public void depositar(float v){
        if(this.getStatus()){
           this.setSaldo(this.getSaldo() + v); 
        }else{
            System.out.println("Conta inativa, impossivel depositar");
        }
    }
    public void sacar(float v){
        if(this.getSaldo() < v){
            System.out.println("Saldo insuficiente");
        }else {
            this.setSaldo(this.getSaldo() - v);
        }
    }
    public void pagarMensal(){
        float v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12;
        }else if("CP".equals(this.getTipo())){
            v = 20;
        }
        if(this.getStatus() == true){
          this.setSaldo(this.getSaldo() - v);  
        }
        
    }
    public void detalhes(){
        System.out.println("Número da conta: "+this.getNumConta());
        System.out.println("Tipo de conta: "+this.getTipo());
        System.out.println("Proprietário da conta: "+this.getDono());
        System.out.println("Saldo: R$"+this.getSaldo());
        if(this.getStatus() == true){
            System.out.println("Status da conta: Conta ativa");
        }else{
            System.out.println("Status da conta: Conta inativa");
        }
    }
    
    public void statusConta(){
        System.out.println("Status");
    }
    
    public void statusConta(String oi){
        System.out.println(oi);
    }
    public void statusConta(String oi, String nome){
        System.out.println(oi+" "+nome);
    }
    
}
