
public class Student {
	public String name;
	public int score;

	public void setName(String Name) {
		name = Name;
	}

	public String getName() {
		return name;
	}

	public void setScore(int Score) {
		score = Score;
	}

	public int getScore() {
		return score;
	}

	public boolean checkScore() {
		return (score>=0&&score<=100?true:false);
	}

	public boolean isPass() {
		return (score>=50?true:false);
	}
	
	public String findGrade(int score) {
		if(score>=80&&score<=100) {
			return "A";
		}
		else if (score>=75&&score<=79) {
			return "B+";
		}
		else if (score>=70&&score<=74) {
			return "B";
		}
		else if (score>=65&&score<=69) {
			return "C+";
		}
		else if (score>=60&&score<=64) {
			return "C";
		}
		else if (score>=55&&score<=59) {
			return "D+";
		}
		else if (score>=50&&score<=54) {
			return "D";
		}
		else {
			return "F";
		}
		
	}

}
