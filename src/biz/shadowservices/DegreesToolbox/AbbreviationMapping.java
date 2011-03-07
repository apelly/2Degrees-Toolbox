package biz.shadowservices.DegreesToolbox;

import java.util.HashMap;
import java.util.Map;

public class AbbreviationMapping  {
	// This is used by some of the widgets to get short versions of the labels for balance items
	private static final long serialVersionUID = 1L;
	Map<String, String> stringMapping;
	public AbbreviationMapping() {
		stringMapping = new HashMap<String, String>();
		stringMapping.put("Prepay Credit", "Credit");
		stringMapping.put("Your spend since last bill", "Spend");
		stringMapping.put("Texts", "Txts");
		stringMapping.put("Broadband Zone Data", "Zone");
		stringMapping.put("National Data", "Nat");
		stringMapping.put("NZ minutes", "NZ");
		stringMapping.put("Bonus minutes", "Bonus");
		stringMapping.put("Your 'top up and get' special rates", "Special Rates");
		stringMapping.put("Postpay Plan Data", "Plan Data");
	}
	public String getAbbr(String input) {
		String result = stringMapping.get(input);
		if (result == null) {
			int cutLength;
			if (input.length() < 12) {
				cutLength = input.length();
			} else {
				cutLength = 12;
			}
			result = input.substring(0, cutLength);
		}
		return result;
	}
}
