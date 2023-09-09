package com.example.base.model;

import com.example.base.util.PersonaUtil;

public class Persona {

    private String nombre = "";
    private Byte edad = 0;

    private String nss;
    private Character sexo = PersonaUtil.HOMBRE;

    private Short peso = 0;

    private Float altura = 0f;

    public Persona(String nombre, Byte edad, Character sexo, Short peso, Float altura) {
        this.nombre = nombre;
        this.edad = edad;
        if (comprobarSexo(sexo)) {
            this.sexo = sexo;
        }
        this.peso = peso;
        this.altura = altura;
        this.nss = generaNSS();
    }

    public short calcularIMC() {
        double pesoIdeal = peso / Math.pow(altura, 2);
        if (PersonaUtil.esFaltaPeso(pesoIdeal, sexo)) {
            return PersonaUtil.FALTA_PESO;
        }
        if (PersonaUtil.esSobrepeso(pesoIdeal, sexo)) {
            return PersonaUtil.SOBREPESO;
        }
        return PersonaUtil.NORMAL;
    }

    public boolean esMayorDeEdad() {
        return edad >=  18;
    }

    private boolean comprobarSexo(char sexo) {
        return sexo == PersonaUtil.MUJER || sexo == PersonaUtil.HOMBRE;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nss='" + nss + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    private String generaNSS() {
        return PersonaUtil.generarCadenaRandom(8);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Byte getEdad() {
        return edad;
    }

    public void setEdad(Byte edad) {
        this.edad = edad;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Short getPeso() {
        return peso;
    }

    public void setPeso(Short peso) {
        this.peso = peso;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }
}
