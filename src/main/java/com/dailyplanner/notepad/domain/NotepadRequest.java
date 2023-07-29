package com.dailyplanner.notepad.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class NotepadRequest {
    Long seq;                       //PK
    String title;                   //제목
    String content;                 //내용
    String writer;                  //작성자
    boolean noticeYn;               //상단고정여부
    boolean fixationYn;             //공유여부

}
