package days12;

import java.util.Scanner;

public class Student {
	
	// 필드
	public String name;
	public int kor, eng, mat, tot, rank, wrank;
	public double avg;
	
	// 메서드
	public void dispInfo() {
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n\t%d\n"
	               ,name, kor,eng,mat,tot,avg,rank, wrank);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", tot=" + tot + ", rank="
				+ rank + ", wrank=" + wrank + ", avg=" + avg + "]";
	}

	public Student(String name, int kor, int eng, int mat, int tot, int rank, double avg) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = tot;
		this.rank = rank;
		this.avg = avg;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
	

}
