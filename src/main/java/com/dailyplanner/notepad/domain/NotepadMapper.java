package com.dailyplanner.notepad.domain;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NotepadMapper {

    //메모 전체 조회
    List<NotepadResponse> notepadListAll();

    //메모 상세 조회
    NotepadResponse notepadDetailById(Long seq);

    //메모 등록
    void notepadSave(NotepadRequest params);

    //메모 수정
    void notepadUpdate(NotepadRequest params);

    //메모 삭제
    void notepadDelete(Long seq);

    //등록된 메모 갯수 조회
    int notepadCount();

    //조회수 증가
    void updateViewCnt(Long id);



}
