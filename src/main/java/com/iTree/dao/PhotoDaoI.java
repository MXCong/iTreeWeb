package com.iTree.dao;

import com.iTree.model.Image;

public interface PhotoDaoI extends BaseDaoI<Image> {
	Image findByPath(String StoragePath);
}
