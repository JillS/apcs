public class PersonDriver {
	 // static and instance variables
	
	
	
	public static void main(String[] args)
	{		
		Person ralph = new Person();
		ralph.age = 7;
		ralph.weight = 83;
		ralph.location = "Boston, MA";
		ralph.fullName = "Ralph W. Emerson";
		ralph.greeting = "Helooo there";
		
		Person rhonda = new Person();
		rhonda.age = 22;
		rhonda.weight = 106;
		rhonda.location = "Wichita, KS";
		rhonda.fullName = "Rhonda Evans";
		rhonda.greeting = "Howdy";
		
		Person jim = new Person();
		jim.age = 22;
		jim.weight = 170;
		jim.location = "Buffalo, NY";
		jim.fullName = "Jim Kelly";
		jim.greeting = "Brrr...it’s cold here.";
		
		ralph.greet(); // using dot notation
						// to call method
		ralph.getWeight();
		
		
		String ralphGreeting = ralph.greet();
		int ralphWeight = ralph.getWeight();
		System.out.println("Ralph says:  " + ralphGreeting);
		System.out.println("Ralph's weight is:  " + ralphWeight);
		
		
		System.out.println("Ralph is " + ralph.age + " years old.");
		System.out.println("His weight is " + ralph.weight + "lbs");
		System.out.println("Unless you know him already, you should " +"call him " + ralph.fullName);

		System.out.println("Rhonda is " + rhonda.age + " years old.");
		System.out.println("Her weight is " + rhonda.weight + "lbs");
		System.out.println("Unless you know her already, you should " +"call her " + rhonda.fullName);
		
		System.out.println("Jim is " + jim.age + " years old.");
		System.out.println("His weight is " + jim.weight + "lbs");
	}

}