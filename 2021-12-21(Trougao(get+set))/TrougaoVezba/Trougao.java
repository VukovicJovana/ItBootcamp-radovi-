package TrougaoVezba;

public class Trougao {
      private double stranicaA;
       private double stranicaB;
      private double stranicaC;
  public Trougao(double stranicaA,double stranicaB,double stranicaC){
      this.stranicaA=stranicaA;
      this.stranicaB=stranicaB;
      this.stranicaC=stranicaC;

  }   public double getStranicaA(){
      return stranicaA;
    }  public void setStranicaA(double stranicaA){
      this.stranicaA=stranicaA;

    }public double getStranicaB(){
        return stranicaB;
    }  public void setStranicaB(double stranicaB){
        this.stranicaB= stranicaB;
}public double getStranicaC(){
        return stranicaC;
    }  public void setStranicaC(double stranicaC) {
        this.stranicaC=stranicaC;
    }
    public double obim(){
      double o= stranicaA+ stranicaB+stranicaC;
      return o;
    }
    public double povrsina(){
      double s=(stranicaA+stranicaB+stranicaC)/2;
      double x=s*(s-stranicaA)*(s-stranicaB)*(s-stranicaC);
      double p=Math.sqrt(x);
      return p;
    }
}