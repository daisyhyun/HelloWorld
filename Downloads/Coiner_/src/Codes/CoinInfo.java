package Codes;

public class CoinInfo {
	private String CoinName;		//���� �̸�
	private int Coin_index;			//���� ����
	private String Coin_volume;		//�ŷ���
	private double Coin_cap;		//���� �ð� �Ѿ�
	private double[][] CoinHistory;	//���� �ֱ� x�� ���� �ð�/���� ���
	private double CurrentValue;	//����
	private int max_historysize;
	
	public int getsize() {
		return this.max_historysize;
	}
	
	public void setsize(int max) {
		this.max_historysize = max;
	}
	
	public double getCurrent() {
		return this.CurrentValue;
	}
	
	public void setCurrent(double curr) {
		this.CurrentValue = curr;
	}
	
	public void setCoinVolume(String vol) {
		this.Coin_volume = vol;
	}
	
	public String getCoinVolume() {
		return this.Coin_volume;
	}
	public void setCoinName(String name) {
		this.CoinName = name;
	}
	
	public String getCoinName() {
		return this.CoinName;
	}
	
	public void setCoinIndex(int index) {
		this.Coin_index = index;
	}
	
	public int getCoinIndex() {
		return this.Coin_index;
	}
	
	public void setCoinCap(double cap) {
		this.Coin_cap = cap;
	}
	
	public double getCoinCap() {
		return this.Coin_cap;
	}
	
	public void setCoinHistory(double[][] data) {
		this.CoinHistory = data;
	}
	
	public double[][] getCoinHistory() {
		return this.CoinHistory;
	}
}
