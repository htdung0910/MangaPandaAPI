package com.example.demo.service;

import com.example.demo.Entity.BookEntity;
import com.example.demo.Entity.BookProcessEntity;
import com.example.demo.Entity.ChapterEntity;
import com.example.demo.Entity.ReturnEntity.ReturnUserEntity;
import org.springframework.data.domain.Page;

import java.util.*;

public interface BookService {

    /**
     * Trả về list các title của tất cả manga
     * */
    List<String> getAllTitile();

    /**
     * Trả về list các manga có chứa title
     * */
    List<BookEntity> getMangaByTitle(String title);

    /**
     * Top 10 manga có lượt vote cao nhất
     * */
    List<BookEntity> getHottestManga();

    /**
     * Trả về 1 manga dựa vào id,null nếu ko tìm ra
     * */
    BookEntity getByID(String id);

    /**
     * Trả về 1 chapter,rồi từ entity chapter này lấy list các image của nó
     * */
    List<String> getImagesByChapterID(String chapterID);

    /**
     * Trả về những chapter của manga này
     */
    List<ChapterEntity> getChaptersByBookID(String bookID);

    /**
     * Trả về Top {quantity} book rate cao nhất theo {genreID}
     *
     * */
    List<BookEntity> getBookByGenres(int quantity,int genreID);

    /**
     * Trả về info between user and book
     *{username}
     * {bookid}
     * */
    BookProcessEntity getInfoUserBetweenBook(String username, String bookID);

    /**
     * Save BookProcessEntity(Add, update)
     *
     * */
    void saveBookProcessEntity(BookProcessEntity bpEntity);

    /**
     * Save BookEntity(Add, update)
     *
     * */
    void saveBookEntity(BookEntity bEntity);

    /**
     * Trả về list recommend book for each user.
     *
     * */
    List<BookEntity> getRecommend(String username);

    /**
     * Trả về list book follow by each user.
     *
     * */
    List<BookEntity> getFollow(String username);

    /**
     * Trả về list top user by book post rate.
     *
     * */
    List<ReturnUserEntity> getTopUserPostBook();

    /**
     * Trả về list top 10 book recent upload
     *
     * */
    List<BookEntity> getTop10ListMangaOrderByUploadDate();

    Page<BookEntity> getVipBook(int page, int size);
}
