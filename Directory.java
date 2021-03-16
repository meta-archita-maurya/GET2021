package vcmd;

import java.util.ArrayList;
import java.util.Date;

//Node of a directory
class Directory{
	String directoryName; //Name of the folder
	String timestamp;   //timestamp of the creation of the folder
	ArrayList<Directory> subDirectories; //SubDirectories of a folder
	Directory parent;  //conatins the address of node of the parent dir
	Directory(String directoryName,Directory parent){
		this.directoryName = directoryName;
		this.timestamp = new Date().toString();
		this.subDirectories = new ArrayList<>();
		this.parent = parent;
		
	}
}

