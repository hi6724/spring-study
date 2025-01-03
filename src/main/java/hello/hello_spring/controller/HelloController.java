package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "안녕하세요 여기가 이제 잘 바뀔까요??>!>!");
        return "hello";
    }

    @GetMapping("hello-string")
    @ResponseBody
    public Person helloString(@RequestParam("name") String name) {
        Person person = new Person();
        person.setName(name + "입니다");
        person.setAge(28);
        return person;
    }

    public static class Person {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
