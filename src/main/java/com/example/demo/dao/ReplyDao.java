package com.example.demo.dao;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

import com.example.demo.domain.*;

@Component
@Mapper
public interface ReplyDao {
   @Select("select * from reply where comment_id=#{comment_id}")
   List<Reply> findReply(int comment_id);
   @Insert("insert into reply (reply,comment_id,date) values (#{reply},#{comment_id},#{date})")
   int addReply(Reply reply);
}
