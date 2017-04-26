package javapoo_aula_05;

public class JavaPOO_Aula_05 {

    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setDono("Felipe Romão");
        c1.setNumConta(455444);
        c1.abrirConta("CP");
        c1.pagarMensal();
        c1.sacar(100);
        c1.detalhes();
        System.out.println("----------------------------------------");
        ContaBanco c2 = new ContaBanco();
        c2.setDono("Marina");
        c2.setNumConta(969669);
        c2.abrirConta("CC");
        c2.depositar(600);
        c2.detalhes();
    }
    
}
