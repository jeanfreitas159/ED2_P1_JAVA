import java.util.Scanner;
public class p1 {

	public static void main(String[] args) {

	
	                System.out.print("-----------------------------\n");
				    System.out.print(" ATIVIDADE AVALIATIVA - P1\r\n" + " ");        
				    System.out.println("LINGUAGENS E TÉCNICAS DE PROGRAMAÇÃO\r\n" + " ");
				    System.out.print(" [ 1 ] - VERIFICAR PARIDADE\n");
					System.out.print(" [ 2 ] - VERIFICAR POLARIDADE \n");
					System.out.print(" [ 3 ] - CRÉDITO ESPECIAL \n");
					System.out.print(" [ 4 ] - TRIANGULO\n");
					System.out.print(" [ 5 ] - SAIR DO PROGRAMA\n");
					System.out.print(" [ 6 ] - VERIFICA IGUALDADE\n");
					System.out.print("-----------------------------\n");	        
					System.out.print("Digite uma Opção :\n  ");
                    
					
					int n1 ;
					Scanner verifica_paridade1 = new Scanner(System.in);
					 
					n1 =verifica_paridade1.nextInt();
					
					
					 
        	 
			switch (n1) {
        	  
        	  case 5 : 
	        	  System.out.println("despedida nem sempre é um adeus. Pode ser um ‘até logo’, mesmo que o logo ainda seja demorado. " );
					System.out.println("Encerrando programa .... ");
					
					break;
	          
        	  case 1 : 
		            System.out.println("Opção escolhida verificar paridade . \n");

	        	  int m2 ;
	        	  
	        	   Scanner verifica_paridade = new Scanner(System.in);
	        	   
		            System.out.println("Digite um número diferente de zero . \n");
		            m2 = verifica_paridade1.nextInt();
		       
                   
		            if (m2 % 2== 0) 
	            	   System.out.println("O número informado é PAR");
		            
		            else 
		            	System.out.println("O número informado é ÍMPAR");
		            
		             break;
	          
	          
	
	               case 2: 
	            	   
			            System.out.println("Opção escolhida verificar polaridade . \n");

	            	   int n3;
	            	   Scanner verifica_polaridade = new Scanner(System.in);
		        	   
			            System.out.println("Digite um número . \n");
			            n3 = verifica_polaridade.nextInt();
	            	   
			            System.out.println("verificando se o número é positivo ou não . \n");

			            
	            	   if (n3 > 0) 
	        	            System.out.println("O número informado é POSITIVO. \n TRUE" );
	            	   
	            	   if (n3 == 0) 
	        	            System.out.println("O número informado é POSITIVO. \n TRUE");
	            	   
		          
	            	   if (n3 < 0) 
	            		   System.out.println("O número informado é NEGATIVO. \nFALSE");
	            	     	  
	            	   break ;

	            	   
	          case 3: 
	        	  
		            System.out.println("Opção escolhida verificar Crédito especial . \n");

	        	  Scanner calcula_credito = new Scanner(System.in);
		          System.out.println("Digite o seu saldo médio no último ano  . \n");
                  double sn;
		            
                  sn = calcula_credito.nextDouble();

		        if (sn >0 && sn<200) 
	        	  System.out.println("Nenhum crédito");
		        
	        	  
	        	  
		        else if (sn>200 && sn<400) {
		        	
	             System.out.print("Caro cliente, como o seu saldo médio foi de ,  " );
	             System.out.print(sn);
	             System.out.print("  , o valor de seu crédito especial será de = ");
	             double credito = (sn*20 / 100);
		         System.out.println(credito);}
		        
		         
		        else if (sn>400 && sn <600 ) {
		        	System.out.print("Caro cliente, como o seu saldo médio foi de ,  " );
		             System.out.print(sn);
		             System.out.print("  , o valor de seu crédito especial será de = ");
	             double credito1 = (sn*30 / 100);
		         System.out.println(credito1);}
		        
		        
		        else if (sn>600 ) {
		        	System.out.print("Caro cliente, como o seu saldo médio foi de ,  " );
		             System.out.print(sn);
		             System.out.print("  , o valor de seu crédito especial será de = ");
		             double credito2 = (sn*40 / 100);
			         System.out.println(credito2);

		        }
		        	 break;
	         case 4: 
		            System.out.println("Opção escolhida Triângulo . \n");

	        	  Scanner triangulo = new Scanner(System.in);
		          System.out.println("Digite um número . \n");
                  double x , y , z;
		            
                  x = triangulo.nextInt();

		            System.out.println("Digite outro número . \n");
		            y = triangulo.nextInt();

                  System.out.println("Digite mais um número . \n");

                  z = triangulo.nextInt();
        	  
                  
                  
                   if (x==y && y==z) {
                      System.out.println("Esses valores formam um triângulo do tipo equilátero");
                   }
                   
                   else if (x==y && y!=z && y==z && z!=x && x==z && z!=y) {
                       System.out.println("Esses valores formam um triângulo do tipo isoceles");
                   }
                  
                   else if (x!=y && x!=z && y!=z && y!=x && z!=y && z!=x) {
                   System.out.println("Esses valores formam um triângulo do tipo escaleno");
                   }
                   
                   else {
                	   System.out.println("Esses valores não formam um triângulo");
                   }
                	   break ;
                   
	         case 6:
       		  
       		  int m , b;
	        	   Scanner igualdade = new Scanner(System.in);

	        	   System.out.println("Digite um número  . \n");
		            m = igualdade.nextInt();
		        	   System.out.println("Digite mais um número  . \n");
			        b = igualdade.nextInt();

			       if (m==b) 
			    	   System.out.println("Os números informados são iguais");
			        
			       else 
			    	   System.out.println("Os números informados não são iguais");

			       break;
 
        	  } 
					}


}
		



