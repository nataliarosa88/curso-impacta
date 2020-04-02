package Exemplos.Cap_08;

public class arrayMultidimensional {
	public static void main(String args[]){
		
		double notas[][][] = new double[100][4][3];
		// 100 � a quantidade de alunos
		// 4 � a quantidade de mat�rias
		// 3 � a quantidade de notas
		
		notas[0][0][0] = 6.5; // Primeira nota do primeiro aluno para a primeira mat�ria
		notas[0][0][1] = 7.5; // Segunda nota do primeiro aluno para a primeira mat�ria
		notas[0][0][2] = 7.0; // Terceira nota do primeiro aluno para a primeira mat�ria

		notas[0][1][0] = 6.5; // Primeira nota do primeiro aluno para a segunda mat�ria
		notas[0][1][1] = 7.5; // Segunda nota do primeiro aluno para a segunda mat�ria
		notas[0][1][2] = 7.0; // Terceira nota do primeiro aluno para a segunda mat�ria

		notas[99][3][0] = 7.2; // Primeira nota do �ltimo aluno para a �ltima mat�ria
		notas[99][3][1] = 8.6; // Segunda nota do �ltimo aluno para a �ltima mat�ria
		notas[99][3][2] = 6.5; // Terceira nota do �ltimo aluno para a �ltima mat�ria
	}
}
