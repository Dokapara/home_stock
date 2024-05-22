package com.example.demo;
import java.util.ArrayList;
import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MemoController {
	// �����̃f�[�^���i�[����ArrayList���`���܂��B
	static ArrayList<ArrayList> data = new ArrayList<ArrayList>();
	// �����̍ő吔���`���܂��B
	static final int max = 10;
	// ������GET�A�N�Z�X���������ꍇ�̏������`���܂��B
	@GetMapping("/memo")
	public ModelAndView index(ModelAndView mv) {
		// ModelAndView�I�u�W�F�N�g���쐬���܂��B
		mv.setViewName("memo"); // memo.html��\������悤�Ɏw�肵�܂��B
		mv.addObject("title", "Memo"); // HTML�t�@�C���ɓn���^�C�g�����w�肵�܂��B
		mv.addObject("data", MemoController.data); // �����f�[�^��HTML�t�@�C���ɓn���܂��B
		return mv; // ModelAndView�I�u�W�F�N�g��Ԃ��܂��B
	}
	// �����̃t�H�[�����M���������ꍇ�̏������`���܂��B
	@PostMapping("/memoed")
	public ModelAndView form(@RequestParam("memo") String memo, ModelAndView mv) {
		// �V�����������쐬���܂��B
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(memo); // �t�H�[������󂯎���������̓��e��ǉ����܂��B
		list.add(Calendar.getInstance().getTime()); // ���݂̓�����ǉ����܂��B
		data.add(0, list); // �����f�[�^���X�g�̐擪�ɒǉ����܂��B
		// �����̐����ő吔�𒴂��Ă���ꍇ�A�Â��������폜���܂��B
		if (data.size() > max) {
			data.remove(max);
		}
		return index(mv); // index() ���\�b�h���Ăяo����HTML�y�[�W���ĕ`�悵�܂��B
	}
}