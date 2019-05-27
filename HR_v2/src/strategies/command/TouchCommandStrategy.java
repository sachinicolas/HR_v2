package strategies.command;

import models.*;

public class TouchCommandStrategy implements CommandStrategy {
	private String str = new String("New file maked succesfully.");
	
	public String execute(Resource currentDirectory, String[] args) {
		Resource newFile = new File();
		
		newFile.setName(args[1]);
		newFile.setPatch(currentDirectory.getPatch() + "/" + currentDirectory.getName());
		newFile.setContainer(currentDirectory);
		
		currentDirectory.getResourcesList().add(newFile);
		
		return str;
	}
}