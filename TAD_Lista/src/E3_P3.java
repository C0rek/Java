public class E3_P3 {
    public static void main(String[] args) {
	
		clsListaArr l1 = new clsListaArr(7);
		for (int i=0;i<7;i++) {
			l1.insertaU(i);
		}
		clsListaArr l2 = new clsListaArr(2);
		for (int i=0;i<2;i++) {
			l2.insertaU(i);
		}
		l1.mostarLista();
		System.out.println();
		l2.mostarLista();
		System.out.println();
		System.out.println();
		if (l1.esprefijo(l2)) {
			System.out.println("Si es prefijo");
		}
		else {
			System.out.println("No es prefijo");
		}
	}
}
