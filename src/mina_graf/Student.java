package InsertionTest;

import java.util.Queue;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Student 
{
	private String name;
	private double averageGrade;
	private int number;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAverageGrade() {
		return averageGrade;
	}
	public void setAverageGrade(double averageGrade) {
		this.averageGrade = averageGrade;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	//O(n2) 
	public void selectionSort(Queue<Student> students)
	{
		int n = students.size();
		Student[] arr = (Student[]) students.toArray();
		
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j].getAverageGrade() < arr[min_idx].getAverageGrade())
                    min_idx = j;
  
            Student temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        students.clear();
        for(Student student : arr)
        {
        	students.add(student);
        }
	}
	
	//O(n*Log n) 
	 void merge(Queue<Student> students, int l, int m, int r)
	    {
		 	Student[] arr = (Student[]) students.toArray();
	        int n1 = m - l + 1;
	        int n2 = r - m;
	        
	        Student L[] = new Student[n1];
	        Student R[] = new Student[n2];
	        
	        for (int i = 0; i < n1; ++i)
	            L[i] = arr[l + i];
	        for (int j = 0; j < n2; ++j)
	            R[j] = arr[m + 1 + j];
	        
	        int i = 0, j = 0;
	        int k = l;
	        while (i < n1 && j < n2) {
	            if (L[i].getNumber() >= R[j].getNumber()) {
	                arr[k] = L[i];
	                i++;
	            }
	            else {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }
	        while (i < n1) {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }
	 
	        while (j < n2) {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	        students.clear();
	        for(Student student : arr)
	        {
	        	students.add(student);
	        }
	    }
	 
	  
	    void sortMerge(Queue<Student> students, int l, int r)
	    {
	    	Student[] arr = (Student[]) students.toArray();
	        if (l < r) {
	            int m =l+ (r-l)/2;
	 
	            sortMerge(students, l, m);
	            sortMerge(students, m + 1, r);
	            merge(students, l, m, r);
	        }
	    }
	public void printAvgGrade(Student[] students)
	{
		double sum = 0;
		for(Student st : students)
		{
			sum+=st.getAverageGrade();
		}
		System.out.println(sum/students.length);
	}
	public static void main(String [ ] args)
	{
	    JFrame mainFrame = new JFrame();
	    JButton addElelement = new JButton();
	    JButton sortByGrade = new JButton();
	    JButton sortByNumber = new JButton();
	    JButton infoOutput = new JButton();
	}
}