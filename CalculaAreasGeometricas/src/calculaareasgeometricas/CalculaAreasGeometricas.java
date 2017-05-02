
package calculaareasgeometricas;

/**
 *
 * @author Felipe Romao
 */
public class CalculaAreasGeometricas {
    public static class FiguraGeometrica { //Definição da classe FiguraGeometrica
    
    //Implementação do método que ira retornar a area do quadrado
    public float areaQuadrado(float lado){
        return lado*lado;
    }
    //Implementação do método que ira retornar a area do retangulo
    public float areaRetangulo(float lado1, float lado2){
        return lado1*lado2;
    }
    ////Implementação do método que ira retornar a area do circulo
    public float areaCirculo(float raio){
        return (float) (3.14*raio*raio);
    }
}//Fim da classe FiguraGeometrica
    
    public static void main(String[] args) { //Inicio do método principal do programa
        
        //criando um objeto quadrado tipo FiguraGeometrica
        FiguraGeometrica quadrado = new FiguraGeometrica();
        //Imprimindo na tela a área do quadrado concatenado com uma string
        System.out.println("Área do quadrado: "+quadrado.areaQuadrado(5));
        
        //criando um objeto retagulo tipo FiguraGeometrica
        FiguraGeometrica retagulo = new FiguraGeometrica();
        //Imprimindo na tela a área do retagulo concatenado com uma string
        System.out.println("Área do retagulo: "+quadrado.areaRetangulo(5, 6));
        
        //criando um objeto circulo tipo FiguraGeometrica
        FiguraGeometrica circulo = new FiguraGeometrica();
        //Imprimindo na tela a área do circulo concatenado com uma string
        System.out.println("Área do retagulo: "+quadrado.areaCirculo(2));
    }
}

