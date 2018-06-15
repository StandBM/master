package com.zb.controller;

        import com.zb.entity.Student;
        import com.zb.service.ClassService;
        import com.zb.service.StudentService;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.RequestMapping;

        import javax.annotation.Resource;
        import java.util.List;

@Controller
public class StudentController {
    @Resource
    private StudentService studentService;
    @Resource
    private ClassService classService;

    @RequestMapping("/index.do")
    public String index(Model model){
        List<Student> stu = studentService.findAll();

        model.addAttribute("stu",stu);
        return "list";
    }

    @RequestMapping("/findClass.do")
    public String add(Model model){
        List<Class> classes = classService.findClass();
        System.out.println(classes);
        model.addAttribute("classes",classes);
        return "add";
    }

    @RequestMapping("/add.do")
    public String addInfo(Student student){
        studentService.insert(student);
        return "redirect:index.do";
    }
}