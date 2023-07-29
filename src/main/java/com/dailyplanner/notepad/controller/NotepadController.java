package com.dailyplanner.notepad.controller;

import com.dailyplanner.notepad.domain.NotepadRequest;
import com.dailyplanner.notepad.domain.NotepadResponse;
import com.dailyplanner.notepad.service.NotepadService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dailyplanner/*")
@RequiredArgsConstructor
public class NotepadController {

    private final NotepadService notepadService;

    //메모 전체 조회
    @GetMapping("notelist.do")
    public String notepadListAll(NotepadResponse notelists, Model model){
        notepadService.notepadListAll();
        model.addAttribute("notelists", notelists);

        return "dailyplanner/notepad/notelist";
    }

    //메모 작성 페이지 이동
    @GetMapping("notewrite.do")
    public String notepadWrite(){
        return "dailyplanner/notepad/notewrite";
    }

    //메모 작성 기능
    @PostMapping("notesave.do")
    public String notepadSave(final NotepadRequest params){
        notepadService.notepadSave(params);

        return "dailyplanner/notepad/notelist";
    }

    //메모 수정
    @PostMapping("noteupdate.do")
    public String notepadUpdate(final NotepadRequest params){
        notepadService.notepadUpdate(params);

        return "dailyplanner/notepad/notelist";
    }

    //메모 삭제
    @PostMapping("notedelete.do")
    public String notepadDelete(final Long seq){
        notepadService.notepadDelete(seq);

        return "dailyplanner/notepad/notelist";
    }

}
