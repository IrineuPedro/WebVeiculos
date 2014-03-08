import java.util.ArrayList;

public class Venda {
	
	private Cliente cliente;
	private ArrayList<Veiculo> veiculos;
	private String dataCompra;
	
	
	
	public Cliente getCliente(){
		return this.cliente;
	}
	
	public void setCliente (Cliente cliente){
		this.cliente=cliente;
	}
	
	public ArrayList<Veiculo> getVeiculos(){
		return veiculos;
		
	}
	
	public void setVeiculos (ArrayList<Veiculo> veiculos){
		this.veiculos=veiculos;
	}
	
	
	public String getDataCompra(){
		return dataCompra;
		
	}
	
	public void setDataCompra( String dataCompra){
		this.dataCompra=dataCompra;
		
	}
	
	public double getValor(){
		
		double valorDaVenda= 0;
		for (int i = 0; i < veiculos.size() ; i ++ ){
			valorDaVenda += veiculos.get(i).getValorVenda();
			
			
		}
		
		return valorDaVenda;
	
	}
	
	
	
	

}
