/**
 **************************************************************************************
 *** CommentRowMapper.java                                                          ***
 *** Generator: net.anotheria.asg.generator.model.db.PersistenceServiceDAOGenerator ***
 *** generated by AnoSiteGenerator (ASG), Version: 1.3.3                            ***
 *** Copyright (C) 2005 - 2010 Anotheria.net, www.anotheria.net                     ***
 *** All Rights Reserved.                                                           ***
 **************************************************************************************
 *** Don't edit this code, if you aren't sure                                       ***
 *** that you do exactly know what you are doing!                                   ***
 *** It's better to invest time in the generator, as into the generated code.       ***
 **************************************************************************************
 */

package org.anotheria.moskitodemo.annotation;

import net.anotheria.db.dao.RowMapper;
import net.anotheria.db.dao.RowMapperException;
import org.anotheria.moskitodemo.annotation.data.Comment;
import org.anotheria.moskitodemo.annotation.data.CommentVO;
import org.apache.log4j.Logger;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CommentRowMapper extends RowMapper<Comment>{

	private static Logger log = Logger.getLogger(CommentRowMapper.class);

	public Comment map(ResultSet row) throws RowMapperException {
		try {
			long id = row.getLong(1);
			Comment ret = new CommentVO(""+id);
			ret.setFirstName(row.getString(2));
			ret.setLastName(row.getString(3));
			ret.setEmail(row.getString(4));
			ret.setText(row.getString(5));
			ret.setTimestamp(row.getLong(6));
			ret.setWishesUpdates(row.getBoolean(7));
			((CommentVO)ret).setDaoCreated(row.getLong(8));
			((CommentVO)ret).setDaoUpdated(row.getLong(9));
			return ret;
		}catch(SQLException e){
			log.error("map", e);
			throw new RowMapperException(e);
		}
	}
}