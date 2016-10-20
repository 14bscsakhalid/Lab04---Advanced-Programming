/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anas
 */
public class Prioritize {
    public static String[][] pArray = new String[702][2];
    
    public static void priorityAssign(String[] args)
    {
        for(int x = 0; x < 701; x++)
        {
            String data = CsvFile.myArray[x][2];
            switch(data){
                    case "New User Registration":
                        pArray[x][0] = "Medium";
                        break;
                    case "Lab Task Upload(5pm)":
                        pArray[x][0] = "Medium";
                        break;
                    case "Course Registration":
                        pArray[x][0] = "High";
                        break;
                    case "Lecture Preparation":
                        pArray[x][0] = "Medium";
                        break;
                    case "Data Backup(3am-4am)":
                        pArray[x][0] = "High";
                        break;
                    case "Assignment Upload":
                        pArray[x][0] = "Medium";
                        break;
                    case "Lecture Download":
                        pArray[x][0] = "Medium";
                        break;
                    case "Assignment Submission(12am)":
                        pArray[x][0] = "High";
                        break;
                    case "Assignment Grading":
                        pArray[x][0] = "Low";
                        break;
                    case "Quiz Grading":
                        pArray[x][0] = "Low";
                        break;
                    case "1st Student Feedback":
                        pArray[x][0] = "Low";
                        break;
                    case "2nd Student Feedback":
                        pArray[x][0] = "Low";
                        break;
                    case "Project Upload Link Creation":
                        pArray[x][0] = "Medium";
                        break;
                    case "Project Submission":
                        pArray[x][0] = "High";
                        break;
                    case "Project Grading":
                        pArray[x][0] = "Low";
                        break;
                    case "ESE GuidLine Update":
                        pArray[x][0] = "Low";
                        break;
                    case "Final Grading":
                        pArray[x][0] = "High";
                        break;
                    case "Student Result Comments":
                        pArray[x][0] = "Medium";
                        break;
                    case "Maintenance":
                        pArray[x][0] = "High";
                        break;
                    case "Data Backup(1am-2am)":
                        pArray[x][0] = "High";
                        break;
                        
            }
                    
        }
    }
    
}
