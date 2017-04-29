1)
sua idade=String;
seu nome= String;
seu peso=double;
tipo Sanguíneo=String
Seu aniversario=int;
numero que calça=int;
Casado ou não= boolean ou char;
------------------------------------------------------------------------------------------
2)
O resultado sai falso porque a soma entre os dois numeros de ponto flutuante não é igual ao numero de ponto flutuante .3
------------------------------------------------------------------------------------------
3)
A=-1
B=0
C=9
D=4
E=0
------------------------------------------------------------------------------------------
4)
import java.util.Scanner;
public class estudos {
	public static void main(String Args[]){
		Scanner ler= new Scanner(System.in);
		int n;
		System.out.println("Informe um numero!");
		n= ler.nextInt();
		
		if(n % 2==0)
			System.out.println("Seu numero é Par!");
		
			else
				System.out.println("Seu numero é impar");
			
		
	}
}
------------------------------------------------------------------------------------------
5)
import javax.swing.JOptionPane;



public class Calculadora {



    public static void main(String[] args) {

      double contador=1,r=0;

        while(contador!=0){

        double x = Double.parseDouble(JOptionPane.showInputDialog("informe o primeiro numero!"));

       String operador= JOptionPane.showInputDialog("informe o operador!");

       double y = Double.parseDouble(JOptionPane.showInputDialog("informe o segundo numero!"));

        

           r= calculador(y, y, operador);



       JOptionPane.showMessageDialog (null, "O resultado de sua operacao e : "+r);

       int opcao= JOptionPane.showConfirmDialog(null,"Deseja Efetuar outra operacao?","Sair",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);

    

        if(opcao==0){

            

            JOptionPane.showMessageDialog(null,"Informe a proxima operação!");

        }

        else{

            contador=0;

            JOptionPane.showMessageDialog(null,"Saida do programa efetuada com sucesso");

            

            

        }

            

        }

    }

    

    public static double calculador(double num1,double num2,String operation){

        double resultado=0;

        switch(operation){

           case "+":

              resultado=num1+num2; 

              break;

           case "-":

               resultado=num1-num2;

              break;

           case "*":

               resultado=num1*num2;

              break;

           case "/":

               resultado=num1/num2; 

              break;

                            

       }

        return resultado;

    }

    

}
------------------------------------------------------------------------------------------
6)
import java.util.Scanner;
public class estudos {
	public static void main(String Args[]){
		double prova1,prova2,media;
		Scanner ler= new Scanner(System.in);
		
		System.out.print("informe a nota da primeira prova!");
		prova1=ler.nextDouble();
		System.out.print("informe a nota da segunda prova");
		prova2=ler.nextDouble();
		media=(prova1+prova2)/2;
		if(media<6)
			System.out.println("Reprovado!");
		else
			System.out.println("Aprovado!");
		
		
		
	}
}
------------------------------------------------------------------------------------------
7)
import java.util.Scanner;
public class estudos {
	public static void main(String Args[]){
		double nota=0,media=0,contador=0,saida;
		Scanner ler= new Scanner(System.in);
		
		while(nota!=-1){
			System.out.print("informe uma nota");
			nota=ler.nextDouble();
			if(nota!=-1){
			media=media+nota;
			contador++;}
		}
		saida=media/contador;
		System.out.print("media total=  "+saida);
		
	}
}
------------------------------------------------------------------------------------------
8)
import java.util.Scanner;
public class estudos {
	public static void main(String Args[]){
		int contador=0,c=0;
		double numero=0;
		Scanner ler= new Scanner(System.in);
		int vetor[] = new int [contador];
		
		System.out.println("informe um numero");
		numero=ler.nextDouble();
		
		while(numero!=0 || numero!=1){
			
			if(numero%2==0){
				vetor[contador]=0;
							
			}
			if(numero%2==1){
				
				vetor[contador]=1;
				
				
			}
			numero=numero/2;
			
		}
		for(c=contador;contador>=0;c--){
			
			System.out.println("binario="+vetor[contador]);
			
		}
	}
}
------------------------------------------------------------------------------------------
9)
import java.util.Scanner;
public class estudos {
	public static void main(String Args[]){
		int x,y,vetor,tamanho;
		Scanner ler= new Scanner(System.in);
		System.out.println("informe o tamanho!");
		tamanho=ler.nextInt();
		int v [][] = new int [tamanho][tamanho];
		for(x=0;x<tamanho;x++){
			for(y=0;y<tamanho;y++){
				System.out.print(v[x][y]);
				System.out.print(" ");
				
			}
			System.out.print("\n");
		}

			
	}
}
------------------------------------------------------------------------------------------
10)
import java.util.Scanner;
import javax.swing.JOptionPane;
public class estudos {
	public static void main(String Args[]){
		String cidade;
		int c;
		String v[]= new String [4];
		String selectedValue;
		for(c=0;c<4;c++){
		v[c]=JOptionPane.showInputDialog("informe o nome da cidade");	
		
			
			
		}
		 selectedValue= JOptionPane.showInputDialog(null, "selecione a cidade",JOptionPane.INFORMATION_MESSAGE);
		 JOptionPane.showMessageDialog(null,"Cidade selecionada é= "+selectedValue);
		
  }
}
------------------------------------------------------------------------------------------
11)
import java.util.Scanner;
import javax.swing.JOptionPane;
public class estudos {
	public static void main(String Args[]){
		String cidade;
		
		cidade= nome("campo grande");
		System.out.print("cidade = "+cidade);
		
	}
	public static String nome(String nome){
		
		return nome;
		
		
	}
}
------------------------------------------------------------------------------------------
12)
import java.util.Scanner;
import javax.swing.JOptionPane;
public class estudos {

