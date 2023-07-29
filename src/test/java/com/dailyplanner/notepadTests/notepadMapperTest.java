package com.dailyplanner.notepadTests;

import com.dailyplanner.notepad.domain.NotepadMapper;
import com.dailyplanner.notepad.domain.NotepadRequest;
import com.dailyplanner.notepad.domain.NotepadResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class notepadMapperTest {

    @Autowired
    NotepadMapper notepadMapper;

    @Test
    @DisplayName("게시글 리스트 조회")
    void listAll(){
        List<NotepadResponse> lists = notepadMapper.notepadListAll();
        System.out.println(lists);
    }

    @Test
    @DisplayName("게시글 등록")
    void noteSave(){
        NotepadRequest params = new NotepadRequest();
        params.setTitle("테스트 제목");
        params.setContent("테스트 내용");
        params.setWriter("테스트 작성자");
        params.setNoticeYn(false);
        params.setFixationYn(false);
        notepadMapper.notepadSave(params);
    }


}
