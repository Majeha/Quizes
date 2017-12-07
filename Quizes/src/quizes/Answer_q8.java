package quizes;

public class Answer_q8 {

	// declaring attribute
		private String answer_q8;
		
		public Answer_q8(String answer_q8) {
			// defining method
			this.answer_q8 = answer_q8;
		}
		
		public String greet() {
			String retval;
			
			if (this.answer_q8.equalsIgnoreCase("Amsterdam")) {
				retval = "Correct";
			} else {
				retval = "False";
			}
			return retval;
		}
	}