package exer32;

import java.lang.reflect.Field;

public class teste {
    public static void main(String[] args) {
        Configuracao config = new Configuracao();

        try{
            Field campo = config.getClass().getDeclaredField("urlConexao");
            campo.setAccessible(true);
            campo.set(config, "db.producao.com:5432");
            System.out.println("Valor atualizado do campo urlConexao: " + campo.get(config));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
