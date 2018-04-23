package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FileModel {

@Id
 int id;
String str;
public FileModel(String string) {}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

 

}
