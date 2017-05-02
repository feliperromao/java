

/**
 *
 * @author Felipe Romao
 */
public class Data {
    int dia, mes,ano;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String mostrarData(){
        String dt = this.getDia()+"/"+this.getMes()+"/"+this.getAno();
        return dt;
    }
}
