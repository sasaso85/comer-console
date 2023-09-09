package com.example.base.util;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class PersonaUtil {
    public static final Character HOMBRE = 'H';
    public static final Character MUJER = 'M';
    public static final Short FALTA_PESO = -1;
    public static final short SOBREPESO = 1;

    private static final Map<Character, Short> VALORES_SOBREPESO = new HashMap<>();
    private static final Map<Character, Short> VALORES_FALTA_PESO = new HashMap<>();
    public static final short NORMAL = 0;

    static {
        VALORES_SOBREPESO.put(HOMBRE, (short) 25);
        VALORES_SOBREPESO.put(MUJER, (short) 24);

        VALORES_FALTA_PESO.put(HOMBRE, (short) 20);
        VALORES_FALTA_PESO.put(MUJER, (short) 19);
    }

    public static boolean esSobrepeso(double pesoIdeal, Character sexo) {
        return pesoIdeal > VALORES_SOBREPESO.get(sexo);
    }

    public static boolean esFaltaPeso(double pesoIdeal, Character sexo) {
        return pesoIdeal < VALORES_FALTA_PESO.get(sexo);
    }

    private static final String CARACTERES = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final Random RANDOM = new Random();

    public static String generarCadenaRandom(int tamanio) {
        return RANDOM.ints(tamanio, 0, CARACTERES.length())
                .mapToObj(CARACTERES::charAt)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }
}
