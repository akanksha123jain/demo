package com.blog;

//import java.util.Arrays;
//import java.util.List;
//import java.util.function.Predicate;
//import java.util.stream.Collectors;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainUtil {
   public static void main(String[] args) {
//        Post post1 = new Post();
//        post1.setId(1);
//        post1.setTitle("aaa");
//
//        Post post2 = new Post();
//        post2.setId(2);
//        post2.setTitle("bbb");
//        post2.setContent("bbbb");
//
//        Post post3 = new Post();
//        post3.setId(3);
//        post3.setTitle("ccc");
//        post3.setContent("cccc");
//
//        List<Post> posts = Arrays.asList(post1,post2,post3);
//        List<PostDto> dtos = posts.stream().map(p->mapToDto(p) ).collect(Collectors.toList());
//
//        System.out.print(dtos);
//
//
//    }
//    static PostDto mapToDto(Post post){
//        PostDto dto = new PostDto();
//        dto.setId(post.getId());
//        dto.setTitle(post.getTitle());
//        dto.setContent(post.getContent());
//
//        return dto;
//
//

//        List<Employee> name = Arrays.asList(new Employee(2, "xyz"), new Employee(1, "abc"));
//       Employee employee = name.stream().max(Employee::compareTo).get();
//       Employee employee = name.stream().min(Employee::compareTo).get();
//       System.out.println(employee.getId());
//       System.out.println(employee.getName());

//       List<Employee> data = Arrays.asList(
//               new Employee("mike", 5000),
//               new Employee("stallin", 10000),
//               new Employee("adam", 5000)
//       );
//
//
//       Map<Double, List<Employee>> groups = data.stream().collect(Collectors.groupingBy(Employee::getSalary));
//
//       System.out.println(groups);
//
//       for (Map.Entry<Double, List<Employee>> entry : groups.entrySet()) {
//           Double salary = entry.getKey();
//           List<Employee> employeeList = entry.getValue();
//           System.out.println("Employees with salary " + salary+":");
//           for (Employee employee : employeeList) {
//               System.out.println("\t" + employee.getName());
//           }
//
//
//
//       }
//

      // result = (condition) ? expression1 : expression2;
//       int x = 100;
//       int y = 20;
//       int max=(x>y)?x:y;
//       System.out.println(max);
//

//       new MainUtil().test().test2();
//
//   }
//
//   public MainUtil test(){
//
//       return new MainUtil();
//   }
//   public void test2(){
//
//       System.out.println(200);


       PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
       System.out.println(passwordEncoder.encode("testing"));



 }

  }
