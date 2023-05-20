package ExercicioDois;

public class Funcionario {
    private String nome;
    private String dataAdmissao;
    private double salario;

     static int identificador =1;
    private int id;

    public Funcionario() {

        this.id = Funcionario.identificador++;

    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataAdmissao(String dataAdmissao) {
      /*
       String[] carct = dataAdmissao.split("/");
        if (carct.length == 3){
            for (int i = 0; i < carct.length; i++) {
                int date = Integer.parseInt(carct[i]);
                }
            }*/

        this.dataAdmissao = dataAdmissao;

    }


    public void setSalario(double salario) {
        if (salario < 700) {
            System.out.println("Salário inserido é inválido!");
            System.exit(0);
        } else {
            this.salario = salario;
        }
    }

    public void mostrarInfos() {

        System.out.println("ID: " + getId() + "\nNOME: " + getNome() + "\nData de Admissão: " + getDataAdmissao() + "\nSalário: " + getSalario());
        System.out.println("-----------------");

    }

}


