package quizes;

public class Answer_q7 {
		// declaring attribute
			private String answer_q7;
			
			public Answer_q7(String answer) {
				// defining method
				this.setAnswer_q7(answer);
			}
			
			public String greet() {
				String retval;
				
				if (this.answer_q7 == "Valetta") {
					retval = "Correct";
				} else {
					retval = "False";
				}
				return retval;
			}

			public String getAnswer_q7() {
				return answer_q7;
			}

			public void setAnswer_q7(String answer_q7) {
				this.answer_q7 = answer_q7;
			}
		}
