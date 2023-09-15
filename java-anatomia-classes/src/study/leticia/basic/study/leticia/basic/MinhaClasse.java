
package study.leticia.basic;
    public class MinhaClasse {
    public static void main(String[] args) {
       

        int ano = 2023; // Declaração de variável

        final String BR = "Brasil"; // Declaraçao de constante

        // Variáveis e métodos

        // Declarando variáveis

        int x = 15;
        double y = 3.5;
        String meuNome = "Leticia";
        boolean coffee = false;

        String firstName = "Ana";
        String lastName = "Carvalho";
        
        String nomeCompleto = nomeCompleto(firstName, lastName);
        
        System.out.println(nomeCompleto);

    }
    
    public static String nomeCompleto(String fisrtName, String lastName) {
        return fisrtName.concat(" ").concat(lastName);
    }

    
}

