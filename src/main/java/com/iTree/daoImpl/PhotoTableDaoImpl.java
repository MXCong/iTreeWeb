package com.iTree.daoImpl;

import org.springframework.stereotype.Repository;

import com.iTree.dao.PhotoTableDaoI;
import com.iTree.model.PhotoTable;
@Repository("photoTableDao")
public class PhotoTableDaoImpl extends BaseDaoImpl<PhotoTable> implements
PhotoTableDaoI {

}
