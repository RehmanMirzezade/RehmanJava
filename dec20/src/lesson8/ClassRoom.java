package lesson8;

	class ClassRoom {
	    String subject;
	    int studentCount;

	    
	    public ClassRoom(String subject, int studentCount) {
	        this.subject = subject;
	        this.studentCount = studentCount;
	    }

	    public void print() {
	        System.out.println("Fənn: " + subject + ", Tələbə sayı: " + studentCount);
	    }
	}



