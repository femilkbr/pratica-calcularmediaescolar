    package sistemaescolar;

       public class Aluno extends Pessoa {

        private double[][] notasDisciplina;
        public double[] mediaDisciplina;
        private String[] disciplinas;

        //Getters and setters

        //public String[] getDisciplinas() {return disciplinas; }

        public void setDisciplinas(String[] disciplinas) {
            this.disciplinas = disciplinas;
        }

        //public double[][] getNotasDisciplina() { return notasDisciplina; }

        public void setNotasDisciplina(double[][] notasDisciplina) {
            this.notasDisciplina = notasDisciplina;
        }

       // public double[] getMediaDisciplina() { return mediaDisciplina;        }

        //public void setMediaDisciplina(double[] mediaDisciplina) {     this.mediaDisciplina = mediaDisciplina; }

        //Métodos

        public double[] mediaDisciplina() {

            double media;
            String disciplina;
            double mediaDisciplina[] = {0, 0, 0, 0};

            for (int i = 0; i < notasDisciplina.length; i++) {
                double soma = 0;
                for (int j = 0; j < notasDisciplina[i].length; j++) {
                    soma += notasDisciplina[i][j];
                }
                media = soma / 3;
                mediaDisciplina[i] = media;
                disciplina = disciplinas[i];
                if (mediaDisciplina[i] > 7.0){
                    System.out.printf("Média da disciplina %s = %.02f --> Status Aprovado", disciplina, media);
                    System.out.println();
                } else { System.out.printf("Média da disciplina %s = %.02f --> Status Reprovado", disciplina, media);
                System.out.println();
                }
            }
            return mediaDisciplina;
        }
}
