
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


/*
@author Felipe Romao

 */
public class TelaCadastro extends JFrame {
    private JLabel dadosPessoais;
    private JLabel nomeLabel;
    private JTextField nomeField;
    private JLabel cpfLabel;
    private JTextField cpfField;
    private JLabel sexoLabel;
    private JComboBox sexoList;
    private JLabel dataNasLabel;
    private JTextField dataNascField;
    private JLabel estCivilLabel;
    private JComboBox estCivilList;
    private JLabel enderecoLabel;
    private JTextField enderecoField;
    private JLabel bairroLabel;
    private JTextField bairroField;
    private JLabel cidadeLabel;
    private JTextField cidadeField;
    private JLabel telLabel;
    private JTextField telField;
    private JLabel dadosCurso;
    private JLabel cursoLabel;
    private JTextField cursoField;
    private JLabel turmaLabel;
    private JComboBox turmaList;
    private JLabel fezCursoLabel;
    private JComboBox fezCursoList;
    private JLabel quantCursosLabel;
    private JTextField quantCursosField;
    private JLabel quaisCursosLabel;
    private JTextField quaisCursosField;
    private JLabel dataUltimoCursoLabel;
    private JTextField dataUltimoCursoField;
    
    
    public TelaCadastro(){
        super("Cadastro de aluno");
        setLayout(new FlowLayout());
        
        dadosPessoais = new JLabel("Dados Pessoais");
        dadosPessoais.setFont(new Font("Arial", Font.BOLD,30));
        add(dadosPessoais);
        
        nomeLabel = new JLabel("Nome:");
        add(nomeLabel);
        
        nomeField = new JTextField(18);
        add(nomeField);
        
        cpfLabel = new JLabel("CPF:   ");
        add(cpfLabel);
        
        cpfField = new JTextField(18);
        add(cpfField);
        
        sexoLabel = new JLabel("Sexo:");
        add(sexoLabel);
        
        sexoList = new JComboBox();
        sexoList.addItem("M");
        sexoList.addItem("F");
        add(sexoList);
        
        dataNasLabel = new JLabel("Data de Nasc: ");
        add(dataNasLabel);
        
        dataNascField = new JTextField(6);
        add(dataNascField);
        
        estCivilLabel = new JLabel("Estado Civil: ");
        add(estCivilLabel);
        
        estCivilList = new JComboBox();
        
        estCivilList.addItem("Solteiro                           ");
        estCivilList.addItem("Casado");
        estCivilList.addItem("Divorciado");
        add(estCivilList);
        
        enderecoLabel = new JLabel("Endereço:");
        add(enderecoLabel);
        
        enderecoField = new JTextField(18);
        add(enderecoField);
        
        bairroLabel = new JLabel("Bairro:");
        add(bairroLabel);
        
        bairroField = new JTextField(7);
        add(bairroField);
        
        cidadeLabel = new JLabel("Cidade:");
        add(cidadeLabel);
        
        cidadeField = new JTextField(7);
        add(cidadeField);
        
        telLabel = new JLabel("Tel:");
        add(telLabel);
        
        telField = new JTextField(10);
        add(telField);
        
        dadosCurso = new JLabel("Dados do Curso");
        dadosCurso.setFont(new Font("Arial", Font.BOLD,30));
        add(dadosCurso);
        
        cursoLabel = new JLabel("Curso:");
        add(cursoLabel);
        
        cursoField = new JTextField(8);
        add(cursoField);
        
        turmaLabel = new JLabel("Turma:");
        add(turmaLabel);
        
        turmaList = new JComboBox();
        turmaList.addItem("Manhã");
        turmaList.addItem("Tarde");
        turmaList.addItem("Noite");
        add(turmaList);
        
        fezCursoLabel = new JLabel("Ja fez curso na UTD?");
        add(fezCursoLabel);
        
        fezCursoList = new JComboBox();
        fezCursoList.addItem("Sim");
        fezCursoList.addItem("Não");
        add(fezCursoList);
        
        quantCursosLabel = new JLabel("Quantos cursos?");
        add(quantCursosLabel);
        
        quantCursosField = new JTextField(6);
        add(quantCursosField);
        
        quaisCursosLabel = new JLabel("Quais cursos ja fez?");
        add(quaisCursosLabel);
        
        quaisCursosField = new JTextField(23);
        add(quaisCursosField);
        
        dataUltimoCursoLabel = new JLabel("Quando?");
        add(dataUltimoCursoLabel);
        
        dataUltimoCursoField = new JTextField(8);
        add(dataUltimoCursoField);
    }
}
