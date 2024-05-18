package class2;

public class VariableTest {
    long studentId;
    static String departmentName="EEE";

    public void printDepartmentName(){
        String studentName="RAHIM";
        System.out.println(studentName+ " department name " +departmentName + " ID " +studentId);
    }
    public void printMark (){
        int mark=80;
        System.out.println("Mark "+mark);
    }

    public static void main(String[] args) {
        System.out.println(VariableTest.departmentName);

        VariableTest test1=new VariableTest();
        test1.studentId=202402001;
        test1.printMark();
        test1.printDepartmentName();


        VariableTest test2=new VariableTest();
        test2.studentId=202402002;
        test2.printMark();
        test2.printDepartmentName();

    }
}
