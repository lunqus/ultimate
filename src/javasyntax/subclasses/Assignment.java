package javasyntax.subclasses;

import java.util.Date;

public class Assignment {

    private String mName, mClassName;
    private Date mAssignmentDueDate;

    public Assignment(String name, String className, Date assignmentDueDate) {

        mName = name;
        mClassName = className;
        mAssignmentDueDate = assignmentDueDate;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getClassName() {
        return mClassName;
    }

    public void setClassName(String mClassName) {
        this.mClassName = mClassName;
    }

    public Date getAssignmentDueDate() {
        return mAssignmentDueDate;
    }

    public void setAssignmentDueDate(Date mAssignmentDueDate) {
        this.mAssignmentDueDate = mAssignmentDueDate;
    }
}
