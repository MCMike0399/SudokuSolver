
public class SudokuProyecto {
	
	    private Conjunto[] filas;
	    private Conjunto[] columnas;
	    private Conjunto[] cuadros;
	    public  int[][] m;
	    private int[] posFin;
	    private long cont;
	    private Conjunto[] filasAux, columnasAux;
	    private Conjunto[][] cuadrosAux;
	    
	    public SudokuProyecto(int[][] matriz){
	        m=matriz;
	        cont = 0;
	        filas= new Conjunto[9];
	        columnas= new Conjunto[9];
	        cuadros= new Conjunto[9];
	        posFin= new int[2];
	        filasAux = new Conjunto[9];
	        columnasAux = new Conjunto[9];
	        cuadrosAux = new Conjunto[3][3];
	        for(int i=0; i<=8;i++){
	            Conjunto p= new Conjunto();
	            filas[i]=p;
	        }
	        for(int j=0;j<=8;j++){
	            Conjunto col= new Conjunto();
	            columnas[j]=col;
	        }
	        for(int k=0;k<=8;k++){
	            Conjunto l=new Conjunto();
	            cuadros[k]=l;
	        }
	        for(int i =0; i<m.length;i++){
	            for(int j=0;j<m.length;j++){
	                if(m[i][j]==0){
	                    posFin[0]=i;
	                    posFin[1]=j;
	                }
	            }
	        }
	        llenaConj();
	        inicializaConjunto();
	        llenaConjunto();
	    }
	    public void inicializaConjunto() {
			for(int i=0; i<9; i++) {
				filasAux[i] = new Conjunto();
				columnasAux[i] = new Conjunto();
			}
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					cuadrosAux[i][j] = new Conjunto();
				}
			}
		}
		public void llenaConjunto() {
			for(int i=0; i<9; i++) {
				for(int j=1; j<=9; j++) {
					filasAux[i].add(j);
					columnasAux[i].add(j);
				}
			}
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					for(int k=1; k<=9; k++) {
						cuadrosAux[i][j].add(k);
					}
				}
			}
		}
		public boolean checaRepetidos() {
			int coord=0, fila, columna, filaCuadro, columnaCuadro;
			Conjunto aux = new Conjunto();
			while(coord<81) {
				fila = coord/9;
				columna = coord/9;
				filaCuadro = coord/9;
				columnaCuadro = coord%9;
				aux = aux.interseccion(filasAux[fila], columnasAux[columna]);
				aux = aux.interseccion(cuadrosAux[filaCuadro][columnaCuadro], aux);
				if(aux.contains(m[coord/9][coord%9])) {
					eliminaEnConjunto(m[coord/9][coord%9], coord);
				}
				else {
					llenaConjunto();
					return false;
				}
				coord++;
			}
			return true;
		}
		public void eliminaEnConjunto(int num, int coord) {
			int fila=coord/9, columna=coord%9;
			int cuadranteFila=fila/3, cuadranteColumna=columna%3;
			filasAux[fila].remove(num);
			columnasAux[columna].remove(num);
			cuadrosAux[cuadranteFila][cuadranteColumna].remove(num);
		}
	    public boolean llenaConj(){
	        int i=0;
	        boolean res1=true;
	        while (i<m.length&& res1==true){
	            int j=0;
	            boolean res2=true;
	            while(j<m.length&&res2==true){
	                if(m[i][j]!=0){
	                    res1=filas[i].add(m[i][j]);
	                    res2=columnas[j].add(m[i][j]);
	                    
	                }
	                j++;
	            }
	            if (res2==false)
	                return false;
	            i++;
	        }
	        if (res1==false)
	            return false;
	        int k=0;
	        boolean res3=true;
	        while (k<m.length&& res3==true){
	            int l=0;            
	            while(l<m.length&&res3==true){
	                if(m[k][l]!=0){
	                    if((k>=0 && k<3 )&&(l>=0 && l<3))
	                        res3=cuadros[0].add(m[k][l]);
	                    else if((k>=3 && k<6 )&&(l>=0 && l<3))
	                        res3=cuadros[1].add(m[k][l]);
	                    else if((k>5 && k<9 )&&(l>=0 && l<3))
	                        res3=cuadros[2].add(m[k][l]);
	                    else if((k>=0 && k<3 )&&(l>2 && l<6))
	                        res3=cuadros[3].add(m[k][l]);
	                    else if((k>2 && k<6 )&&(l>2 && l<6))
	                        res3=cuadros[4].add(m[k][l]);
	                    else if((k>5 && k<9 )&&(l>2 && l<6))
	                        res3=cuadros[5].add(m[k][l]);
	                    else if((k>=0 && k<3 )&&(l>5 && l<9))
	                        res3=cuadros[6].add(m[k][l]);
	                    else if((k>2 && k<6 )&&(l>5 && l<9))
	                        res3=cuadros[7].add(m[k][l]);
	                    else if((k>5 && k<9 )&&(l>5 && l<9))
	                        res3=cuadros[8].add(m[k][l]);
	                }
	                l++;
	            }
	            k++;
	        }
	        return res3;
	    }
	    public boolean resuelve(){
	        boolean done=false;
	        int n=1;
	        if(m[0][0]==0){
	           while(!done && n<=9){
	                done=resuelve(0, 0, n);
	                if(m[0][0]==n&& !done)
	                    quita(0,0,n);
	                n++;
	            } 
	        }
	        else{
	            int[] pos=buscaSig(0, 0);
	            if(pos[0]==-1)
	                return false;
	            else{
	                n=1;
	                while(!done && n<=9){
	                    done=resuelve(pos[0], pos[1], n);
	                    if(m[pos[0]][pos[1]]==n&& !done)
	                        quita(pos[0],pos[1],n);
	                    n++;
	                }
	                if(!done){
	                    n=m[pos[0]][pos[1]];
	                    quita(pos[0],pos[1],n);
	                }
	            }
	        }
	        
	        return done;
	    }
	    private boolean resuelve(int i, int j, int n){
	    	if(cont>100000000) {
	    		return false;
	    	}
	        boolean done=false;
	        if(m[i][j]==0|| m[i][j]==n-1){
	            if(!contiene(i, j, n))
	                coloca(i,j,n);
	            else
	                return false;
	        }
	        if(i==posFin[0]&&j==posFin[1])
	            return true;
	        int[] pos=buscaSig(i, j);
	        if(pos[0]==-1)
	            return false;
	        else{
	            i=pos[0];
	            j=pos[1]; 
	            n=1;
	            while(!done && n<=9){
	                cont++;
	                done=resuelve(i, j, n);
	                if(m[i][j]==n&& !done)
	                    quita(i,j,n);
	                n++;
	            }
	            if(!done){
	                n=m[i][j];
	                quita(i,j,n);
	            }
	        }
	        return done;
	    }    
	    public boolean siSePuedeResolver(String cad) {
	    	if(cad.length()>81) {
	    		return false;
	    	}
	    	for(int i=0; i<9; i++) {
	    		for(int j=0; j<9; j++) {
	    			if(m[i][j] < 0 ) {
	    				return false;
	    			}
	    		}
	    	}
	    	return true;
	    }
	    
	    public void eliminaNumero(int num, int coord) {
			int fila=coord/9, columna=coord%9;
			int cuadranteFila=fila/3, cuadranteColumna=columna%3;
			filasAux[fila].remove(num);
			columnasAux[columna].remove(num);
			cuadrosAux[cuadranteFila][cuadranteColumna].remove(num);
		}
	    private void quita(int i, int j, int n){
	        if(m[i][j]!=0){
	            filas[i].remove(n);
	            columnas[j].remove(n);
	            if((i>=0 && i<3 )&&(j>=0 && j<3))
	                cuadros[0].remove(n);
	            else if((i>=3 && i<6 )&&(j>=0 && j<3))
	                cuadros[1].remove(n);
	            else if((i>5 && i<9 )&&(j>=0 && j<3))
	                cuadros[2].remove(n);
	            else if((i>=0 && i<3 )&&(j>2 && j<6))
	                cuadros[3].remove(n);
	            else if((i>2 && i<6 )&&(j>2 && j<6))
	                cuadros[4].remove(n);
	            else if((i>5 && i<9 )&&(j>2 && j<6))
	                cuadros[5].remove(n);
	            else if((i>=0 && i<3 )&&(j>5 && j<9))
	                cuadros[6].remove(n);
	            else if((i>2 && i<6 )&&(j>5 && j<9))
	                cuadros[7].remove(n);
	            else if((i>5 && i<9 )&&(j>5 && j<9))
	                cuadros[8].remove(n);
	            m[i][j]=0;
	        }
	        
	    }
	    private void coloca(int i, int j, int n){
	        m[i][j]=n;
	        filas[i].add(n);
	        columnas[j].add(n);
	        if((i>=0 && i<3 )&&(j>=0 && j<3))
	            cuadros[0].add(n);
	        else if((i>=3 && i<6 )&&(j>=0 && j<3))
	            cuadros[1].add(n);
	        else if((i>5 && i<9 )&&(j>=0 && j<3))
	            cuadros[2].add(n);
	        else if((i>=0 && i<3 )&&(j>2 && j<6))
	            cuadros[3].add(n);
	        else if((i>2 && i<6 )&&(j>2 && j<6))
	            cuadros[4].add(n);
	        else if((i>5 && i<9 )&&(j>2 && j<6))
	            cuadros[5].add(n);
	        else if((i>=0 && i<3 )&&(j>5 && j<9))
	            cuadros[6].add(n);
	        else if((i>2 && i<6 )&&(j>5 && j<9))
	            cuadros[7].add(n);
	        else if((i>5 && i<9 )&&(j>5 && j<9))
	            cuadros[8].add(n);
	        	
	    }
	    private int[] buscaSig(int i, int j){
	        int[] pos= new int[2];
	        for(int h=i; h<m.length;h++){
	            for(int g=j; g<m.length;g++){
	                if(m[h][g]==0){
	                    pos[0]=h;
	                    pos[1]=g;
	                    return pos;
	                }
	            }
	            j=0;
	        }
	        pos[0]=-1;
	        pos[1]=-1;
	        return pos;
	    }
	    
	    private boolean contiene(int i, int j, int n){
	        boolean resp= false;
	        if(filas[i].contains(n)){
	            return true;
	        }
	        if(columnas[j].contains(n)){
	            return true;
	        }
	        if((i>=0 && i<3 )&&(j>=0 && j<3))
	            resp=cuadros[0].contains(n);
	        else if((i>=3 && i<6 )&&(j>=0 && j<3))
	            resp=cuadros[1].contains(n);
	        else if((i>5 && i<9 )&&(j>=0 && j<3))
	            resp=cuadros[2].contains(n);
	        else if((i>=0 && i<3 )&&(j>2 && j<6))
	            resp=cuadros[3].contains(n);
	        else if((i>2 && i<6 )&&(j>2 && j<6))
	            resp=cuadros[4].contains(n);
	        else if((i>5 && i<9 )&&(j>2 && j<6))
	            resp=cuadros[5].contains(n);
	        else if((i>=0 && i<3 )&&(j>5 && j<9))
	            resp=cuadros[6].contains(n);
	        else if((i>2 && i<6 )&&(j>5 && j<9))
	            resp=cuadros[7].contains(n);
	        else if((i>5 && i<9 )&&(j>5 && j<9))
	            resp=cuadros[8].contains(n);
	        return resp;
	    }
	    public int[][] devuelveM(){
	        return m;
	    }
	    public int validate(String num){
	        if (!num.matches("\\d{1}"))
	            return 0;
	        else return Integer.parseInt(num);
	    }
	    public boolean valid(){
	        boolean res=true;
	        int num=0;
	        for(int i=0;i<9;i++)
	            for (int j=0;j<9;j++){
	                if (m[i][j]!=0){
	                    num=m[i][j];
	                    if (contiene(i,j,num))
	                        return false;
	                }                    
	            }
	        return res;
	    }
	    public void imprimeMatriz(){
	        for(int i=0; i<9;i++){
	            for(int j=0; j<9;j++){
	                System.out.print(m[i][j]+" ");
	            }
	            System.out.println("");
	        }
	    }
	    public String toString() {
	        String result = "\n";
	        for (int row = 0; row < m.length; row++) {
	            for (int column = 0; column < m[0].length; column++) {
	                result += m[row][column] + "";
	                if (column == 2 || column == 5) {
	                    result += " ";
	                }
	            }
	            result += "\n";
	            if (row == 2 || row == 5) {
	                result += "\n";
	            }
	        }
	        return result;
	    }
	    public static void main(String[] args){
	    	int[][] matriz={{1,1,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0}};
 	        
	        
	        SudokuProyecto sk= new SudokuProyecto(matriz);
	        
	        System.out.println(sk.toString());
	        System.out.println(sk.resuelve());
	        System.out.println(sk.toString());
	        
	    }
}


