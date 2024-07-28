package xuk.fhffds.Controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;
import xuk.fhffds.dto.EmployeeDto;
import xuk.fhffds.entities.EmployeeEnities;
import xuk.fhffds.repositories.EmployeeRepository;
import java.time.LocalDate;
import java.util.List;
@RestController
@RequestMapping("/Employee")
public class EmployeeController {
/*
//@GetMapping("/secretMessage")
//public String secrit()
//{
//    return "this is the secret message !";
//}
///////////////-----------------////////////////////////////////////////......................./////////////////////////////////////////////////////
*/
//////////////----------------/////////////////////////////////////////------------------------///////////////////////////////////////////////////////
    private final EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @GetMapping(path="/{emplooyeId}")
    public EmployeeEnities employeeDto(@PathVariable (name="employeeId") Long id){
        return employeeRepository.findById(id).orElse(null);
    }
    @GetMapping
    public List<EmployeeEnities>getAllEmployees(@RequestParam (required = false,name="inputage")Integer age){
        return employeeRepository.findAll();
    }
@PostMapping
 public EmployeeEnities craeeNeEmployee(@RequestBody EmployeeEnities employeeEnities){
return  employeeRepository.save(employeeEnities);
}

/*
//    @GetMapping("/{employeID}")
//    public EmployeeDto employee(@PathVariable Long employeID){
//    return new EmployeeDto(employeID,"hamza","suhail@123gmail.com",12, LocalDate.of(2024,2,22));
//}
//
//
//    @GetMapping("/{employeeId}")
//    public EmployeeDto employee(@PathVariable (name="employeeId") long id){
//        return new EmployeeDto(id,"hamza malik","suhailmalik@gmail.com",33,LocalDate.of(2024,3,3));
//    }
//    @GetMapping("/{employeeName}")
//    public EmployeeDto employee(@PathVariable (name="employeeName")String name){
//        return new EmployeeDto(12L,name,"hamza@gmail.com",33,LocalDate.of(2024,2,10));
//    }
//    @GetMapping("/{employeeMail}")
//    public EmployeeDto getdata(@PathVariable(name="employeeMail")
//                               String mail){
//        return new EmployeeDto(33L,"hamza",mail,22,LocalDate.of(2024,9,25));
//    }
//@GetMapping
//    public String getEmployeesAge(@RequestParam (required = false) double age,
//@RequestParam  (required = false) String name){
//    return "my age is"+age+" "+name;
//}
//@GetMapping
//    public String getData(@RequestParam (required = false, name="inputage") int id){
//        return "hamza malik from jammu and kashmir"+" "+id;
//}
//    @GetMapping
//    public String ayaa(){
//        return "ayman get s the work.....";
//    }
////@PostMapping
////    public String ayman(){
////        return "ayman is gs xoor";
////}
////@PostMapping
////@Scope
////    public String ayama(){
////        return "ayman is yawning";
////}
////@PostMapping("/youtube.com")
////    public String youtube(){
////        return "welcome tto youtube...."+" www.youtube.com";
////}
//    @PostMapping
//    public EmployeeDto getData(@RequestBody EmployeeDto inputEmployeeDto){
//        inputEmployeeDto.setId(100L);
//        return inputEmployeeDto;
//    }
//
//@PutMapping
//    public int hamza(){
//        return 99999;
//}
*/



}
