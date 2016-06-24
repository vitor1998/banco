public class Conta {

	int numero;
	String dono;
	double saldo;
	double limite;

	

	
	boolean saca(double valor) {
		// TODO Auto-generated method stub
		if (this.saldo <= valor){
			return false;
		}
		else{
			 
       		this.saldo = this.saldo - valor;
		System.out.print(saldo);
		return true;
	  
		}
	
	}
    void deposita(double valor){
    	this.saldo = this.saldo + valor;
    	System.out.println(this.saldo);
    }
    public void transfere(Conta destino, double valor){
    	this.saldo = this.saldo - valor;
        destino.saldo = destino.saldo + valor;
        System.out.println("Saldo da Conta que foi depositada ------->"+ destino.saldo);
        System.out.println("Saldo da Conta que foi retirada ------->"+ this.saldo);
    }
}














