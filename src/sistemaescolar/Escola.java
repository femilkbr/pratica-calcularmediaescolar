package sistemaescolar;

public class Escola {

    public static void main(String[] args){

        Professor prof = new Professor(); //instanciando o Professor
        prof.setNome("Sérgio");
        prof.setSobrenome("Maurício");
        prof.setSalariobase(3000);
        prof.setNumeroTurmas(4);

        Aluno aluno = new Aluno(); //instanciando o Aluno
        aluno.setNome("Fernanda");
        aluno.setSobrenome("Lima");
        aluno.setNotasDisciplina(new double[][]{
                {10, 9.7, 4.7}, //Português
                {9, 5.7, 7.7}, // Matemática
                {5, 9.7, 4.7}, //História
                {10, 5, 4.7} //Educação Física
        });
        aluno.setDisciplinas(new String[] {"Português", "Matemática", "História", "Educação Física"});

        System.out.println("Vamos imprimir as informações escolares:");
        prof.calculoSalario();
        System.out.printf("O professor %s %s receberá %d turmas e um salário de R$%.02f",
                prof.getNome(), prof.getSobrenome(), prof.getNumeroTurmas(), prof.getSalarioAtual());
        System.out.println();
        System.out.println();
        System.out.printf("O aluno %s %s tem como médias:",aluno.getNome(), aluno.getSobrenome());
        System.out.println();
        aluno.mediaDisciplina();//chamada do método média

    }

}
