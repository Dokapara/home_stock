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
	// メモのデータを格納するArrayListを定義します。
	static ArrayList<ArrayList> data = new ArrayList<ArrayList>();
	// メモの最大数を定義します。
	static final int max = 10;
	// メモにGETアクセスがあった場合の処理を定義します。
	@GetMapping("/memo")
	public ModelAndView index(ModelAndView mv) {
		// ModelAndViewオブジェクトを作成します。
		mv.setViewName("memo"); // memo.htmlを表示するように指定します。
		mv.addObject("title", "Memo"); // HTMLファイルに渡すタイトルを指定します。
		mv.addObject("data", MemoController.data); // メモデータをHTMLファイルに渡します。
		return mv; // ModelAndViewオブジェクトを返します。
	}
	// メモのフォーム送信があった場合の処理を定義します。
	@PostMapping("/memoed")
	public ModelAndView form(@RequestParam("memo") String memo, ModelAndView mv) {
		// 新しいメモを作成します。
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(memo); // フォームから受け取ったメモの内容を追加します。
		list.add(Calendar.getInstance().getTime()); // 現在の日時を追加します。
		data.add(0, list); // メモデータリストの先頭に追加します。
		// メモの数が最大数を超えている場合、古いメモを削除します。
		if (data.size() > max) {
			data.remove(max);
		}
		return index(mv); // index() メソッドを呼び出してHTMLページを再描画します。
	}
}