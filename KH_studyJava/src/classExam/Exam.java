package classExam;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Exam {

    int examId;
    String name;
    int kor;
    int mat;
    int totalScore;
    double avgScore;
    int rank;
}
