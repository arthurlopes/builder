package fullApp;

public class SoldierBuilder implements CharacterBuilderInterface{
	
	private StringBuilder character = new StringBuilder();
	
	@Override
	public void buildHead() {
		character.append(CreateCharacterApp.getFileContent(CreateCharacterApp.root_dir + "soldier/head.txt"));
	}

	@Override
	public void buildBody() {
		character.append(CreateCharacterApp.getFileContent(CreateCharacterApp.root_dir + "soldier/body.txt"));
	}

	@Override
	public void buildLegs() {
		character.append(CreateCharacterApp.getFileContent(CreateCharacterApp.root_dir + "soldier/legs.txt"));
	}
	
	@Override
	public void buildAcessorie() {
		character.append(CreateCharacterApp.getFileContent(CreateCharacterApp.root_dir + "soldier/acessorie.txt"));
	}
	
	@Override
	public void buildBoots() {
		character.append(CreateCharacterApp.getFileContent(CreateCharacterApp.root_dir + "soldier/boots.txt"));
	}
	
	public StringBuilder getResult() {
		return character;
	}
}
