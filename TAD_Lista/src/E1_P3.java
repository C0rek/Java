public class E1_P3 {
    public static void main(String[] args) {
        clsListaArr lista = new clsListaArr(4);
		for (int i=0;i<3;i++) {
			lista.insertaU(i);
		}
		lista.mostarLista();
		System.out.println();
		lista.insertaP(10);
		lista.mostarLista();
		System.out.println();

		clsListaArr listaInv = new clsListaArr(4);
		listaInv= lista.invertida();
		listaInv.mostarLista();
    }
    
}
