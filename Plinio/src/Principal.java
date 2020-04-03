import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
        
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner numeros = new Scanner(System.in);
        Scanner palavras = new Scanner(System.in);
        List <Aluno> aluno = new ArrayList<>();
         
        System.out.println("Quantidade de alunos da turma");
        int numAlunos = numeros.nextInt();
        
        for(int c = 0; c<numAlunos ; c++) {
        	System.out.print("Nome: ");
			aluno.add(new Aluno(palavras.nextLine()));
        	
        	System.out.print("P1: ");
        	aluno.get(c).setNotaP1(numeros.nextFloat());
        	
        	System.out.print("P2: ");
            aluno.get(c).setNotaP2(numeros.nextFloat());          
            
        }
        for(Aluno c : aluno) {
        	System.out.println(c);	
        }
        

	}

}
