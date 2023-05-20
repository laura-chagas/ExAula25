package ExercicioUm;

public class Azul {

    private int tonalidade; //letra D - EXERCICIO 1

    public static String cor = "AZUL";

    public Azul(int tonalidade) {
        this.tonalidade = tonalidade;
    }

    public void setTonalidade(int tonalidade) {
        this.tonalidade = tonalidade; //letra D - EXERCICIO 1
    }
    public int getTonalidade() {
        return tonalidade;
    }
    public String getCor(){
        return cor;
    }

    public void tornarMaisEscuro() {
        if (tonalidade == 4) {
            System.out.println("LIMITE DE TONALIDADE ATINGIDO");
            System.exit(0);
        } else {
            tonalidade++;
            calcularTonalidade();
        }

    }

    public void tornarMaisClaro() {
        if (tonalidade == 1) {
            System.out.println("LIMITE DE TONALIDADE ATINGIDO");
            System.exit(0);
        } else {
            tonalidade--;
            calcularTonalidade();
        }

    }
    void calcularTonalidade() {
        if (tonalidade == 1) {
            System.out.println("---------------------------------");
            System.out.println(cor + " CLARO" + "- - TONALIDADE " + getTonalidade());
            System.out.println("---------------------------------");
        } else if (tonalidade == 2) {
            System.out.println("---------------------------------");
            System.out.println(cor + " MEDIO" + "- - TONALIDADE " + getTonalidade());
            System.out.println("---------------------------------");
        } else if (tonalidade == 3) {
            System.out.println("---------------------------------");
            System.out.println(cor + " ESCURO" + "- - TONALIDADE " + getTonalidade());
            System.out.println("---------------------------------");
        }else if (tonalidade == 4) {
            System.out.println("---------------------------------");
            System.out.println(cor + " MUITO ESCURO" + "- - TONALIDADE " + getTonalidade());
            System.out.println("---------------------------------");
        }
    }

    }
