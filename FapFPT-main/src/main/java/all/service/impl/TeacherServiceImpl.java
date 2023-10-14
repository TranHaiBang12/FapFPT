package all.service.impl;

import all.model.Teacher;
import all.repository.TeacherRepository;
import all.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherRepository teacherRepository;
    @Override
    public Optional<Teacher> findById(int teacherID) {
        return teacherRepository.findById(teacherID);
    }
}
