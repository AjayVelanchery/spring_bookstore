package com.bookstore.bookstore.service;


import com.bookstore.bookstore.entity.MyBookList;
import com.bookstore.bookstore.repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookListService {

  @Autowired
    private MyBookRepository mybook;
    public void saveMyBooks(MyBookList book){

        mybook.save(book);
    }
public List<MyBookList> getAllMyBooks(){
        return mybook.findAll();
    }

    public  void deleteById(int id){
        mybook.deleteById(id);
    }

}
