public class ejercico_2 {
    private double Total_Ventas;
   private double Comision;
   private double Salario;
   private double Salario_Total;
   private double Renta;

    public double getTotal_ventas() {
        return Total_Ventas;
    }

    public void setTotal_ventas(double Total_Ventas) {
        this.Total_Ventas = Total_Ventas;
    }

    public double getComision() {
        return Comision;
    }

    public void setComision(double Comision) {
        this.Comision = Comision;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public double getSalario_Total() {
        return Salario_Total;
    }

    public void setSalario_Total(double Salario_Total) {
        this.Salario_Total = Salario_Total;
    }

    public double getRenta() {
        return Renta;
    }

    public void setRenta(double Renta) {
        this.Renta = Renta;
    }
   
    public double Calcular_Comision(double Total_Ventas){
     double Comision=0.0;
     if(Total_Ventas>=3000){
        Comision = Total_Ventas*0.10;
   }else if((Total_Ventas < 1000) && Total_Ventas>=2999){
         Comision=Total_Ventas*0.08;
     }
   else if((Total_Ventas>=1)&& (Total_Ventas< 999)){
         Comision=Total_Ventas*0.05;
     }
    this.setComision(Comision);
     return Comision;
}
  public  double Calcular_Salario(){
      double salario;
      Salario= 300 + this.getComision();
      this.setSalario(Salario);
      return Salario;
  }
  public double Calcular_Renta(){
      double Renta;
      Renta=this.getSalario()*0.10;
      this.setRenta(Renta);
      return Renta;
      
  }
  public double Calcular_SalarioTotal(){
      double SalarioTotal;
      SalarioTotal= this.getSalario()-this.getRenta();
      this.setSalario_Total(SalarioTotal);
      return SalarioTotal;
  }
   
}
    

