package all.service;

import all.model.Teacher;

import java.util.Optional;

public interface TeacherService {

    public Optional<Teacher> findById(int teacherID);
}
