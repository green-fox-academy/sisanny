package com.greenfoxexample.mentors.conrtollers;

import com.greenfoxexample.mentors.models.Mentor;
import com.greenfoxexample.mentors.services.MentorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {
    final
    MentorService mentorService;

    public MainRestController(MentorService mentorService) {
        this.mentorService = mentorService;
    }

    @GetMapping(path = "/api/mentors")
    public Object getMentorsFromClass(@RequestParam(name = "className") String className) {
        if (className.equals("really")) {
            return mentorService.makeMentorDTOList(mentorService.findAllReally(mentorService.findAll()));
        }
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PutMapping(path = "/api/mentors/{mentorId}")
    public Object updateMentors(@RequestBody Mentor mentor, @PathVariable int mentorId) {
        if(mentorId != mentor.getId()) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        } else if(!mentorService.isCorrectClassName(mentor.getClassName())) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        } else {
            mentorService.findById(mentorId).setClassName(mentor.getClassName());
            mentorService.findById(mentorId).setName(mentor.getName());
            mentorService.save(mentorService.findById(mentorId));
            return new ResponseEntity(HttpStatus.OK);
        }
    }

    @DeleteMapping(path = "/api/mentors/{mentorId}")
    public Object deleteMentor(@PathVariable int mentorId) {
        if(mentorService.exist(mentorId)) {
            mentorService.deleteById(mentorId);
            return new ResponseEntity(HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
}
