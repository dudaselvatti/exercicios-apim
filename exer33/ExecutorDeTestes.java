package exer33;

import java.lang.reflect.Method;

public class ExecutorDeTestes {
   public static void executarTestes(Object obj){
    
    Class<?> clazz = obj.getClass();
    Method[] metodos = clazz.getDeclaredMethods();
    
    for (Method metodo : metodos) {
        if (metodo.isAnnotationPresent(Teste.class)) {
            try {
                System.out.println("Executando método: " + metodo.getName());
                metodo.invoke(obj);
            } catch (Exception e) {
                System.out.println("Erro ao executar o teste: " + metodo.getName());
                e.printStackTrace();
            }
        }
   } 
}
    public static void main(String[] args) {
          MinhaClasseDeTeste teste = new MinhaClasseDeTeste();
          executarTestes(teste);
     }
}
