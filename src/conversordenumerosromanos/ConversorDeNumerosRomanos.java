
package conversordenumerosromanos;

public class ConversorDeNumerosRomanos {

    private int valDecs[] = new int[4];
	int i = 0;
	int total = 0;
	int retorno = 0;
	public int converte(String valor){
        String valores[] = valor.split("");
			
        for (int i = 0; i < valores.length; i++){
		if(valores[i].equals("I")){
                    valDecs[i] = 1;
                    total++;
		} else if(valores[i].equals("V")){
			valDecs[i] = 5; 
			total++;
			}
		else if(valores[i].equals("X")){
			valDecs[i] = 10;
			total++;
                    }
		else if(valores[i].equals("L")){
			valDecs[i] = 50;
			total++;
                    }
		else if(valores[i].equals("C")){
			valDecs[i] = 100;
			total++;
                    }
		else if(valores[i].equals("D")){
			valDecs[i] = 500;
			total++;
                    }
		else if(valores[i].equals("M")){
			valDecs[i] = 1000;
			total++;
                    }	
		}
		if (total == 1)	{
                    retorno = somaRomano(valDecs[0]);
                    return retorno;
		}else if(total == 2){
                    retorno = somaRomano(valDecs[0], valDecs[1]);
                    return retorno;
		}else if (total == 3) {
                    retorno = somaRomano(valDecs[0], valDecs[1], valDecs[2]);
                    return retorno;
		}else if (total == 4){
                    retorno = somaRomano(valDecs[0], valDecs[1], valDecs[2], valDecs[3]);
                    return retorno;
		}
		return retorno;
	}	 
				
    public int somaRomano(int valor1){
	int soma = 0;
	soma = valor1;
	return soma;
    }
    
    public int somaRomano(int valor1, int valor2){
	int soma = 0;
        if(valor1 < valor2){
            soma = valor2 - valor1;
            return soma;
        }
	if(valor1 >= valor2 ){
            soma = valor1 + valor2;
            return soma;
	}
	return soma;
    }
    
    public int somaRomano(int valor1, int valor2, int valor3){
	int soma = 0;
	if(valor1 > valor2 && valor2 < valor3 ){
            soma = (valor3 + valor1) - valor2;
            return soma;
	}
	if(valor1 >= valor2 && valor2 >= valor3 ){
            soma = valor3 + valor1 + valor2;
            return soma;
	}
        return soma;
    }

    public int somaRomano(int valor1, int valor2, int valor3, int valor4){
	int soma = 0;
	if(valor1 == valor2 && valor2 == valor3 && valor3 == valor4){
            soma = 0;
	} 
	return soma;
    }
}
