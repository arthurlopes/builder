package fullApp;

public class ThiefBuilder implements CharacterBuilderInterface {
	
	private StringBuilder character = new StringBuilder();
	
	@Override
	public void buildHead() {
		character.append(CreateCharacterApp.getFileContent(CreateCharacterApp.root_dir + "thief/head.txt"));
	}

	@Override
	public void buildBody() {
		character.append(CreateCharacterApp.getFileContent(CreateCharacterApp.root_dir + "thief/body.txt"));
	}

	@Override
	public void buildLegs() {
		character.append(CreateCharacterApp.getFileContent(CreateCharacterApp.root_dir + "thief/legs.txt"));
	}
	
	public StringBuilder getResult() {
		return character;
	}
}