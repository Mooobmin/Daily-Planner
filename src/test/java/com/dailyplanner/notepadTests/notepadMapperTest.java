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
    @DisplayName("메모 리스트 조회")
    void listAll(){
        List<NotepadResponse> lists = notepadMapper.notepadListAll();
        System.out.println(lists);
    }

    @Test
    @DisplayName("메모 상세 조회")
    void listDetail(){
        notepadMapper.notepadDetailById(2L);
    }

    @Test
    @DisplayName("메모 조회수")
    void noteViewCnt(){
        notepadMapper.updateViewCnt(3L);
    }

    @Test
    @DisplayName("메모 전체 갯수 조회")
    void noteCount(){
        notepadMapper.notepadCount();
    }

    @Test
    @DisplayName("메모 등록")
    void noteSave(){
        NotepadRequest params = new NotepadRequest();
        params.setTitle("테스트 제목1");
        params.setContent("테스트 내용1");
        params.setWriter("테스트 작성자1");
        params.setNoticeYn(false);
        params.setFixationYn(false);
        notepadMapper.notepadSave(params);
    }


    @Test
    @DisplayName("메모 수정")
    void noteUpdate(){
        NotepadRequest params = new NotepadRequest();
        params.setTitle("테스트 수정 제목1");
        params.setContent("테스트 수정 내용1");
        params.setWriter("테스트 수정 작성자1");
        params.setNoticeYn(true);
        params.setFixationYn(true);
        params.setSeq(2L);
        notepadMapper.notepadUpdate(params);
    }

    @Test
    @DisplayName("메모 삭제")
    void noteDelete(){
        notepadMapper.notepadDelete(2L);
    }





}
