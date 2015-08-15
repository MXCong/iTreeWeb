package com.iTree.daoImpl;

import org.springframework.stereotype.Repository;

import com.iTree.dao.FileTableDaoI;
import com.iTree.model.FileTable;
@Repository("fileTableDao")
public class FileTableDaoImpl extends BaseDaoImpl<FileTable> implements
FileTableDaoI {

}
