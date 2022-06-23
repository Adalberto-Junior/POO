package Aula8.EX1;

public class empresa {
    public static void main(String[] args){
        AluguerViatura alv = new AluguerViatura("Rentcar", "3810-193", "adalberto.rosario@ua.pt", 10);
		int aux[] = new int [10], max = 0;
		//Viatura b = new AutomovelLigeiroEletrico("p:90-xt-91", "Ferrari", "390", 20090, 25, 119);
		//Viatura c = new PesadoPassageirosEletrico("X:tZ-35-PR", "HONDA", "ZT", 125, 8, 3434, 12342);
    
		for(int i = 0; i < 10; i++){
            alv.setCar(randViatura());
        }
        System.out.println("Nome: " + alv.getNome() + "Codigo Postal: " + alv.getCPostal());
        if(alv.getEmail().equals("adalberto.rosario@ua.pt")){
            alv.setEmail("adalberton2ta@gmail.com");
        }
        System.out.println(alv);
        for(int i = 0; i < 10; i++){
            System.out.println(alv.getACar(i));
        }
		for(int i = 0; i < 10; i++){
			int rand = (int)(Math.random() * 100);
			// fazer mais uma for para colocar  mais de um trajeto em cada posição do car;
			for(int j = 0; j < 10; j++){
				alv.trajeto(rand, i);
				
			}
		}
		for(int j = 0; j < 10; j++){
			System.out.println(alv.distancia(j));
		}
		for(int j = 0; j < 10; j++){
			System.out.println(alv.ultimoTrajeto(j));
		}
		for(int i = 0; i < 10; i++){
			aux[i] = alv.maxtrajeto(i);
		}
		for(int i = 0; i < 10; i++){
			//int max = 0;
			if(max < aux[i])
			   max = aux[i];
		}
		for(int i = 0; i < 10; i++){
			if(max == alv.maxtrajeto(i))
			  System.out.println( " A viatura com maior quilómetros percorridos é: " + alv.getACar(i) + "com " + max + "Km");
		}
    }
    public static Viatura randViatura() {
		Viatura res = null;
		switch ((int) (Math.random() * 5)) {
		case 0:
			res = new AutomovelLigeiro("p:23-xr-90", "Ferrari", "350", 2000, 24, 39);
			break;
		case 1:
			res = new Taxi("S:54-dr-67", "XL", "12k", 345, 10, 12, 23);
			break;
		case 2:
			res = new PesadoDePassageiro("A:ty-34-pa", "HONDA", "LZ", 123, 6, 345, 1234);
			break;
		case 3:
			res = new Motociclo("STP:00-14-ER", "TOYOTA", "PK", "Estrada", 675);
			break;
        case 4:
			res = new PesadoDeMercadoria("STP:13-34 S", "TOYOTA", "PX", 234, 134, 9800, 100000);
			break;
		}
		return res;
	}
    
}
