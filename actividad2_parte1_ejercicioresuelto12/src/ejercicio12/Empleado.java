package ejercicio12;
public class Empleado {
    
        
    public static double obtener_salario(double nht, double vhn){
        
        double het, hee8;       
        if (nht>40) {
            het = nht-40;
       
            if (het>8){
                hee8=het-8;
                return 40*vhn+16*vhn+hee8*3*vhn;
            }
                
            else {
                return 40*vhn+het*2*vhn;
                    }
            
        }
        else {
            return nht*vhn;
        }
        
    }
}
