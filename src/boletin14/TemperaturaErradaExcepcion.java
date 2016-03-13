package boletin14;


public class TemperaturaErradaExcepcion extends Exception {
    public TemperaturaErradaExcepcion(){
        super("mensaxe por defecto:temperatura ten que ser naior que 80ºC");
    }
    public TemperaturaErradaExcepcion(String mensaxe){
        super(mensaxe);
    }
}
