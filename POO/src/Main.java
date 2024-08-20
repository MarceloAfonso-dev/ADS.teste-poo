import br.com.senac.modelos.Aluno;
import br.com.senac.modelos.Horista;
import br.com.senac.modelos.Mensalista;

public class Main {
    public static void main(String[] args) {
        Horista prof1 = new Horista(
                "TI","001","Fulano",30.0,120);

        Mensalista prof2 = new Mensalista(
                "ADM","002","Ciclano",3000.0);

        System.out.printf("Salário prof1: R$ %.2f %n", prof1.calcularSalario());
        System.out.printf("Salário prof2: R$ %.2f %n", prof2.calcularSalario());

        Aluno aluna1 = new Aluno("Ana","0000001","TADS");
        double[] notas = {10.1, 7.8, 9.0,5.0};
        aluna1.atribuirNotas(prof1, notas);
        aluna1.calcularMedia();

        System.out.printf("Média do aluno1: %.2f %n", aluna1.getMedia());
    }
}