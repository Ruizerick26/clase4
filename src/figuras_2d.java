public class figuras_2d {
    //areas y perimetros

    //atributos
    int nlados;//número de datos
    float lado;//longitud de lado
//CONSTRUCTOR
    public figuras_2d(int nlados,float lado) {
        this.nlados = nlados;
        this.lado = lado;
    }
//SETTER Y GETTER DE lado
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
//SETTER Y GETTER DE nlados
    public int getNlados() {
        return nlados;
    }

    public void setNlados(int nlados) {
        this.nlados = nlados;
    }
//FUNCIONES
    public float areacuadrado(int lado){
        return this.lado*this.lado;
    }
    private float perimetrocuadrado(){
        return 0;
    }
    public float areatriangulo(){
        return  0;
    }
    private float perimetrotirangulo(){
        return 0;
    }

}
