package com.dailyplanner.notepad.service;

import com.dailyplanner.notepad.domain.NotepadMapper;
import com.dailyplanner.notepad.domain.NotepadRequest;
import com.dailyplanner.notepad.domain.NotepadResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NotepadService {
    private final NotepadMapper notepadMapper;


    //메모 전체 조회
    public List<NotepadResponse> notepadListAll(){
        return notepadMapper.notepadListAll();
    }

    //메모 상세 조회
    public NotepadResponse notepadDetail(Long seq){
        notepadMapper.updateViewCnt(seq);
        return notepadMapper.notepadDetailById(seq);
    }

    //메모 등록
    public Long notepadSave(NotepadRequest params){
        notepadMapper.notepadSave(params);

        return params.getSeq();
    }

    //메모 수정
    public Long notepadUpdate(NotepadRequest params){
        notepadMapper.notepadUpdate(params);

        return params.getSeq();
    }

    //메모 삭제
    public Long notepadDelete(Long seq){
        notepadMapper.notepadDelete(seq);

        return seq;
    }



}
