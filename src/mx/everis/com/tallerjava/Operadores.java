package mx.everis.com.tallerjava;
import mx.everis.taller.clases.Persona;
public class Operadores {
	static Persona personas[]={new Persona("carlos","moreno",12),new Persona("carlos2","moreno2",12) };
	public static void main(String []args){
	  Operadores.aritmeticos();
	  /*
	   * for
	   * */
	  
	  
	  
	  /*for(int i=0;i<personas.length;i++){

		  System.out.println("nombre: "+personas[i].getNombre()+" epellido: "+personas[i].getApellido()+" edad: "+personas[i].getEdad());
	  }
	  
	  /*
	   * for each
	   * */
	  /*
	  for(Persona p: personas)
	  {
		  System.out.println(" nombre:"+p.getNombre()+"  apellido: "+p.getApellido()+" edad: "+p.getEdad());
	  }*/
	
 }
	public static void aritmeticos(){
		int valor=10;
		int valornew=0;
		int valor2=10;
		int cont1=0;
		 valor+=1;
		 valor-=1;
		if( valor == valor2)
		{
			System.out.println("si esta igual");
		}
		
		valor*=valor;
		System.out.println("el valor "+valor+" es cuadrado");
		valor/=valor;
		System.out.println("el valor "+valor+" se dividio entre si");
		
		if(valor != valor2){
			System.out.println("los valores son distintos por que se modifico alguno");
		}
		
		valornew=valor*valor2;
		System.out.println("valor new * es "+valornew);
		valornew=valornew+valor2;
		System.out.println("valor new + es "+valornew);
		valornew=valornew-valor2;
		System.out.println("valor new - es "+valornew);
		valornew=valornew/2;
		
		if(valornew>=valor2)
		{
			System.out.println("valornew es igual o mayo a "+valor2);
		}

		if(valornew<=valor2)
		{
			System.out.println("valornew es igual o menor a "+valor2);
		}
		
		
	}
	
	
}
