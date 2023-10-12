import java.util.ArrayList;

import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    
     // Instance variables (if needed)
    
    String input;
    Scanner scnr = new Scanner(System.in);

    public void main(String[] args) {
    	Scanner scnr = new Scanner(System.in);
    	


        initializeDogList();
        initializeMonkeyList();
        
        do { 
        	displayMenu();
        	
        	input = scnr.nextLine();
        	
        	switch (input) {
        	case "1":
        		// call method to intake new dog
        		intakeNewDog(scnr);
        		break;
        	case "2":
        		// call method to intake new Monkey
        		intakeNewMonkey(scnr);
        		break;
        	case "3":
        		// call method to reserve an animal
        		reserveAnimal(scnr);
        		break;
        	case "4": 
        		// call method to print list of all dogs
        		System.out.println(dogList);
        		break;
        	case "5": 
        		// call method to print list of all monkeys
        		System.out.println(monkeyList);
        		break;
        	case "6":
        		// call method to print list of all animals
        		System.out.println(dogList);
        		System.out.println(monkeyList);
        		break;
        	case "q":
        		System.out.println("Quitting application...");
        		break;
        	default: 
        		System.out.println("Invalid input. Please try again");
        		break;
        
        		
        	}
        } while (!input.equals("q"));

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Buster", "Capuchin", "male", "2", "11.0", "08-10-2021", "Brazil", "in service", false, "United States", "9.0", "17.0", "32.0"); 
    	Monkey monkey2 = new Monkey("Tina", "Capuchin", "female", "1.5", "9.0", "06-12-2021", "Brazil", "in service", false, "United States", "8.0", "14.0", "27.0");
    	Monkey monkey3 = new Monkey("George", "Macaque", "male", "4.5", "16.0", "03-09-2019", "Japan", "in service", true, "United States", "12.0", "21.0", "42.0");
    	
    	monkeyList.add(monkey1);
    	monkeyList.add(monkey2);
    	monkeyList.add(monkey3);
    	

    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public void intakeNewDog(Scanner scanner) {
    	Scanner sncr = new Scanner(System.in);
    	
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        System.out.println("What is the dog's breed?");
        String breed = scnr.nextLine();
        
        System.out.println("What is the dog's gender?");
        String gender = scnr.nextLine();
        
        System.out.println("What is the dog's weight?");
        String weight = scnr.nextLine();
        
        System.out.println("What is the dog's age?");
        String age = scnr.nextLine();
       
        System.out.println("What is the dog's acquisition date?");
        String acquisitionDate = scnr.nextLine();
        
        System.out.println("What country was this dog aquired from?");
        String acquisitionCountry = scnr.nextLine();
        
        System.out.println("What is this dog's training status");
        String trainingStatus = scnr.nextLine();
        
        System.out.println("Is this dog reserved?");
        boolean reserved = scnr.nextBoolean();
        
        System.out.println("What country is this dog in service?");
        String inServicecountry = scnr.nextLine();
        
        Dog newDog = new Dog(name, breed, gender, weight, age, acquisitionDate, acquisitionCountry, trainingStatus, false, inServicecountry);
        dogList.add(newDog);
        
    }

        // Add the code to instantiate a new dog and add it to the appropriate list
    


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
        	Scanner scnr = new Scanner(System.in);
        	
            System.out.println("What is the Monkey's name?");
            String name = scnr.nextLine();
            for (Monkey monkey: monkeyList) {
            	if(monkey.getName().equalsIgnoreCase(name)) {
            		System.out.println("\n\nThis monkey is already in our system\n\n");
                    return;
            	}
            System.out.println("What species is the monkey?");
            String species = scnr.nextLine();
            System.out.println("What is the monkey's weight?");
            String weight = scnr.nextLine();
            System.out.println("What is the monkey's gender?");
            String gender = scnr.nextLine();
            System.out.println("What is the monkey's age?");
            String age = scnr.nextLine();
            System.out.println("What is the monkey's acquisition country?");
            String acquisitionCountry = scnr.nextLine();
            System.out.println("What is the monkey's aquisition date?");
            String acquisitionDate = scnr.nextLine();
            System.out.println("What is the monkey's training status?");
            String trainingStatus = scnr.nextLine();
            System.out.println("Is this monkey reserved?");
            String reserved = scnr.nextLine();
            System.out.println("What is the monkey's tail length?");
            String tailLength = scnr.nextLine();
            System.out.print("What is the monkey's height?");
            String height = scnr.nextLine();
            System.out.println("What is the monkey's body length?");
            String bodyLength = scnr.nextLine();
            
            
			
			Monkey newMonkey = new Monkey(name, species, weight, gender, age, acquisitionCountry, acquisitionDate, trainingStatus, false, tailLength, height, bodyLength, bodyLength);
            
            monkeyList.add(newMonkey);
            }
            
            	
            }
        

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
        	Scanner scnr = new Scanner(System.in);
            System.out.println("Enter the name of the animal you wish to reserve");
            
            String name = scnr.nextLine();
            
            for (Dog dog : dogList) {
            	if (dog.getName().equalsIgnoreCase(name)) {
            		if (dog.getReserved()) {
            			System.out.println("Sorry, that dog is already reserved");
            		} else {
            			System.out.println("Reservation Sucessful!");
            			dog.setReserved(true);
            		}
            		return;
            		
            	}
            }

         
            
            for (Monkey monkey : monkeyList) {
            	if (monkey.getName().equalsIgnoreCase(name)) {
            		if (monkey.getReserved()) {
            			System.out.println("Sorry, that monkey is already reserved.");
            			
            		} else { System.out.println("Reservation sucessful!");
            		monkey.setReserved(true);;
            		}
            		return;
            	}
            }
            
            System.out.println("Sorry, we don't have an animal with that name.");
        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        
        
        public class AnimalRescue {
        	private ArrayList<Dog> dogs;
        	private ArrayList<Monkey> monkeys;
        	
        	public void AnimalRescue() {
        		
        		this.dogs = new ArrayList<Dog>();
        		
        		this.monkeys = new ArrayList<Monkey>();
        	}
        	
        	public void addDog(Dog dog) {
        		dogs.add(dog);
        	}
        	
        	public void addMonkey( Monkey monkey) {
        		monkeys.add(monkey);
        	}
        	
        	
        public void printAnimals() {
        	Scanner scnr = new Scanner(System.in);

            System.out.print("Enter animal type (dog/monkey) or 'all' for all animals: ");
            String animalType = scnr.nextLine().toLowerCase();

            ArrayList<Animal> animalsToPrint = new ArrayList<Animal>();
            if (animalType.equals("dog")) {
                animalsToPrint.addAll(dogs);
            } else if (animalType.equals("monkey")) {
                animalsToPrint.addAll(monkeys);
            } else if (animalType.equals("all")) {
                for (Dog dog : dogs) {
                    if (dog.isInService() && dog.isAvailable()) {
                        animalsToPrint.add(dog);
                    }
                }
                for (Monkey monkey : monkeys) {
                    if (monkey.isInService() && monkey.isAvailable()) {
                        animalsToPrint.add(monkey);
                    }
                }
            } else {
            	System.out.println("Invalid input. Please enter Dog, Monkey, or all.");
            	return;
            }

            if (animalsToPrint.isEmpty()) {
                System.out.println("No animals found.");
            } else {
                for (Animal animal : animalsToPrint) {
                    System.out.println(animal);
                }
            }
        }
        
        
      
        
            
        
    


       


