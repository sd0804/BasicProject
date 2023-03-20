package org.example.cloning;

class JbkJob1 implements Cloneable {
    String task1;
    String task2;
    String task3;

    public JbkJob1(String task1, String task2, String task3) {
        this.task1 = task1;
        this.task2 = task2;
        this.task3 = task3;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


class JbkEmployee1 implements Cloneable {
    int id;
    String name;
    JbkJob1 job;

    public JbkEmployee1(int id, String name, JbkJob1 job) {
        this.id = id;
        this.name = name;
        this.job = job;
    }

    // overriding clone() method to create a deep copy of an object.
    protected Object clone() throws CloneNotSupportedException {
        JbkEmployee1 employee = (JbkEmployee1) super.clone();
        employee.job = (JbkJob1) job.clone();
        return employee;
    }
}


class JbkDeepCopy {
    public static void main(String[] args) {
        JbkJob1 dataentry = new JbkJob1("Type", "Print", "Scan");
        JbkEmployee1 jbkemployee1 = new JbkEmployee1(01, "John", dataentry);
        JbkEmployee1 jbkemployee2 = null;
        try {
            // Creating a clone of employee1 and assigning it employee2
            jbkemployee2 = (JbkEmployee1) jbkemployee1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        // Printing the task3 of employee1
        System.out.println("Task3 of jbkemployee1 is = " + jbkemployee1.job.task3); // Output:-Scan
        // Change the task3 of employee2
        jbkemployee2.job.task3 = "PhotoCopy";
        // This change will not be reflected in original employee 'employee1'
        // Printing the task3 of employee1
        System.out.println("Task3 of jbkemployee1 is = " + jbkemployee1.job.task3); // Output:-Scan
    }
}