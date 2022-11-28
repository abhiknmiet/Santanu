package excelRead.excelRead;

public class ProdEvent {
	
	String PRODUCT_CODE;
	String EVENT_CODE;
	int SEQ_NO;
	public String getPRODUCT_CODE() {
		return PRODUCT_CODE;
	}
	public void setPRODUCT_CODE(String pRODUCT_CODE) {
		PRODUCT_CODE = pRODUCT_CODE;
	}
	public String getEVENT_CODE() {
		return EVENT_CODE;
	}
	public void setEVENT_CODE(String eVENT_CODE) {
		EVENT_CODE = eVENT_CODE;
	}
	public int getSEQ_NO() {
		return SEQ_NO;
	}
	public void setSEQ_NO(int sEQ_NO) {
		SEQ_NO = sEQ_NO;
	}
	@Override
	public String toString() {
		return "ProdEvent [PRODUCT_CODE=" + PRODUCT_CODE + ", EVENT_CODE=" + EVENT_CODE + ", SEQ_NO=" + SEQ_NO + "]";
	}
	public ProdEvent(String pRODUCT_CODE, String eVENT_CODE, int sEQ_NO) {
		super();
		PRODUCT_CODE = pRODUCT_CODE;
		EVENT_CODE = eVENT_CODE;
		SEQ_NO = sEQ_NO;
	}
	public ProdEvent() {
		super();
	}

}
