//package org.example.cloning;
//
//class JbkJob {
//    String task1;
//    String task2;
//    String task3;
//
//    public JbkJob(String task1, String task2, String task3) {
//        this.task1 = task1;
//        this.task2 = task2;
//        this.task3 = task3;
//    }
//}
//
//class JbkEmployee implements Cloneable {
//    int id;
//    String name;
//    JbkJob job;
//
//    public JbkEmployee(int id, String name, JbkJob job) {
//        this.id = id;
//        this.name = name;
//        this.job = job;
//    }
//
//    // Default version of clone() method. It creates shallow copy of an object.
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//}
//class JbkShallowCopy {
//    public static void main(String[] args) {
//        JbkJob dataentry = new JbkJob("Type", "Print", "Scan");
//        JbkEmployee jbkemployee1 = new JbkEmployee(01, "John", dataentry);
//        JbkEmployee jbkemployee2 = null;
//        try {
//            // Creating a clone of employee1 and assigning it employee2
//            jbkemployee2 = (JbkEmployee) jbkemployee1.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        // Printing the task3 of employee1
//        System.out.println("Task3 of jbkemployee1 is = " + jbkemployee1.job.task3); // Output:-Scan
//        // Change the task3 of employee2
//        jbkemployee2.job.task3 = "PhotoCopy";
//        // this change will be reflected in original employee 'employee1'
//        // Printing the task3 of employee1
//        System.out.println("Task3 of jbkemployee1 is = " + jbkemployee1.job.task3); // Output:-Photocopy
//    }
//}