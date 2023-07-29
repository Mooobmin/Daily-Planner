package com.dailyplanner.notepad.domain;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class NotepadResponse {
    Long seq;                           //PK
    String title;                       //제목
    String content;                     //내용
    String writer;                      //작성자
    int viewCnt;                        //조회수
    boolean noticeYn;                   //상단고정 여부
    boolean fixationYn;                 //공유 여부
    boolean deleteYn;                   //삭제 여부
    LocalDateTime createdDate;          //등록일
    LocalDateTime modifiedDate;         //삭제일 or 수정일
}