    public static void main(String[] args) {
        double x ;
        double  y ;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("primeiro cateto!");
        doouble x = ler.nextFloat();
        
        System.out.println("segundo cateto!");
        float y = ler.nextDouble();
        
        x =  ((double) Math.pow(y, 2) + (double) Math.pow(scat, 2)) ;
        y= (double)Math.pow(x, (1.0/2));
        
        System.out.println("O valor da hipotenusa é :" + y);
    }
    
}
------------------------------------------------------------------------------------------
13)
public class TimeDeFutebol {

	public static void main(String[] args) {

		Objeto t = new Objeto("PALMEIRAS", "NAO", "TEM", "MUNDIAL");

		System.out.println(t);

	}
}
public class Objeto {
	
	String nomeDoTime;
	String presidenteDoTime;
	String tecnicoDoTime;
	String titulosDoTime;
	
	public Objeto() {
		
	}
	
	public Objeto(String name, String nomePres, String tecnico, String titulo) {
		this.nomeDoTime = name;
		this.presidenteDoTime = nomePres;
		this.tecnicoDoTime = tecnico;
		this.titulosDoTime = titulo;
	}
	
	public String getPresidenteDoTime() {
		return presidenteDoTime;
	}
	public void setPresidenteDoTime(String presidenteDoTime) {
		this.presidenteDoTime = presidenteDoTime;
	}
	public String getTecnicoDoTime() {
		return tecnicoDoTime;
	}
	public void setTecnicoDoTime(String tecnicoDoTime) {
		this.tecnicoDoTime = tecnicoDoTime;
	}
	public String getTitulosDoTime() {
		return titulosDoTime;
	}
	public void setTitulosDoTime(String titulosDoTime) {
		this.titulosDoTime = titulosDoTime;
	}
	public String getNomeDoTime() {
		return nomeDoTime;
	}
	public void setNomeDoTime(String nomeDoTime) {
		this.nomeDoTime = nomeDoTime;
	}
	
	@Override
	public String toString() {
		return "-" + this.nomeDoTime + "-" + this.presidenteDoTime + "-" + this.tecnicoDoTime + "-" + this.titulosDoTime +".";
	}
------------------------------------------------------------------------------------------
public class Exercicio14 {

	String name;
	int cpfAluno;
	int matriculaAluno;
	int rg;
	
	
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCpfAluno() {
		return cpfAluno;
	}
	public void setCpfAluno(int cpfAluno) {
		this.cpfAluno = cpfAluno;
	}
	public int getMatriculaAluno() {
		return matriculaAluno;
	}
	public void setMatriculaAluno(int matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}
	
	
	
}


