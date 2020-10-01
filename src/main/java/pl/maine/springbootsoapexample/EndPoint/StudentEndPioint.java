package pl.maine.springbootsoapexample.EndPoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pl.maine.springbootsoapexample.Service.StudentService;
import pl.maine.springbootsoapexample.student.GetStudent;
import pl.maine.springbootsoapexample.student.GeteResponse;
import pl.maine.springbootsoapexample.student.Student;

@Endpoint
public class StudentEndPioint {
    @Autowired
    private StudentService studentService;



    @PayloadRoot(namespace = "Example-Name-Space" , localPart = "getStudent")
    @ResponsePayload
  public GeteResponse getStudentById(@RequestPayload GetStudent getStudent){
        Student student =  studentService.getStudentList(getStudent.getId());
        GeteResponse geteResponse = new GeteResponse();
        geteResponse.setStudent(student);
        return  geteResponse;
    };
}
