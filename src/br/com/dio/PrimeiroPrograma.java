package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);
        Livro livro = new Livro("O misterio dos 3 corpos", "Lais Leite");
        System.out.println(livro);

    }
}

    class Livro {
        private String título;
        private String autor;

        public Livro(String título, String autor) {
            this.título = título;
            this.autor = autor;
        }

        public String getTítulo() {
            return título;
        }

        public void setTítulo(String título) {
            this.título = título;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "título='" + título + '\'' +
                    ", autor='" + autor + '\'' +
                    '}';
        }


    }

