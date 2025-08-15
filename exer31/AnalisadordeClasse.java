package exer31;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class AnalisadordeClasse {
    public static void inspecionar(Object obj){
        Class<?> classe = obj.getClass(); 

        Method[] metodos = classe.getDeclaredMethods();
        Field[] atributos = classe.getDeclaredFields();

        System.out.println("Classe: " + classe.getName());
        System.out.println("Nome simples da classe: " + classe.getSimpleName());

        System.out.println("Métodos da classe " + classe.getSimpleName() + ":");
        for (Method metodo : metodos) {
            System.out.println("- " + metodo.getName() + " (Retorno: " + metodo.getReturnType().getSimpleName() + ")");
        }

        System.out.println("Atributos da classe " + classe.getSimpleName() + ":");
        for (Field atributo : atributos) {
            System.out.println("- " + atributo.getName() + " : " + atributo.getType().getSimpleName() + " (" + Modifier.toString(atributo.getModifiers()) + ")");
        }
    }
}
