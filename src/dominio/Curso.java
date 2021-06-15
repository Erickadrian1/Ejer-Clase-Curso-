
package dominio;


public class Curso {
    private double [] notas; 
    double promedio; 
    private int estudiantesEncimaPromedio;
    public Curso(){
        notas = new double [12]; 
    }
    public void setNotas(double notas[]){
        this.notas= notas;
    }
    public void mostrarNotas(){
        for(int i=0; i<12; i++){
            System.out.println(this.notas[i]);
        }
        
    }
    public double getPromedio(){
       return this.promedio ;  
    }
    public int nroEstudiantesEncimaPromedio(){
        return this.estudiantesEncimaPromedio;
    }
    public void setPromedio(double[] notas){
        double promedio = 0;
        double suma = 0; 
        for(int i=0; i<12; i++){
            double almacenado = notas [i];
            suma = almacenado + suma; //Mediante esto se sumaran los valores
            // registrados de 12 estudiantes 
        }
        promedio= suma/12;
        this.promedio = promedio;
}
    public void setEstudiantesEncimaPromedio(){
        int estudiantes = 0;
        double promedio = 0; 
        double suma=0;
            for(int i=0; i<12; i++){
                double almacenado = notas[i];
                suma = almacenado + suma; //Mediante esto se sumaran los valores
            // registrados de 12 estudiantes 
            }
            promedio= suma/12;
            for(int i=0; i<12; i++){
                if(notas[i]>promedio){
                    estudiantes= estudiantes+1;
            }
    }
            this.estudiantesEncimaPromedio = estudiantes; 
}
}