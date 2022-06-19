public class Depreciacion_Maquinaria {
    double costoM;
    String nombreM;
    double tiempoD;
    double V = 5;

    public Depreciacion_Maquinaria() {
    }

    public double getCostoM() {
        return costoM;
    }

    public void setCostoM(double costoM) {
        this.costoM = costoM;
    }

    public String getNombreM() {
        return nombreM;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    public double getTiempoD() {
        return tiempoD;
    }

    public void setTiempoD(double tiempoD) {
        this.tiempoD = tiempoD;
    }

    public double getV() {
        return V;
    }

    public void setV(double V) {
        this.V = V;
    }

    public Depreciacion_Maquinaria(double costoM, String nombreM, double tiempoD) {
        this.costoM = costoM;
        this.nombreM = nombreM;
        this.tiempoD = tiempoD;
    }
    
    //Formula (V(V+1))/2
    
    public double formula() {
        double Formula;
         double V = 5;
         double For;
         double form;
         double valor;
        Formula = (V + 1);
        For = (V + Formula);
        form = (V / For);
        
        valor = (this.costoM * form);
        return valor;
        
    }
}
    

