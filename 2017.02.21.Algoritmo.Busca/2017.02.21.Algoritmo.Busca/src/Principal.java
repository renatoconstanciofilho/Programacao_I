import javax.swing.JOptionPane;

public class Principal {

	private static int [][] matriz;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		matriz = new int[6][6];
		
		matriz[0][0]=7;
		matriz[0][1]=45;
		matriz[0][2]=56;
		matriz[0][3]=58;
		matriz[0][4]=456;
		matriz[0][5]=476;
		matriz[1][0]=489;
		matriz[1][1]=490;
		matriz[1][2]=762;
		matriz[1][3]=922;
		matriz[1][4]=980;
		matriz[1][5]=1023;
		matriz[2][0]=1024;
		matriz[2][1]=1872;
		matriz[2][2]=1987;
		matriz[2][3]=2012;
		matriz[2][4]=2013;
		matriz[2][5]=2014;
		matriz[3][0]=2015;
		matriz[3][1]=3498;
		matriz[3][2]=3987;
		matriz[3][3]=8722;
		matriz[3][4]=8900;
		matriz[3][5]=9000;
		matriz[4][0]=9500;
		matriz[4][1]=9600;
		matriz[4][2]=9872;
		matriz[4][3]=9900;
		matriz[4][4]=9999;
		matriz[4][5]=10000;
		matriz[5][0]=10001;
		matriz[5][1]=35522;
		matriz[5][2]=72822;
		matriz[5][3]=92882;
		matriz[5][4]=97652;
		matriz[5][5]=100012;
		
		int i = 0;
		int j = 0;
		
		String jop = JOptionPane.showInputDialog("Informe uma linha de 0 a " + (matriz.length-1));
		int ii = Integer.parseInt(jop);
		jop = JOptionPane.showInputDialog("Informe uma coluna de 0 a " + (matriz[0].length-1));
		int jj = Integer.parseInt(jop);
		System.out.println("Você selecionou a linha " + ii + " e coluna " + jj + " que contem o número " + matriz[ii][jj] );
		System.out.println("");
		
		int numero = matriz[ii][jj];
		
		long tempoInicial = System.currentTimeMillis();
		
		int linha = 0;
		int coluna = 0;

		loopBusca: for(int auxi=0;auxi<=(matriz.length-1);auxi++){
			for(int auxj=0;auxj<=(matriz[0].length-1);auxj++){
				if(matriz[auxi][auxj] == numero){
					System.out.println("O numero procurado " + matriz[auxi][auxj] + " está na linha " + auxi + " coluna " + auxj);
					System.out.println("Busca realizada em " + (System.currentTimeMillis() - tempoInicial) + "ms");
					break loopBusca;
				}
			}
		}
		


		
		
		
		
	}

}
