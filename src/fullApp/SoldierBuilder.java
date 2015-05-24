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
	
	public StringBuilder getResult() {
		return character;
	}
}
