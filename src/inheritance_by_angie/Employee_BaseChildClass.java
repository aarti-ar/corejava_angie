package inheritance_by_angie;

public class Employee_BaseChildClass extends Person_ParentSuperClass{
    private String employedId;
    private String title;

    public String getEmployedId() {
        return employedId;
    }

    public void setEmployedId(String employedId) {
        this.employedId = employedId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
