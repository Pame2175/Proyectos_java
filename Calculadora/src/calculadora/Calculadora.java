
package calculadora;

/**
 *
 
 */
public class Calculadora {
    //Atributos
 private String numero;
 private double resultado;
 private boolean suma;//almacenas los valores true o false 
 private boolean resta;
 private boolean multiplicacion;
 private boolean division;
 
 
 //constructores
    public Calculadora (){
        this.numero="";
        this.resultado=0;
        this.suma=false;
        this.resta=false;
        this.multiplicacion= false;
        this.division=false;

    }

    public String getNumero() {//obtienendo el valor de los datos
        return numero;
    }

    public void setNumero(String numero) {//inserta el valor del digito
        this.numero = numero;
    }
    public void agregarNumero(int num){
        setNumero(numero+num);
    }
 //diferencias entre metodos y funciones es:
    // el metodo realiza una operacion  
    //en cambio la funcion tambien los mismo pero te puede retornar el valor que estas necesitando
   public void suma (String num){ 
    this.resultado= Double.parseDouble(num);
    suma = true;
    setNumero("");
    }
    public void resta (String num){ 
    this.resultado= Double.parseDouble(num);
    resta = true;
    setNumero("");
    }
    public void mult (String num){ 
    this.resultado= Double.parseDouble(num);
    multiplicacion = true;
    setNumero("");
    }
    public void div (String num){ 
    this.resultado= Double.parseDouble(num);
    division = true;
    setNumero("");
 
    }
    //hacemos una funcion  
   public double resultados(String numero){
       if(suma==true){
           resultado= resultado + Double.parseDouble(numero);
       }
       if(resta==true){
           resultado= resultado - Double.parseDouble(numero);
       }
       if(multiplicacion==true){
           resultado= resultado * Double.parseDouble(numero);
       }
       if(division==true){
           resultado= resultado / Double.parseDouble(numero);
       }
       setNumero("");
       suma=false;
       resta=false;
       multiplicacion=false;
       division=false;
       return resultado;
   }

}