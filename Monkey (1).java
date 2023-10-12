
public class Monkey extends RescueAnimal {
	
	private String species;
	private String tailLength;
	private String height;
	private String bodyLength; // instance variables 
	
	public Monkey(String name, String species, String gender, String age,
		    String weight, String acquisitionDate, String acquisitionCountry,
			String trainingStatus, boolean reserved, String inServiceCountry, String tailLength, String height, String bodyLength) {
		setName(name);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
	} // constructor method
	
	public String getSpecies() {
		return species;
		
	} // accessor 
	
	public void setSpecies(String monkeySpecies) {
		species = monkeySpecies;
		
	} // mutator
	
	public String gettailLength() {
		return tailLength;
	
	} // accessor
	
	public void settailLength(String monkeytailLength) {
		tailLength = monkeytailLength;
		
	} // mutator
	
	public String getheight() {
		return height;
	
	} // accessor 
	
	public void setheight(String monkeyHeight) {
		height = monkeyHeight;
		
	} // mutator 
	
	public String getbodyLength() {
		return bodyLength;
		
	} // accessor
	
	public void setbodyLength(String monkeybodyLength) {
		bodyLength = monkeybodyLength;
		
	} // mutator

}
