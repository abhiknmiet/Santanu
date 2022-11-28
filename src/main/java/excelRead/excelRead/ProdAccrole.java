package excelRead.excelRead;

public class ProdAccrole {
	String PRODUCT_CODE;
	String ACCOUNTING_ROLE;
	Long ACCOUNT_HEAD;
	String STATUS;
	String ROLE_TYPE;
	public String getPRODUCT_CODE() {
		return PRODUCT_CODE;
	}
	public void setPRODUCT_CODE(String pRODUCT_CODE) {
		PRODUCT_CODE = pRODUCT_CODE;
	}
	public String getACCOUNTING_ROLE() {
		return ACCOUNTING_ROLE;
	}
	public void setACCOUNTING_ROLE(String aCCOUNTING_ROLE) {
		ACCOUNTING_ROLE = aCCOUNTING_ROLE;
	}
	public Long getACCOUNT_HEAD() {
		return ACCOUNT_HEAD;
	}
	public void setACCOUNT_HEAD(Long aCCOUNT_HEAD) {
		ACCOUNT_HEAD = aCCOUNT_HEAD;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getROLE_TYPE() {
		return ROLE_TYPE;
	}
	public void setROLE_TYPE(String rOLE_TYPE) {
		ROLE_TYPE = rOLE_TYPE;
	}
	@Override
	public String toString() {
		return "ProdAccrole [PRODUCT_CODE=" + PRODUCT_CODE + ", ACCOUNTING_ROLE=" + ACCOUNTING_ROLE + ", ACCOUNT_HEAD="
				+ ACCOUNT_HEAD + ", STATUS=" + STATUS + ", ROLE_TYPE=" + ROLE_TYPE + "]";
	}
	public ProdAccrole(String pRODUCT_CODE, String aCCOUNTING_ROLE, Long aCCOUNT_HEAD, String sTATUS,
			String rOLE_TYPE) {
		super();
		PRODUCT_CODE = pRODUCT_CODE;
		ACCOUNTING_ROLE = aCCOUNTING_ROLE;
		ACCOUNT_HEAD = aCCOUNT_HEAD;
		STATUS = sTATUS;
		ROLE_TYPE = rOLE_TYPE;
	}


}
