package com.two.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.two.common.Constants;
import com.two.common.Result;
import com.two.dao.BookDao;
import com.two.dao.RecordsDao;
import com.two.dao.UserDao;
import com.two.entity.Book;
import com.two.entity.Records;
import com.two.entity.User;
import com.two.service.IBookService;
import com.two.service.IUserService;
import com.two.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {
    @Autowired
    UserDao userDao;

    @Autowired

    BookDao bookDao;
    @Autowired

    RecordsDao recordsDao;
    @Autowired

    RecordService recordService;

    @Override
    public Result changeUser(User user) {
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id",user.getId());
        User one = getOne(queryWrapper);
        if(one == null){
            return Result.error(Constants.CODE_400,"修改失败");
        }else {
            update(user, queryWrapper);
            return Result.success(Constants.CODE_200,"修改成功");
        }
    }
//查询某个人所借的书籍
    @Override
    public List<Book> queryAllBook(Integer id)throws NullPointerException {
        List<Book> allBooks = new ArrayList<Book>();
       List<Records>recordsList=userDao.getByUserId(id);
       List<Integer>bookIds=new ArrayList<>();
//     获得书籍的所有bookId信息
       for (int i=0;i<recordsList.size();i++){
           bookIds.add(recordsList.get(i).getBookId());
       }

       QueryWrapper<Book>bookQueryWrapper=new QueryWrapper<>();
       for (int i=0;i<bookIds.size();i++) {
           bookQueryWrapper.eq("id", bookIds.get(i));
               List<Book> Books = bookDao.selectList(bookQueryWrapper);
//           把对应的book记录传递到最终的函数值中去
               for (int j = 0; i < Books.size(); j++)
                   allBooks.add(Books.get(i));

       }
        return allBooks;
    }

    @Override
    public void state(User user) {
        QueryWrapper<Records> wrapper = new QueryWrapper<>();
        wrapper.eq("user_id",user.getId());
        long num = recordService.count(wrapper);
        if(num >= 10){
            user.setState(0);
            userDao.updateById(user);
        }else {
            user.setState(1);
            userDao.updateById(user);
        }
    }
//用户借书
    @Override
    public Result borrowBook( Integer book_id,Integer user_id) {
       Records record=new Records();
       record.setBookId(book_id);
       record.setUserId(user_id);
       Integer result=recordsDao.insert(record);
//insert中为影响行数，如果是影响多行就为成功
        if(result>=1){
            return Result.success(Constants.CODE_200,"借书成功");}
        else {
        return Result.error(Constants.CODE_400,"借书失败");}

    }
//    用户还书
@Override
    /*
    * 按条件封装删除 用map封装
    * 使用两个条件去封装，对应出一个确定的记录
    *   recordsDao.deleteById(book_id);该种方式存在删除多条的风险*/
    public Result returnBook(Integer book_id, Integer user_id){
        Records records=new Records();
        records.setUserId(user_id);
        records.setBookId(book_id);
        HashMap<String,Object> map = new HashMap<>();
        map.put("book_id",records.getBookId());
        map.put("user_id",records.getUserId());
        Integer result=recordsDao.deleteByMap(map);
//deleteByMap，如果是影响多行就为成功
    if(result>=1){
        return Result.success(Constants.CODE_200,"借书成功");}
    else {
        return Result.error(Constants.CODE_400,"借书失败");}
    }

}
