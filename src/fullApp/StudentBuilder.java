package fullApp;

public class StudentBuilder implements CharacterBuilderInterface {
	
	private StringBuilder character = new StringBuilder();
	
	
	@Override
	public void buildHead() {
		character.append(CreateCharacterApp.getFileContent(CreateCharacterApp.root_dir + "student/head.txt"));
	}

	@Override
	public void buildBody() {
		character.append(CreateCharacterApp.getFileContent(CreateCharacterApp.root_dir + "student/body.txt"));
	}

	@Override
	public void buildLegs() {
		character.append(CreateCharacterApp.getFileContent(CreateCharacterApp.root_dir + "student/legs.txt"));
	}
	
	public void buildAcessorie() {
		character.append(CreateCharacterApp.getFileContent(CreateCharacterApp.root_dir + "student/acessorie.txt"));
	}
	
	public StringBuilder getResult() {
		return character;
	}
}
