package fullApp;

public class Director {
	
	//Metodo usado para criar determinado personagem
	public void Construct(CharacterBuilderInterface builder) {
		builder.buildAcessorie();
		builder.buildHead();
		builder.buildBody();
		builder.buildLegs();
		builder.buildBoots();
	}
	
}
