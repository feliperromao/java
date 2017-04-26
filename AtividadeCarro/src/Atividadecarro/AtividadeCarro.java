
package Atividadecarro;


public class AtividadeCarro {

    public static void main(String[] args) {
        Carro gol = new Carro();
        System.out.println(gol.getVelocidadeAtual());
        
        Carro golQuadrado = gol;
        
        golQuadrado.setLigado(true);
        golQuadrado.acelera();
        System.out.println(gol.getVelocidadeAtual());
        System.out.println(gol.pegaMarcha());
    }
    
}
