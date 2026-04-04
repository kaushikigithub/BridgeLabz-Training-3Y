class Student {
    public int rollNumber;       // Public
    protected String name;       // Protected
    private double CGPA;         // Private

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public methods to access private variable
    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void display() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", CGPA: " + CGPA);
    }
}

// Subclass demonstrating protected access
class PostgraduateStudent extends Student {
    private String thesisTopic;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTopic) {
        super(rollNumber, name, CGPA);
        this.thesisTopic = thesisTopic;
    }

    public void displayPGDetails() {
        // Accessing protected member 'name'
        System.out.println("Postgraduate Student: " + name + ", Thesis: " + thesisTopic);
    }
}
