package com.example.todo.model;

import com.example.todo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;


public class TodoRowMapper implements RowMapper<Todo>{

	@Override
	public Todo mapRow(ResultSet rs, int rowNum) throws SQLException {
		
	return new Todo(
            rs.getInt("id"),
            rs.getString("todo"),
            rs.getString("status"),
            rs.getString("priority"));
            
	}

}










