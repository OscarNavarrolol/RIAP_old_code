package com.sena.riap.service;

import com.sena.riap.entities.Attendance;
import com.sena.riap.entities.Program;

import java.util.List;

public interface ProgramService {

    public List<Program> getProgram();

    public Program saveProgram(Program program);

    public Program getProgramById(Long id);

    public Program updateProgram(Long id,Program program);

    public void deleteProgram (Long id);


}
