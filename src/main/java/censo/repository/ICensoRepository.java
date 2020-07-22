package censo.repository;


import java.util.List;


import censo.model.Censo;

public interface ICensoRepository{

	List<Censo> findPacienteProntuario(String censo);

}