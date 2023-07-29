package com.dailyplanner.notepadTests;

import com.dailyplanner.notepad.domain.NotepadRequest;
import com.dailyplanner.notepad.domain.NotepadResponse;
import com.dailyplanner.notepad.service.NotepadService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class notepadServiceTest {

    @Autowired
    NotepadService notepadService;

    @Test
    @DisplayName("메모 리스트 조회")
    void listAll(){
        List<NotepadResponse> lists = notepadService.notepadListAll();

        System.out.println(lists);
    }

    //조회수 같이 올라가는지 확인
    @Test
    @DisplayName("메모 상세 조회")
    void listDetail(){
        notepadService.notepadDetail(2L);
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
        notepadService.notepadSave(params);
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
        params.setSeq(3L);
        notepadService.notepadUpdate(params);
    }

    @Test
    @DisplayName("메모 삭제")
    void noteDelete(){
        notepadService.notepadDelete(3L);
    }
}
