package TranscoderOld;

import org.testng.annotations.DataProvider;

public class DataPassValuesAdd {

		@DataProvider()
		public String[][] data(String username,String password){
			String[][] newString = {{"abc","def"},{"ghi","jkl"},{"mno","pqr"}};
			return newString;
	}

}
