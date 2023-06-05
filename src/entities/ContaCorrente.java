package entities;

public class ContaCorrente {
	
	private Integer numero;
	private String cliente;
	private Double saldo;
	private Double limite;
	
	public ContaCorrente(Integer numero, String cliente, Double saldo, Double limite) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
		this.limite = limite;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Double getLimite() {
		return limite;
	}
	public void setLimite(Double limite) {
		this.limite = limite;
	}
	public void Double deposito(valor) {
		return saldo += valor;
	}
	public void Double saque(valor) {
		return saldo -= valor;
	}
	

}
