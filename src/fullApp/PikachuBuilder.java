package fullApp;

public class PikachuBuilder implements CharacterBuilderInterface{
	
	private StringBuilder character = new StringBuilder();
	
	@Override
	public void buildHead() {
		character.append(CreateCharacterApp.getFileContent(CreateCharacterApp.root_dir + "pikachu/head.txt"));
	}

	@Override
	public void buildBody() {
		character.append(CreateCharacterApp.getFileContent(CreateCharacterApp.root_dir + "pikachu/body.txt"));
	}

	@Override
	public void buildLegs() {
		character.append(CreateCharacterApp.getFileContent(CreateCharacterApp.root_dir + "pikachu/legs.txt"));
	}
	
	@Override
	public void buildAcessorie() {
		character.append(CreateCharacterApp.getFileContent(CreateCharacterApp.root_dir + "pikachu/acessorie.txt"));
	}
	
	@Override
	public void buildBoots() {
		character.append(CreateCharacterApp.getFileContent(CreateCharacterApp.root_dir + "pikachu/boots.txt"));
	}
	
	public StringBuilder getResult() {
		return character;
	}
}