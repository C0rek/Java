public class E5_P3 {
    public static void main(String[] args) {
        clsListaArr l1 = new clsListaArr(10);
	    int dato=5;
	    for (int i=0;i<3;i++) {
		    l1.insertaU(dato);
		    dato = dato+1;
	}
	
        l1.mostarLista();
	    clsListaArr l2 = new clsListaArr(14);
	    l2.insertaU(7);
	    l2.insertaU(5);
	    l2.insertaU(8);
	    l2.insertaU(10);
	    l2.insertaU(3);
	    l2.insertaU(7);
	    l2.insertaU(11);
	    l2.insertaU(10);		
	    l2.mostarLista();
		
	    System.out.println();
	    int resultado=l1.letrascomunes(l2);
	    System.out.println(resultado);        
    }
}
