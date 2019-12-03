package com.codeclan.example.FileSystem;

import com.codeclan.example.FileSystem.models.File;
import com.codeclan.example.FileSystem.models.Folder;
import com.codeclan.example.FileSystem.repositories.FileRepository;
import com.codeclan.example.FileSystem.repositories.FolderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FileSystemApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createFileAndFolder(){
		Folder documents = new Folder("Documents");
		folderRepository.save(documents);

		File cv = new File("Curriculm Vitae", "doc", 12, documents);
		fileRepository.save(cv);
	}
}
