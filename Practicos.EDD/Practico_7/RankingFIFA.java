package Practico_7;

/*
Puntos = puntos por victoria(M)*importancia(I)*posicion del rival(T)*confederacion(C)
	 
M: 3 por victoria, 1 por empate, 0 por derrota - en penales:2 por victoria, 1 por derrota

I: amistoso 1, eliminatoria mundialista o en el ambito de la confederacion 2.5, competicion final de confederacion 
o copa FIFA confederaciones 3, competicion final de la copa mundial de la FIFA 4

T: 200 - puesto de la clasificacion de los contendientes (200 para el la cabeza, para puesto 150 y subsiguientes valor 50)

C: conmebol 1 , uefa 0.99, concacaf 0.85, afc 0.85, caf 0.85, ofc 0.85
*/
public class RankingFIFA extends clsListaOrdenada1 {
    public Object puntaje(RankingFIFA partidos, String seleccion){
        clsNode tempseleccion, temppuntos;
        float puntos=1, punto;
        if(!estaVacia()){
            tempseleccion=this.lista;
            temppuntos=partidos.lista;
            while(!tempseleccion.getNodeInfo().equals(seleccion)){
                tempseleccion=tempseleccion.getNextNode();
                for(int i=0; i<4; i++){
                    temppuntos.getNodeInfo();
                }
            }
            for(int i=0;i<4;i++){
                punto=(float) temppuntos.getNodeInfo();
                puntos=puntos*punto;
                temppuntos=temppuntos.getNextNode();
            }
        } else {
            System.out.println("Error muestra. Lista vacia");
        }
        return puntos;
    }

}
