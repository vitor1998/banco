public class Programa {
double Salario;
public static void main(String[] args) {
// TODO Auto-generated method stub
	    //cria objeto minhaConta referenciando a clase Conta
	    Conta minhaConta;
		minhaConta = new Conta();
		//termina de criar o objeto
		minhaConta.saldo = 1000;
		//minhaConta.deposita(1000);
		Conta Continha;
		Continha = new Conta();
		minhaConta.transfere(Continha, 700);
	
		//boolean consegui = minhaConta.saca(200);
	//if(consegui){
		//System.out.println("Consegue Sacar");
	//}else{
	//	System.out.println("Não Consegue Sacar");
	//}
}
}
//segundo objeto referenciado
/*	Conta Continha;
	Continha = new Conta();
	Continha.saca(200);
System.out.println("Objeto Continha -------->"+Continha.saldo);

//public static void main(String[] args) 
//segundoenvio