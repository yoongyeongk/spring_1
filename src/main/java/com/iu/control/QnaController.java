package com.iu.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.iu.qna.QnaDTO;

@Controller
@RequestMapping(value="/qna/*")
public class QnaController {

	@RequestMapping(value="qnaList", method={RequestMethod.GET, RequestMethod.POST})
	public ModelAndView list(ModelAndView mv, @RequestParam(defaultValue="0", required=false)int curPage){
		QnaDTO qnaDTO = new QnaDTO();
		qnaDTO.setTitle("test");
		qnaDTO.setWriter("choa");
		qnaDTO.setAge(29);
		mv.addObject("view", qnaDTO);
		mv.setViewName("qna/qnaList");
		System.out.println(curPage);
		
		return mv;
	}
	
	@RequestMapping(value="qnaView")
	public String view(Model model){
		QnaDTO qnaDTO = new QnaDTO();
		qnaDTO.setTitle("test");
		qnaDTO.setWriter("choa");
		qnaDTO.setAge(29);
		model.addAttribute("view", qnaDTO).addAttribute("board", "Qna");
		
		return "qna/qnaView";
	}
	
	@RequestMapping(value="qnaWrite", method=RequestMethod.GET)
	public void write(){
	}
	
	@RequestMapping(value="qnaWrite", method=RequestMethod.POST)
	public String write(QnaDTO qnaDTO){
		System.out.println(qnaDTO.getTitle());
		System.out.println(qnaDTO.getWriter());
		System.out.println(qnaDTO.getAge());
		for(String s: qnaDTO.getName()){
			System.out.println(s);
		}
		return "redirect:./qnaList";
	}
}
