package entities;

public class Trabalhador {
	private Integer id;
	private String name;
	private double salario;
	
	
	public Trabalhador(Integer id, String name, Double salario) {
		this.id = id;
		this.name = name;
		this.salario = salario;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public void ajustaSalario(double porcentagem) {
		salario += salario*(porcentagem/100);
	}
	public String toString() {
		return id+String.format(" %s, ",name)+salario;
	}
}
