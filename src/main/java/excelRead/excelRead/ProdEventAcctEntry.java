package excelRead.excelRead;

public class ProdEventAcctEntry {
	
	String PRODUCT_CODE;
	String EVENT_CODE;
	String ACCOUNT_ROLE_CODE;
	String AMT_TAG;
	String DR_CR_INDICATOR;
	int TRANSACTION_CODE;
	String NETTING_INDICATOR;
	String ROLE_TYPE;
	String AMOUNT_TAG_TYPE;
	String REVAL_REQUIRED;
	String REVAL_PROFIT_GL;
	String REVAL_LOSS_GL;
	String REVAL_RATE_CODE;
	String REVAL_TXN_CODE;
	String RATE_TYPE_INDICATOR;
	String MIS_HEAD;
	String GLMIS_UPDATE_FLAG;
	String MIS_SPREAD;
	String HOLIDAY_TREATMENT;
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
	public String getACCOUNT_ROLE_CODE() {
		return ACCOUNT_ROLE_CODE;
	}
	public void setACCOUNT_ROLE_CODE(String aCCOUNT_ROLE_CODE) {
		ACCOUNT_ROLE_CODE = aCCOUNT_ROLE_CODE;
	}
	public String getAMT_TAG() {
		return AMT_TAG;
	}
	public void setAMT_TAG(String aMT_TAG) {
		AMT_TAG = aMT_TAG;
	}
	public String getDR_CR_INDICATOR() {
		return DR_CR_INDICATOR;
	}
	public void setDR_CR_INDICATOR(String dR_CR_INDICATOR) {
		DR_CR_INDICATOR = dR_CR_INDICATOR;
	}
	public int getTRANSACTION_CODE() {
		return TRANSACTION_CODE;
	}
	public void setTRANSACTION_CODE(int tRANSACTION_CODE) {
		TRANSACTION_CODE = tRANSACTION_CODE;
	}
	public String getNETTING_INDICATOR() {
		return NETTING_INDICATOR;
	}
	public void setNETTING_INDICATOR(String nETTING_INDICATOR) {
		NETTING_INDICATOR = nETTING_INDICATOR;
	}
	public String getROLE_TYPE() {
		return ROLE_TYPE;
	}
	public void setROLE_TYPE(String rOLE_TYPE) {
		ROLE_TYPE = rOLE_TYPE;
	}
	public String getAMOUNT_TAG_TYPE() {
		return AMOUNT_TAG_TYPE;
	}
	public void setAMOUNT_TAG_TYPE(String aMOUNT_TAG_TYPE) {
		AMOUNT_TAG_TYPE = aMOUNT_TAG_TYPE;
	}
	public String getREVAL_REQUIRED() {
		return REVAL_REQUIRED;
	}
	public void setREVAL_REQUIRED(String rEVAL_REQUIRED) {
		REVAL_REQUIRED = rEVAL_REQUIRED;
	}
	public String getREVAL_PROFIT_GL() {
		return REVAL_PROFIT_GL;
	}
	public void setREVAL_PROFIT_GL(String rEVAL_PROFIT_GL) {
		REVAL_PROFIT_GL = rEVAL_PROFIT_GL;
	}
	public String getREVAL_LOSS_GL() {
		return REVAL_LOSS_GL;
	}
	public void setREVAL_LOSS_GL(String rEVAL_LOSS_GL) {
		REVAL_LOSS_GL = rEVAL_LOSS_GL;
	}
	public String getREVAL_RATE_CODE() {
		return REVAL_RATE_CODE;
	}
	public void setREVAL_RATE_CODE(String rEVAL_RATE_CODE) {
		REVAL_RATE_CODE = rEVAL_RATE_CODE;
	}
	public String getREVAL_TXN_CODE() {
		return REVAL_TXN_CODE;
	}
	public void setREVAL_TXN_CODE(String rEVAL_TXN_CODE) {
		REVAL_TXN_CODE = rEVAL_TXN_CODE;
	}
	public String getRATE_TYPE_INDICATOR() {
		return RATE_TYPE_INDICATOR;
	}
	public void setRATE_TYPE_INDICATOR(String rATE_TYPE_INDICATOR) {
		RATE_TYPE_INDICATOR = rATE_TYPE_INDICATOR;
	}
	public String getMIS_HEAD() {
		return MIS_HEAD;
	}
	public void setMIS_HEAD(String mIS_HEAD) {
		MIS_HEAD = mIS_HEAD;
	}
	public String getGLMIS_UPDATE_FLAG() {
		return GLMIS_UPDATE_FLAG;
	}
	public void setGLMIS_UPDATE_FLAG(String gLMIS_UPDATE_FLAG) {
		GLMIS_UPDATE_FLAG = gLMIS_UPDATE_FLAG;
	}
	public String getMIS_SPREAD() {
		return MIS_SPREAD;
	}
	public void setMIS_SPREAD(String mIS_SPREAD) {
		MIS_SPREAD = mIS_SPREAD;
	}
	public String getHOLIDAY_TREATMENT() {
		return HOLIDAY_TREATMENT;
	}
	public void setHOLIDAY_TREATMENT(String hOLIDAY_TREATMENT) {
		HOLIDAY_TREATMENT = hOLIDAY_TREATMENT;
	}
	public ProdEventAcctEntry(String pRODUCT_CODE, String eVENT_CODE, String aCCOUNT_ROLE_CODE, String aMT_TAG,
			String dR_CR_INDICATOR, int tRANSACTION_CODE, String nETTING_INDICATOR, String rOLE_TYPE,
			String aMOUNT_TAG_TYPE, String rEVAL_REQUIRED, String rEVAL_PROFIT_GL, String rEVAL_LOSS_GL,
			String rEVAL_RATE_CODE, String rEVAL_TXN_CODE, String rATE_TYPE_INDICATOR, String mIS_HEAD,
			String gLMIS_UPDATE_FLAG, String mIS_SPREAD, String hOLIDAY_TREATMENT) {
		super();
		PRODUCT_CODE = pRODUCT_CODE;
		EVENT_CODE = eVENT_CODE;
		ACCOUNT_ROLE_CODE = aCCOUNT_ROLE_CODE;
		AMT_TAG = aMT_TAG;
		DR_CR_INDICATOR = dR_CR_INDICATOR;
		TRANSACTION_CODE = tRANSACTION_CODE;
		NETTING_INDICATOR = nETTING_INDICATOR;
		ROLE_TYPE = rOLE_TYPE;
		AMOUNT_TAG_TYPE = aMOUNT_TAG_TYPE;
		REVAL_REQUIRED = rEVAL_REQUIRED;
		REVAL_PROFIT_GL = rEVAL_PROFIT_GL;
		REVAL_LOSS_GL = rEVAL_LOSS_GL;
		REVAL_RATE_CODE = rEVAL_RATE_CODE;
		REVAL_TXN_CODE = rEVAL_TXN_CODE;
		RATE_TYPE_INDICATOR = rATE_TYPE_INDICATOR;
		MIS_HEAD = mIS_HEAD;
		GLMIS_UPDATE_FLAG = gLMIS_UPDATE_FLAG;
		MIS_SPREAD = mIS_SPREAD;
		HOLIDAY_TREATMENT = hOLIDAY_TREATMENT;
	}
	@Override
	public String toString() {
		return "ProdEventAcctEntry [PRODUCT_CODE=" + PRODUCT_CODE + ", EVENT_CODE=" + EVENT_CODE
				+ ", ACCOUNT_ROLE_CODE=" + ACCOUNT_ROLE_CODE + ", AMT_TAG=" + AMT_TAG + ", DR_CR_INDICATOR="
				+ DR_CR_INDICATOR + ", TRANSACTION_CODE=" + TRANSACTION_CODE + ", NETTING_INDICATOR="
				+ NETTING_INDICATOR + ", ROLE_TYPE=" + ROLE_TYPE + ", AMOUNT_TAG_TYPE=" + AMOUNT_TAG_TYPE
				+ ", REVAL_REQUIRED=" + REVAL_REQUIRED + ", REVAL_PROFIT_GL=" + REVAL_PROFIT_GL + ", REVAL_LOSS_GL="
				+ REVAL_LOSS_GL + ", REVAL_RATE_CODE=" + REVAL_RATE_CODE + ", REVAL_TXN_CODE=" + REVAL_TXN_CODE
				+ ", RATE_TYPE_INDICATOR=" + RATE_TYPE_INDICATOR + ", MIS_HEAD=" + MIS_HEAD + ", GLMIS_UPDATE_FLAG="
				+ GLMIS_UPDATE_FLAG + ", MIS_SPREAD=" + MIS_SPREAD + ", HOLIDAY_TREATMENT=" + HOLIDAY_TREATMENT + "]";
	}



}
