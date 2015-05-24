package fullApp;

public class Director {
	
	public void Construct(CharacterBuilderInterface builder) {
		builder.buildHead();
		builder.buildBody();
		builder.buildLegs();
	}
	
}
