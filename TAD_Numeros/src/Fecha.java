public class Fecha{
    private int dia;
	private int mes;
	private int año;
	
	public Fecha(){
		año=0;
		mes=0;
		dia=0;
	}

	public Fecha(int d,int m,int a){
		setAño(a);
		setMes(m);
		setDia(d);
	}

	public boolean setAño(int a){
		if (a>0){
			año = a;
			return true;
		}
		else{
			return false;
		}
	}

	public boolean setMes(int m){
		if (((m>0) && (m<13))){
			mes=m;
			return true;
		}
		else{
			return false;
		}
	}

	public boolean setDia(int d){
		int k=getMes();
		switch (k){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if ((d>0)&&(d<32)){
				dia=d;
				return true;
			}
		case 4: case 6: case 9: case 11:
			if ((d>0)&&(d<31)){
				dia=d;
				return true;
			}
		case 2:
			if ((d>0)&&(d<29)){
				dia = d;
				return true;
			}
		default:
			return false;
		}
	}

	public int getDia(){
		return dia;
	}
	
	public int getMes(){
		return mes;
	}
	public int getAño(){
		return año;
	}

	public Fecha sumaDias(Fecha f, int s){
		int a=f.getAño();
		int d=f.getDia();
		int m=f.getMes();

		while (s!=0){
			switch (m){
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:{
					dia=s-(31-d);
					d=0;
				}
				case 4: case 6: case 9: case 11:{
					dia=s-(30-d);
					d=0;
				}
				case 2:{
					dia=s-(28-d);
					d=0;
				}
				default:{
					System.out.println("Fecha invalida");
					break;
				}
			}
			if (m==12){
				a=a+1;
				m=1;	
			} else {
				m=m+1;
			}
			if (d<0){
				d=d*(-1);
				s=0;
			}
		}
	Fecha f2=new Fecha(dia,m,a);
	return f2;
	}
    
	public int difFechas(Fecha f1, Fecha f2){
		int m=f1.getMes();
		int d=f1.getDia();
		int m2=f2.getMes();
		int d2=f2.getDia();
		int s=0;
		if ((m==1)||(m==3)||(m==5)||(m==7)||(m==8)||(m==10)||(m==12)){
			s=s + (31-d);
		}
		else if ((m==4)||(m==6)||(m==9)||(m==11)){
			s=s + (30-d);
		}
		else if (m==2){
			s=s + (28-d);
		}
		m=m+1;
		int difa=(f2.getAño())-(f1.getAño());
		if (difa>=2){
			s=(difa-1)*365;
		}
		for (int i=m; i<13; i++){
			if ((i==1)||(i==3)||(i==5)||(i==7)||(i==8)||(i==10)||(i==12)){
				s=s+31;
			}
			else if ((i==4)||(i==6)||(i==9)||(i==11)){
				s=s+30;
			}
			else if (i==2){
				s=s+28;
			}
		}
		s=s+d2;
		m2=m2-1;
		for (int i=m2; i>0; i--){
			if ((i==1)||(i==3)||(i==5)||(i==7)||(i==8)||(i==10)||(i==12)){
				s=s+31;
			}
			else if ((i==4)||(i==6)||(i==9)||(i==11)){
				s=s+30;
			}
			else if (i==2){
				s=s+28;
			}
		}
		return s;
	}
}
