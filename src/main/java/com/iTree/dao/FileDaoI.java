package com.iTree.dao;

import com.iTree.model.File;

public interface FileDaoI extends BaseDaoI<File> {
	File findByPath(String filePath);
}
