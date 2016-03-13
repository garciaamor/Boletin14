package boletin14;
public class ConversorTemperaturas {
    
    public final static float TLIMITE=80;
    public float faren,reamur;

    public float centigradosAFharenheit(float centi) throws TemperaturaErradaExcepcion{
        if (centi<TLIMITE)
            throw new TemperaturaErradaExcepcion(" a temperatura ten que ser maior de 80 ");
        else{          
        faren=(float)(9.0/5.0*centi+32);
        return faren;
        }
    }
    
    public void centigradosAReamur(float centi){
    
        try{
        reamur=(float)(4.0/5.0*centi);
              
        if (centi<TLIMITE){throw new TemperaturaErradaExcepcion();}
            System.out.println(" temperatura  : "+ reamur);
        }catch(TemperaturaErradaExcepcion e1){             
            
            System.out.println("erro2 "+ e1.getMessage());       
        } 
    }
    
  

}